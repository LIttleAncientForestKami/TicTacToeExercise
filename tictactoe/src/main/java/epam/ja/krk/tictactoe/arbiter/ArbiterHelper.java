package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;

import java.util.List;

/**
 * Created by ehsan on 27.06.16.
 */
public interface ArbiterHelper {
    List<DirectionFieldNumber> getTheDirectionsThatHaveTheShape(Shape shape, String fieldNumber);

    boolean hasTheShapeOn(Direction direction, String fieldNumber, Shape shape);
}
