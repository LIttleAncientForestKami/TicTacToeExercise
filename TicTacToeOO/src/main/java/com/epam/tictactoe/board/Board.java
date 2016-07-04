package com.epam.tictactoe.board;

import com.epam.tictactoe.enums.Sign;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Grzegorz Sledz
 *
 * Class is responsible for representing sings on board.
 */
public class Board implements IBoard {

    private final IDimension dimension;
    private final Map<IPosition, Sign> fields;

    public Board(IDimension dimension) {
        this.dimension = dimension;
        this.fields = new HashMap<IPosition, Sign>();
        this.initialize(Sign.EMPTY);
    }

    private void initialize(Sign sign) {
        int dim = dimension.value() * dimension.value();
        for (int i = 1; i <= dim; i++) {
            fields.put(new Position(i), sign);
        }
    }

    public boolean checkIsFullyFilled() {
        return !(fields.containsValue(Sign.EMPTY));
    }

    public Sign elementAt(IPosition position) {
        return fields.get(position);
    }

    public boolean checkIsEmptyAt(IPosition position) {
        return fields.containsKey(position) && fields.get(position).equals(Sign.EMPTY);
    }

    public IDimension dimension() {
        return this.dimension;
    }

    public boolean placeMark(IPosition position, Sign value) {
        if (checkIsEmptyAt(position)) {
            fields.put(position, value);
            return true;
        } else
            return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= fields.size(); i++) {
            stringBuilder.append(fields.get(new Position(i)));
            if (i % dimension.value() != 0) {
                stringBuilder.append("|");
            } else {
                stringBuilder.append('\n');
            }
        }
        return stringBuilder.toString();
    }
}
