package com.awesomeTTTOO.board;

/**
 * Created by bartlomiej on 24.06.16.
 */
public enum Signs {
    X("X"),
    O("O"),
    EMPTY(" ");

    private final String sign;

    private Signs(final String sign){
        this.sign=sign;
    }

    @Override
    public String toString(){
        return sign;
    }

}
