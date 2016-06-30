package com.maciejkocur.tictactoe.Board.impl;

import com.maciejkocur.tictactoe.Board.Mark;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapBoardBuilderTest {

    @Test
    public void createsEmptyBoard() {
        //given
        SimpleMapBoardBuilder builder = new SimpleMapBoardBuilder();
        HashMap<Integer, Mark> emptyMap = new HashMap<>();
        //when
        Map<Integer, Mark> createdMap = builder.createMap();
        //then
        Assert.assertEquals(emptyMap, createdMap);
    }
}
