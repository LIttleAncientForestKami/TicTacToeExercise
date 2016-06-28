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


    public void handleThis(String fieldNumber) {
        if(putXO(fieldNumber)){
            moveCounter++;
            if(isTheWinner(fieldNumber)){
                theWinner = currentPlayer;
            }
        }

        nextPlayer();
    }

    private boolean putXO(String fieldNumber) {
        boolean isPut = false;
        if(ticTacToeMap.hasFreeFieldOn(fieldNumber)){
            isPut = ticTacToeMap.putInTheField(fieldNumber, currentPlayer);
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

        return !isTheMapFull() && theWinner==null;
    }

    public Shape whoIsTheWinner() {
        return  theWinner;
    }

    public void nextPlayer() {
        if(Shape.O.equals(currentPlayer)){
            currentPlayer = Shape.X;
        }else {
            currentPlayer = Shape.O;
        }
    }

    private boolean isTheWinner(String fieldNumber){
        if(moveCounter<5) return false;
        boolean isWinner = false;
        ArbiterHelper helper = new SimpleArbiterHelper(ticTacToeMap);
        //getting all directions that has the shape.
        List<DirectionFieldNumber> directionFieldNumberList = helper.getTheDirectionsThatHaveTheShape(currentPlayer, fieldNumber);
        DirectionFieldNumber dirFieldNumber = new DirectionFieldNumber();
        if(directionFieldNumberList.contains(dirFieldNumber.getOppositeDirectionFieldNumber())){
            isWinner = true;
        }else {
            //Check if in the direction that has the shape is there another same shape in that direction
            for(DirectionFieldNumber directionFieldNumber : directionFieldNumberList){
                if(helper.hasTheShapeOn(directionFieldNumber.direction, directionFieldNumber.fieldNumber, currentPlayer)){
                    isWinner = true;
                }
            }
        }
        return isWinner;
    }

}
