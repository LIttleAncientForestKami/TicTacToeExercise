package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;

import java.util.List;

/**
 * Created by ehsan on 24.06.16.
 */
public class SimpleArbiter implements Arbiter {

    private TicTacToeMap ticTacToeMap;

    private int moveCounter;

    private Shape theWinner;

    private Shape currentPlayer = Shape.O;
    public SimpleArbiter(TicTacToeMap map) {
        this.ticTacToeMap = map;
    }

    public boolean putXO(String fieldNumber) {
        boolean isPut = false;
        if(ticTacToeMap.hasFreeFieldOn(fieldNumber)){
            isPut = ticTacToeMap.putInTheField(fieldNumber, currentPlayer);
        }
        if(isPut){
            currentPlayer = nextPlayer();
            moveCounter++;
        }
        return isPut;
    }

    public boolean isTheMapFull() {
        return (moveCounter>=9);
    }

    public void letToPlay(Shape shape) {
        currentPlayer = shape;
    }

    public Shape whoIsPlaying() {
        return currentPlayer;
    }

    public boolean wantsToContinue() {
        return !isTheMapFull();
    }

    public Shape whoIsTheWinner() {
        return theWinner;
    }

    public Shape nextPlayer() {
        Shape retShape = Shape.O;
        if(Shape.O.equals(currentPlayer)){
            retShape = Shape.X;
        }
        return retShape;
    }

    private boolean isTheWinner(Shape shape, String fieldNumber){

        //getting all directions that has the shape.




        //Check if in the direction that has the shape is there another object in that direction

        return false;
    }

}
