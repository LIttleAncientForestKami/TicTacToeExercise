package board;

// represents mark on the board (O/X)
public enum Mark {
    O, X;

    // changes Mark from X->O or O->X
    public Mark changeMark() {
        if (this == O) {
            return X;
        }
        return O;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
