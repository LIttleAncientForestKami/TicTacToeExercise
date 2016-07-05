package com.tictac;

import com.tictac.field.Board;
import com.tictac.field.Cell;
import com.tictac.field.CellFactoryMap;
import com.tictac.field.SymbolStorageWithRegistration;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * Created by olgaermolaeva on 05.07.16.
 */
public class TestCell {

    @Test
    public void getMyLinkedStorages(){
        // given
        Board board = new Board(3);
        board.setCells(new CellFactoryMap().createCells(3));
        board.updateCell(1, Symbol.O);
        Cell cellOnPosition = board.getCellOnPosition(1);
        // when
        List<SymbolStorageWithRegistration> storageList = cellOnPosition.getMyLinkedStorage();
        SymbolStorageWithRegistration storage1 = storageList.get(0);
        // then
        assertEquals(storage1.isWinner,false);
    }

}
