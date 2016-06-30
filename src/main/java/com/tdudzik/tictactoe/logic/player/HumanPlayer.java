package com.tdudzik.tictactoe.logic.player;

import com.tdudzik.tictactoe.logic.board.Board;
import com.tdudzik.tictactoe.logic.board.Mark;
import com.tdudzik.tictactoe.logic.board.Position;
import com.tdudzik.tictactoe.logic.io.InputHandler;

public class HumanPlayer extends Player {

    HumanPlayer(String id, String name) {
        super(id, name);
    }

    @Override
    protected void play(InputHandler inputHandler, Board board, Mark mark) {
        Position position = inputHandler.readHumanPlayerPosition(name);
        board.placeMark(position, mark);
    }

}
