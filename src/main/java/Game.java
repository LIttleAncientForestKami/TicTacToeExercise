import board.Board;
import board.Mark;
import io.BoardPrinter;
import io.MessagePrinter;
import player.Player;
import player.PlayerChanger;

public class Game {
    private static final Integer MAX = 9;

    private final Board board = new Board();
    private final BoardPrinter boardPrinter = new BoardPrinter();
    private final MessagePrinter messagePrinter = new MessagePrinter();
    private final PlayerChanger playerChanger = new PlayerChanger();
    private final Player[] players = new Player[] {new Player("Player 1", Mark.O), new Player("Player 2", Mark.X)};

    public void play() {

        Mark currentMark = Mark.O;
        Player player = players[0];

        Integer current = 1;
        while (current <= MAX) {

            // change current mark
            if (!player.checkMark( currentMark )) {
                currentMark = currentMark.changeMark();
            }

            messagePrinter.printMessage(player);

            board.addAMove(current, currentMark);

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
