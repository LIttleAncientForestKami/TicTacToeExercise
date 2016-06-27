package game;

import board.*;
import io.BoardPrinter;
import io.DrawPrinter;
import io.InputNumberTaker;
import player.Player;
import player.PlayerChanger;

import java.util.Set;
import java.util.TreeSet;

public class Game {
    private static final Integer MAX = 9;

    private Integer iteration = 1;

    private final Board board = Board.createBoard();
    private final BoardPrinter boardPrinter = new BoardPrinter();
    private final PlayerChanger playerChanger = new PlayerChanger();
    private final Player[] players = new Player[] {new Player("Player 1", Mark.O), new Player("Player 2", Mark.X)};

    private Player player = players[0];
    private Mark currentMark = Mark.O;

    private final EmptyPositionLister emptyLister = new EmptyPositionLister();
    private Set<Integer> emptyPositions = new TreeSet<>();

    private final InputNumberTaker inputNumberTaker = new InputNumberTaker();

    private final FieldAdder fieldAdder = new FieldAdder();





    // check if continue playing
    private boolean checkPlay() {
        return iteration <= MAX;
    }

    // increment iteration
    private void increment() {
        ++iteration;
    }

    // change mark
    private Mark changeCurrentMark() {
        if (!player.checkMark( currentMark )) {
            return currentMark.changeMark();
        }
        return currentMark;
    }

    // return new position
    private Integer newPosition() {
        emptyPositions = emptyLister.listEmptyPositions(board);
        return inputNumberTaker.collectValidData(player, emptyPositions);
    }

    // add field
    private void addNewField(Integer newPosition) {
        fieldAdder.addField(board, newPosition, currentMark);
    }

    // print the board
    private void printBoard() {
        boardPrinter.printBoard(board);
    }

    // check the draw
    private void draw() {
        if (iteration == MAX) {
            new DrawPrinter().drawInfo();
        }
    }

    // change player
    private Player changePlayer() {
        return playerChanger.changePlayer(player, players[0], players[1]);
    }

    // come play the game :)
    public void play() {
        // game main loop
        while (checkPlay()) {
            // change current mark
            currentMark = changeCurrentMark();
            // new position
            Integer newPosition = newPosition();
            // new field
            addNewField(newPosition);
            // print board
            printBoard();


            // check victory

            // check draw
            draw();
            //change current player
            player = changePlayer();
            //increment
            increment();
        }
    }
}
