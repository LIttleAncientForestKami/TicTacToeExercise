package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;

/**
 * Created by ehsan on 24.06.16.
 */
public abstract class Player {

    private String name;
    private String surname;

    public Player(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract  Shape shape();

    public String wholeName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return wholeName() + " [ " + shape() + " ] ";
    }
}
