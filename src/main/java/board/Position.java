package board;

// represents simple coordinate (position)
public class Position implements Comparable<Position> {
    // from 1 to 9
    private final Integer position;

    Position(Integer nPos) {
        position = nPos;
    }

    // convert to Int
    static Integer asInt(Position obj) {
        return obj.position;
    }

    @Override
    public int compareTo(Position pos) {
        return position.compareTo( pos.position );
    }

    @Override
    public boolean equals(Object pos) {
        if (this == pos) return true;
        if (pos == null) return false;
        if ( !(this.getClass().equals( pos.getClass() )) ) return false;
        Position tmp = (Position) pos;
        return position.equals( tmp.position );
    }

    @Override
    public int hashCode() {
        return position.hashCode();
    }

    @Override
    public String toString() {
        return position.toString();
    }
}
