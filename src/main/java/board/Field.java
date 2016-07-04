package board;

import player.Mark;

class Field {
    private String field;

    Field(Mark field) {
        this.field = field.toString();
    }

    Field(int i) {
        this.field = i + "";
    }

    @Override
    public String toString() {
        return "| " + field + " |";
    }
}
