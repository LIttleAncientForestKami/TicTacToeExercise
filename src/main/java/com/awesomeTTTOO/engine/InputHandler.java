package com.awesomeTTTOO.engine;

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
        int dis = scan.nextInt();

        return dis;
    }
}
