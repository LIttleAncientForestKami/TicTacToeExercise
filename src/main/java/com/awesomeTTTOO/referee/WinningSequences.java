package com.awesomeTTTOO.referee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by bartlomiej on 27.06.16.
 */
public class WinningSequences {

    List<Set> sequencesList;

    public WinningSequences(){
        initializeSequences();
    }

    private List<Set> initializeSequences(){
        sequencesList=new ArrayList<Set>();
        int i=1;
        Set s;
        for(int z=0;z<3;z++){
            s=new TreeSet();
            for(;i<=9;i++){
            s.add(i);
            if(i%3==0){
                i++;
                break;}
            }


            sequencesList.add(s);
        }
        System.out.print(sequencesList);
        return sequencesList;
    }


    public boolean playerWon() {

        return true;
    }
}
