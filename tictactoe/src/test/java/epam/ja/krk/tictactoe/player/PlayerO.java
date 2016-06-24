package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;

/**
 * Created by ehsan on 24.06.16.
 */
public class PlayerO implements Player {

    private String name;
    private String surname;

    public PlayerO(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Shape shape() {
        return Shape.O;
    }

    public String wholeName() {
        return name + " " + surname;
    }
}
