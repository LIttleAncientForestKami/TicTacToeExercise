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
        Integer result = position.compareTo( field.position );
        if (result != 0) {
            return result;
        }
        return result + mark.compareTo( field.mark );
    }

    @Override
    public String toString() {
        if (mark == null) {
            return position.toString();
        }
        return mark.toString();
    }
}