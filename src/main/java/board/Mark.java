package board;

// represents mark on the board (O/X)
public enum Mark {
    O, X;

    // changes Mark from X->O or O->X
    Mark changeMark() {
        switch (this) {
            case O:
                return X;
            case X:
                return O;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return this.name();
    }
}
