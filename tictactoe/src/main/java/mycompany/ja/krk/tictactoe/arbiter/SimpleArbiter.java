package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;

import java.util.List;

/**
 * Created by ehsan on 24.06.16.
 */
public class SimpleArbiter implements Arbiter {

    private final TicTacToeMap ticTacToeMap;

    private final ArbiterHelper helper;

    private Shape theWinner = Shape.N;

    private Shape currentPlayer = Shape.O;

    public SimpleArbiter(TicTacToeMap map) {
        this.ticTacToeMap = map; // the arbiter needs the map to control the game and make decision
        helper = new SimpleArbiterHelper(ticTacToeMap); // a helper helps arbiter to divide the responsibility
    }


    public boolean areYouHandleThis(String fieldNumber) {
        final boolean yesIDo = putXO(fieldNumber);
        if(yesIDo){
            if(isTheWinner(fieldNumber)){
                theWinner = currentPlayer;
            }
            nextPlayer();
            helper.deleteFromTheFreeFields(fieldNumber);
        }
        return yesIDo;
    }

    private boolean putXO(String fieldNumber) {
        boolean isPut = false;
        if(ticTacToeMap.hasFreeFieldOn(fieldNumber)){
            isPut = ticTacToeMap.putInTheField(fieldNumber, currentPlayer);
        }
        return isPut;
    }

    public boolean isTheMapFull() {
        return helper.whatFieldsAreFree().isEmpty();
    }

    public void letToPlay(Shape shape) {
        currentPlayer = shape;
    }

    public Shape whoIsPlaying() {
        return currentPlayer;
    }

    public boolean wantsToContinue() {

        return !isTheMapFull() && !haveWeAWinner();
    }

    private boolean haveWeAWinner() {
        boolean isThereAWinner = false;
        if(!Shape.N.equals(theWinner)){
            isThereAWinner=true;
        }

        return isThereAWinner;
    }

    public Shape whoIsTheWinner() {
        return  theWinner;
    }

    private void nextPlayer() {
        if(Shape.O.equals(currentPlayer)){
            currentPlayer = Shape.X;
        }else {
            currentPlayer = Shape.O;
        }
    }

    private boolean isTheWinner(String fieldNumber){
        if(helper.whatFieldsAreFree().size()>5) return false;
        boolean isWinner = false;
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
