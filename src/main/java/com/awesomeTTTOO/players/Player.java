package com.awesomeTTTOO.players;

import com.awesomeTTTOO.board.BoardManager;

/**
 * Created by bartlomiej on 27.06.16.
 */
public interface Player {

    void play(BoardManager boardManager);

    String insertSign();
}
