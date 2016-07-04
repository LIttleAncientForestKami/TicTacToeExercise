package com.maciejkocur.tictactoe.ui.impl;

import com.maciejkocur.tictactoe.board.Board;
import com.maciejkocur.tictactoe.ui.BoardView;

public class ConsoleBoardView implements BoardView {

    @Override
    public void display(Board board) {
        System.out.println(board.toString());
    }
}
