package board;

// representation of a single field (player's mark and coordinate)
public class Field implements Comparable<Field> {
    private final Mark mark;
    private final Position position;

    Field(Integer indexPosition, Mark mark) {
        position = new Position(indexPosition);
        this.mark = mark;
    }

    Field(Position position, Mark mark) {
        this.position = position;
        this.mark = mark;
    }

    @Override
    public int hashCode() {
        return 31*(mark.hashCode() + 17) + position.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if ( !(this.getClass().equals( obj.getClass() )) ) return false;
        Field tmp = (Field)obj;
        return position.equals( tmp.position ) && mark == tmp.mark;
    }

    @Override
    public int compareTo(Field field) {
        return position.compareTo( field.position );
    }

    @Override
    public String toString() {
        if (mark == Mark.EMPTY) {
            return position.toString();
        }
        return mark.toString();
    }
}