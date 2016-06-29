package mycompany.ja.krk.tictactoe.arbiter;

import mycompany.ja.krk.tictactoe.map.Shape;

import java.util.List;

/**
 * Created by ehsan on 27.06.16.
 */
public interface ArbiterHelper {
    List<DirectionFieldNumber> getTheDirectionsThatHaveTheShape(Shape shape, String fieldNumber);

    /**
     * Checks in the direction if it can find the shape
     * @param direction
     * @param fieldNumber
     * @param shape
     * @return
     */
    boolean hasTheShapeOn(Direction direction, String fieldNumber, Shape shape);

    List<String> whatFieldsAreFree();

    void deleteFromTheFreeFields(String fieldNumber);

}
