package com.danielzaucha.game.tictactoe.board;

import com.danielzaucha.game.tictactoe.player.controller.PlayerControllerObserver;
import com.danielzaucha.game.tictactoe.player.base.Sign;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by daniel on 23.06.16.
 */
public class Board implements BoardBase{

    private PlayerControllerObserver playerControllerObserver;
    private BoardSize boardSize;

    Map<Integer, Sign> board;

    public Board(int size)
    {
        board = new LinkedHashMap<>();
        boardSize = new BoardSize(size);
        initialize();
    }

    private void initialize()
    {
        int len = boardSize.intValue()*boardSize.intValue();
        for(int i=1; i<=len; i++)
            board.put(i, Sign.N);
    }

    @Override
    public void placeCharacterOnBoard(int pos, Sign s)
    {
        if(board.get(pos).equals(Sign.N))
        {
            board.put(pos, s);
            notifyToObserver();
        }
    }

    public void attach(PlayerControllerObserver playerControllerObserver)
    {
        this.playerControllerObserver = playerControllerObserver;
    }

    private void notifyToObserver()
    {
        playerControllerObserver.changePlayer();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, Sign> s: board.entrySet())
        {
            sb.append(s.getValue().equals(Sign.N) ? s.getKey() + " " : s.getValue() + " ");
            if(s.getKey()%boardSize.intValue()==0) sb.append("\n");
        }
        return sb.toString();
    }
}
