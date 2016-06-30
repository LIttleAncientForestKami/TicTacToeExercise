package board;

import java.util.Set;

public class EmptyPositionLister {
    public Set<Integer> listEmptyPositions(Board board) {
        return board.listEmptyPositionIndices();
    }
}
