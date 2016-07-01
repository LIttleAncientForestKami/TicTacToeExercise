package com.danielzaucha.game.tictactoe.arbiter;

import com.danielzaucha.game.tictactoe.board.Board;
import com.danielzaucha.game.tictactoe.player.base.Player;
import com.danielzaucha.game.tictactoe.player.base.Sign;
import com.danielzaucha.game.tictactoe.player.controller.PlayerController;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * Created by daniel on 30.06.16.
 */
public class ArbiterTest {

    Board board;
    int boardSize;

    @BeforeMethod
    public void initialize(){
        boardSize = 3;
        board = new Board(boardSize);
    }

    @DataProvider(name = "firstSequence")
    private Object[][] firstSequence() {
        return new Object[][] {{1, Sign.X, 2, Sign.O, 5, Sign.X},
                {2, Sign.X, 4, Sign.O, 5, Sign.X},
                {3, Sign.X, 9, Sign.O, 5, Sign.X},
        };
    }

    @DataProvider(name = "secondSequence")
    private Object[][] secondSequence() {
        return new Object[][] {{1, Sign.X, 2, Sign.O, 5, Sign.X, 3, Sign.O, 8, Sign.X},
                {3, Sign.X, 4, Sign.O, 6, Sign.X, 5, Sign.O, 9, Sign.X},
                {7, Sign.X, 6, Sign.O, 8, Sign.X, 5, Sign.O, 9, Sign.X},
        };
    }

    @Test(dataProvider = "firstSequence")
    public void checkWinningConditionWithoutResult(Integer pos1, Sign sign1, Integer pos2, Sign sign2, Integer pos3, Sign sign3){
        //given
        Arbiter arbiter = new Arbiter(board, boardSize);
        board.deleteObserver(arbiter);

        //when
        board.placeCharacterOnBoard(pos1,sign1);
        board.placeCharacterOnBoard(pos2,sign2);
        board.placeCharacterOnBoard(pos3,sign3);

        //then
        assertNotEquals(arbiter.compareSequences(Sign.X, 5), true);
    }


    @Test(dataProvider = "secondSequence")
    public void checkWinningCondition(Integer pos1, Sign sign1, Integer pos2, Sign sign2, Integer pos3, Sign sign3, Integer pos4, Sign sign4, Integer pos5, Sign sign5){
        //given
        Arbiter arbiter = new Arbiter(board, boardSize);
        board.deleteObserver(arbiter);

        //when
        board.placeCharacterOnBoard(pos1, sign1);
        board.placeCharacterOnBoard(pos2, sign2);
        board.placeCharacterOnBoard(pos3, sign3);
        board.placeCharacterOnBoard(pos4, sign4);
        board.placeCharacterOnBoard(pos5, sign5);

        //then
        assertNotEquals(arbiter.compareSequences(Sign.X, 5), true);
    }
}