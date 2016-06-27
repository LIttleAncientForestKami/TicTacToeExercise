package com.awesomeTTTOO.main;

import com.awesomeTTTOO.board.BoardManager;
import com.awesomeTTTOO.engine.GameRunner;

public class Game {

    public static void main(String[] args) {

        BoardManager boardManager = new BoardManager();

        System.out.println(boardManager.boardDrawn());
        boardManager.putInBoard(5,"O");
        System.out.println(boardManager.boardDrawn());

        new GameRunner().gameRun();



    }
}
