import tictactoegame.*;

import java.io.IOException;

public class GameEntryPoint {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        try {
            game.play();
        }
        catch (IOException e) {
            System.out.println("Unable to clear the console!");
        }
    }
}
