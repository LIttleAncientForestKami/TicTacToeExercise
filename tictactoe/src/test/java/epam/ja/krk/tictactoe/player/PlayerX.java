package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;

/**
 * Created by ehsan on 24.06.16.
 */
public class PlayerX implements Player {

    private String name;
    private String surname;

    public PlayerX(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Shape shape() {
        return Shape.X;
    }

    public String wholeName() {
        return name + " " + surname;
    }
}
