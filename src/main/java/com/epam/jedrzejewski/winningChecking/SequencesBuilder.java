package com.epam.jedrzejewski.winningChecking;


import com.epam.jedrzejewski.board.Cell;

import java.util.*;

class SequencesBuilder {
    private Map<Integer, Set<Sequence>> sequences = new HashMap<>();

    SequencesBuilder() {
        createSequences();
    }


    Set<Sequence> getSequencesForSize(int size) {
        return sequences.getOrDefault(size, Collections.EMPTY_SET);
    }


    private void createSequences() {
        sequences.put(3, sequence3());
    }


    private Set<Sequence> sequence3() {
        Set<Sequence> sequenceSet = new HashSet<>();

        sequenceSet.add(new Sequences3Lenght(EnumSet.range(Cell.one, Cell.three)));
        sequenceSet.add(new Sequences3Lenght(EnumSet.range(Cell.four, Cell.six)));
        sequenceSet.add(new Sequences3Lenght(EnumSet.range(Cell.seven, Cell.nine)));

        sequenceSet.add(new Sequences3Lenght(EnumSet.of(Cell.one, Cell.four, Cell.seven)));
        sequenceSet.add(new Sequences3Lenght(EnumSet.of(Cell.two, Cell.five, Cell.eight)));
        sequenceSet.add(new Sequences3Lenght(EnumSet.of(Cell.three, Cell.six, Cell.nine)));


        sequenceSet.add(new Sequences3Lenght(EnumSet.of(Cell.one, Cell.five, Cell.nine)));
        sequenceSet.add(new Sequences3Lenght(EnumSet.of(Cell.three, Cell.five, Cell.seven)));

        return sequenceSet;
    }


}
