package com.tictac.field.impl;

import com.tictac.Symbol;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.assertEquals;

/**
 * Created by Olga Ermolaeva on 05.07.16.
 */
public class TestCell {

    @Test
    public void getMyLinkedStorages() {
        // given
        Board board = new Board(3);
        board.setCells(new CellFactoryMap(3).createCells());
        board.updateCell(1, Symbol.O);
        Cell cellOnPosition = board.getCellOnPosition(1);

        // when
        List<SymbolStorageWithRegistration> storageList = cellOnPosition.getMyLinkedStorage();
        SymbolStorageWithRegistration storage1 = storageList.get(0);
        SymbolStorageWithRegistration storage2 = storageList.get(1);
        SymbolStorageWithRegistration storage3 = storageList.get(2);

        // then
        assertEquals(storage1.getEssentialSymbol(), Symbol.O);
        assertEquals(storage2.getEssentialSymbol(), Symbol.O);
        assertEquals(storage3.getEssentialSymbol(), Symbol.O);

    }

}
