package epam.ja.krk.tictactoe.arbiter;

/**
 * Created by ehsan on 27.06.16.
 */
public class DirectionFieldNumber {

    public final Direction direction;

    public final String fieldNumber;

    private DirectionFieldNumber(Direction direction, String fieldNumber) {
        this.direction = direction;
        this.fieldNumber = fieldNumber;
    }

    public DirectionFieldNumber(){
        direction = null;
        fieldNumber = null;
    }

    private DirectionFieldNumber(boolean needYouOpposite){
        if(needYouOpposite){
            direction = Direction.OPPOSIT;
        }else {

            direction = null;
        }
        fieldNumber = null;
    }

    public DirectionFieldNumber getOppositeDirectionFieldNumber(){
        return new DirectionFieldNumber(true);

    }
    public DirectionFieldNumber getFieldNumberOnDirection(Direction direction, String fieldNumber){
        int fieldNumberInt = Integer.valueOf(fieldNumber);

        int columnNumberMinus1 = 3-1;
        int columnNumberPlus1 = 3+1;
        boolean hasLeft = ((fieldNumberInt-1)%3)!=0;
        boolean hasRight = ((fieldNumberInt-1)%3)!=2;

        switch (direction) {
            case TOP:
                fieldNumberInt -= 3;
                break;
            case BOTTOM:
                fieldNumberInt += 3;
                break;
            case LEFT:
                if(hasLeft){
                    fieldNumberInt--;
                }
                break;
            case RIGHT:
                if(hasRight){
                    fieldNumberInt++;
                }
                break;
            case TOP_LEFT:
                if(hasLeft){
                    fieldNumberInt -= columnNumberPlus1;
                }
                break;
            case TOP_RIGHT:
                if(hasRight){
                    fieldNumberInt -= columnNumberMinus1;
                }
                break;
            case BOTTOM_LEFT:
                if(hasLeft){
                    fieldNumberInt += columnNumberMinus1;
                }
                break;
            case BOTTOM_RIGHT:
                if(hasRight){
                    fieldNumberInt += columnNumberPlus1;
                }
                break;
        }
        if(fieldNumberInt == Integer.valueOf(fieldNumber)){
            fieldNumberInt=-1;
        }
        return new DirectionFieldNumber(direction, String.valueOf(fieldNumberInt));

    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof DirectionFieldNumber){
            return ((DirectionFieldNumber)o).direction.equals(this.direction);
        }
        return  false;
    }

    @Override
    public int hashCode() {
        return direction.hashCode();
    }
}
