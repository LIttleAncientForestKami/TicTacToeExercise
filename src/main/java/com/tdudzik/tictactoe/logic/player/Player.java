package com.tdudzik.tictactoe.logic.player;

import com.tdudzik.tictactoe.logic.board.Board;
import com.tdudzik.tictactoe.logic.board.Mark;
import com.tdudzik.tictactoe.logic.io.InputHandler;

public abstract class Player {

    protected final String id;
    protected final String name;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void playAsX(InputHandler inputHandler, Board board) {
        play(inputHandler, board, Mark.X);
    }

    public void playAsO(InputHandler inputHandler, Board board) {
        play(inputHandler, board, Mark.O);
    }

    protected abstract void play(InputHandler inputHandler, Board board, Mark mark);

}
