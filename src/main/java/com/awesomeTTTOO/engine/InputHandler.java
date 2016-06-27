package com.awesomeTTTOO.engine;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by bartlomiej on 24.06.16.
 */
public class InputHandler {
    Scanner scan;

    public InputHandler(){
        scan = new Scanner(System.in);
    }

    public int handleInput() {
        try {
            int dis = scan.nextInt();
            return dis;
        }catch(InputMismatchException ex){
            System.out.println("I am sorry, but you were about to choose a field between 1-9\nYou've lost " +
                    "your turn");
        }

     return 0;
    }
}
