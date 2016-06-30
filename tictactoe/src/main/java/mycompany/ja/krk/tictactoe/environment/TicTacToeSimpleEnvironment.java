package mycompany.ja.krk.tictactoe.environment;

import mycompany.ja.krk.tictactoe.arbiter.Arbiter;
import mycompany.ja.krk.tictactoe.graphic.GraphicalViewer;
import mycompany.ja.krk.tictactoe.map.Shape;
import mycompany.ja.krk.tictactoe.map.TicTacToeMap;
import mycompany.ja.krk.tictactoe.map.TicTacToeSimpleMap;

/**
 * Created by e.golesor@gmail.com on 24.06.16.
 */
public class TicTacToeSimpleEnvironment implements Environment {

    private final Arbiter arbiter;
    private final GraphicalViewer console;
    private final TicTacToeMap map;

    public TicTacToeSimpleEnvironment(Arbiter arbiter, GraphicalViewer console, TicTacToeMap map) {
        this.arbiter = arbiter; // to control the game
        this.console = console; // to output the status of the game
        this.map = map; // we need to have the map to display and send the copies if needed to methods
    }


    private void runTheGame() {
        Shape currentPlayer;
        while (arbiter.wantsToContinue()){
            console.displayMap(getACopyOfTicTacToeMap());
            currentPlayer = arbiter.whoIsPlaying();
            boolean handled = arbiter.areYouHandleThis(console.whatIsTheNextMove(currentPlayer, map.copyOfCurrentMap()));
            if(!handled){
                console.informThat("TryAgain");
            }
        }
        console.displayMap(map);
        console.showWinner(this);
    }

    public Shape getTheWinner() {
        return arbiter.whoIsTheWinner();
    }

    private TicTacToeMap getACopyOfTicTacToeMap() {
        return new TicTacToeSimpleMap(map.copyOfCurrentMap());
    }

    public void run() {
        runTheGame();
    }
}
