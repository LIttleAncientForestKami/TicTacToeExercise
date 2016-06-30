package com.epam.tictactoe.board;

import com.epam.tictactoe.enums.Sign;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Grzesiek on 2016-06-23.
 */
public class Board implements IBoard {

    private final int dimension;
    private final Map<IPosition, Sign> fields;

    public Board(IDimension dimension) {
        this.dimension = dimension.value();
        this.fields = new HashMap<IPosition, Sign>();
        this.initialize(Sign.EMPTY);
    }

    private void initialize(Sign sign) {
        for (int i = 1; i <= dimension * dimension; i++) {
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

    public boolean placeMark(IPosition position, Sign value) {
        if (checkIsEmptyAt(position)) {
            fields.put(position, value);
            return true;
        } else
            return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= dimension * dimension; i++) {
            stringBuilder.append(fields.get(new Position(i)));
            if (i % dimension != 0) {
                stringBuilder.append("|");
            } else {
                stringBuilder.append('\n');
            }
        }
        return stringBuilder.toString();
    }
}
