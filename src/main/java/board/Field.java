package board;

class Field {
    private String field;

    Field(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "| " + field + " |";
    }
}
