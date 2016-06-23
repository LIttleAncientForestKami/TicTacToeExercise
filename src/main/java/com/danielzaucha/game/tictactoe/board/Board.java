package com.danielzaucha.game.tictactoe.board;

import com.danielzaucha.game.tictactoe.player.Sign;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by daniel on 23.06.16.
 */
public class Board {
    private BoardSize boardSize;
    private Map<Integer, Sign> board;

    public Board(int size)
    {
        boardSize = new BoardSize(size);
        board = new HashMap<>();
        initialize();
    }

    private void initialize()
    {
        int len = boardSize.intValue()*boardSize.intValue();
        for(int i=1; i<=len; i++)
            board.put(i, Sign.N);
    }

    public void placeCharacterOnBoard(int pos, Sign s)
    {
        board.put(pos, s);
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder("abcdefghi");
        for(Map.Entry<Integer, Sign> s: board.entrySet())
        {

        }
        return sb.toString();
    }
}
