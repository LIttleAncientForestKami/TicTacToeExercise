package com.tictac.field.impl;
import com.tictac.Symbol;
import com.tictac.field.SymbolStorage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Olga Ermolaeva on 05.07.16.
 */
public class SymbolStorageWithRegistration implements SymbolStorage {

    private EventRegistrator eventRegistrator;
    private Symbol essentialSymbol;
    protected boolean isBroken;
    private List<Symbol> mySymbols;

    public void setEventRegistrator(EventRegistrator eventRegistrator) {
        this.eventRegistrator = eventRegistrator;
    }

    public void update(Symbol symbol) {
        if (essentialSymbol == null) {
            essentialSymbol = symbol;
            mySymbols = new LinkedList<>();
            mySymbols.add(symbol);
            return;
        }
        if(symbol != essentialSymbol){
            isBroken = true;
            eventRegistrator.registerBroken();
        }else{
            mySymbols.add(symbol);
            eventRegistrator.checkUpStorage(mySymbols);
        }
    }
    // for testing
    public Symbol getEssentialSymbol(){
        return essentialSymbol;
    }

}
