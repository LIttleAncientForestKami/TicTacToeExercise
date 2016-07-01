package com.epam.jedrzejewski.winningChecking;

import com.epam.jedrzejewski.board.Cell;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.*;


public class SequencesBuilderTest {
    private SequencesBuilder sequencesBuilder = new SequencesBuilder();

    @Test
    public void validSequence3LengthTest() {
        //Arrange
        Set<Sequence> validSequence3Length = sequence3();


        //Assert
        assertEquals(validSequence3Length, sequencesBuilder.getSequencesForSize(3));

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


    @Test(dataProvider = "invalidSizes")
    public void sequenceWithInvalidTest(int invalidSize) {
        assertEquals(Collections.EMPTY_SET, sequencesBuilder.getSequencesForSize(invalidSize));
    }

    @DataProvider
    public Object[][] invalidSizes() {
        return new Object[][]{{-100}, {-10}, {0}};
    }

}