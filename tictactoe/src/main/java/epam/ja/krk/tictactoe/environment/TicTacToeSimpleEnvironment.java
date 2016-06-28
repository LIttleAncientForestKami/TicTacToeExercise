package epam.ja.krk.tictactoe.environment;

import epam.ja.krk.tictactoe.arbiter.Arbiter;
import epam.ja.krk.tictactoe.graphic.GraphicalViewer;
import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.map.TicTacToeSimpleMap;

/**
 * Created by ehsan on 24.06.16.
 */
public class TicTacToeSimpleEnvironment implements Environment {

    private final Arbiter arbiter;
    private final GraphicalViewer console;
    private final TicTacToeMap map;

    public TicTacToeSimpleEnvironment(Arbiter arbiter, GraphicalViewer console, TicTacToeMap map) {
        this.arbiter = arbiter;
        this.console = console;
        this.map = map;
    }


    public void runTheGame() {
        Shape currentPlayer;
        while (arbiter.wantsToContinue()){
            console.displayMap(getACopyOfTicTacToeMap());
            currentPlayer = arbiter.whoIsPlaying();
            boolean handled = arbiter.areYouHandleThis(console.whatIsTheNextMove(currentPlayer, getACopyOfTicTacToeMap()));
            if(!handled){
                console.informThat("TryAgain");
            }

        }
    }

    public Shape getTheWinner() {
        return arbiter.whoIsTheWinner();
    }

    public TicTacToeMap getACopyOfTicTacToeMap() {
        return new TicTacToeSimpleMap(map.copyOfCurrentMap());
    }
}
