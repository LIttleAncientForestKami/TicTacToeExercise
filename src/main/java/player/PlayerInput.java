package player;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by kuba on 27.06.16.
 */
public class PlayerInput {
    private Scanner in = new Scanner(System.in);
    private InputValidator inputValidator;

    public PlayerInput(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public int move() throws InputMismatchException{
        int i;
        do {
            i = in.nextInt();
        } while (!inputValidator.validate(i));
        return i;
    }
}
