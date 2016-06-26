import board.Board;
import board.EmptyPositionLister;
import board.FieldAdder;
import board.Mark;
import io.BoardPrinter;
import io.MessagePrinter;
import player.Player;
import player.PlayerChanger;

import java.util.Set;
import java.util.TreeSet;

public class Game {
    private static final Integer MAX = 9;

    private final Board board = new Board();
    private final BoardPrinter boardPrinter = new BoardPrinter();
    private final MessagePrinter messagePrinter = new MessagePrinter();
    private final PlayerChanger playerChanger = new PlayerChanger();
    private final Player[] players = new Player[] {new Player("Player 1", Mark.O), new Player("Player 2", Mark.X)};

    private final EmptyPositionLister emptyLister = new EmptyPositionLister();
    private Set<Integer> emptyPositions = new TreeSet<>();

    private final FieldAdder fieldAdder = new FieldAdder();

    void play() {

        Mark currentMark = Mark.O;
        Player player = players[0];

        Integer current = 1;
        while (current <= MAX) {

            emptyPositions = emptyLister.listEmptyPositions(board);
            System.out.println(emptyPositions);

            // change current mark
            if (!player.checkMark( currentMark )) {
                currentMark = currentMark.changeMark();
            }

            messagePrinter.printMessage(player);


            fieldAdder.addField(board, current, currentMark);
     

            boardPrinter.printBoard(board);

            player = playerChanger.changePlayer(player, players[0], players[1]);

            ++current;
        }
    }

    public static void main(String[] args) {
        Game tttGame = new Game();
        tttGame.play();
    }
}
