package com.maciejkocur.tictactoe.board.impl;

import com.maciejkocur.tictactoe.board.Mark;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SimpleMapBoardBuilderTest {

    @Test
    public void createsEmptyBoard() {
        //given
        SimpleMapBoardBuilder builder = new SimpleMapBoardBuilder();
        HashMap<Field, Mark> emptyMap = createEmptyMap();
        //when
        Map<Field, Mark> createdMap = builder.createMap();
        //then
        Assert.assertEquals(emptyMap, createdMap);
    }

    private HashMap<Field, Mark> createEmptyMap() {
        HashMap<Field, Mark> map = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            map.put(new Field(i), Mark.EMPTY);
        }
        return map;
    }
}
