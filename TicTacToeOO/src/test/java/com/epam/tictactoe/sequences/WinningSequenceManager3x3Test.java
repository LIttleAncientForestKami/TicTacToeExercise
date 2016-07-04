package com.epam.tictactoe.sequences;

import com.epam.tictactoe.board.Position;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author Grzegorz Sledz
 */
public class WinningSequenceManager3x3Test {

    IWiningSequenceManager winningSequenceManager=new WiningSequenceManager3x3();

    @Test
    public void sequencesForPositionOutOfRangeShoudBeZero(){
        List<WinningSequence> sequenceList=winningSequenceManager.getSequences(new Position(10));
        Assert.assertEquals(sequenceList.size(),0);
    }

    @Test
    public void sequencesForPositionOneShouldBeThree(){
        List<WinningSequence> sequenceList=winningSequenceManager.getSequences(new Position(1));

        Assert.assertEquals(sequenceList.size(),3);
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.ROW1.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.COL1.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.DIAG1.condition()));
    }
    @Test
    public void sequencesForPositionTwoShouldBeTwo(){
        List<WinningSequence> sequenceList=winningSequenceManager.getSequences(new Position(2));

        Assert.assertEquals(sequenceList.size(),2);
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.ROW1.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.COL2.condition()));
    }
    @Test
    public void sequencesForPositionThreeShouldBeThree(){
        List<WinningSequence> sequenceList=winningSequenceManager.getSequences(new Position(3));

        Assert.assertEquals(sequenceList.size(),3);
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.ROW1.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.COL3.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.DIAG2.condition()));
    }
    @Test
    public void sequencesForPositionFourShouldBeTwo(){
        List<WinningSequence> sequenceList=winningSequenceManager.getSequences(new Position(4));

        Assert.assertEquals(sequenceList.size(),2);
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.ROW2.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.COL1.condition()));
    }

    @Test
    public void sequencesForPositionFiveShouldBeFour(){
        List<WinningSequence> sequenceList=winningSequenceManager.getSequences(new Position(5));

        Assert.assertEquals(sequenceList.size(),4);
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.ROW2.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.COL2.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.DIAG1.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.DIAG2.condition()));
    }
    @Test
    public void sequencesForPositionSixShouldBeTwo(){
        List<WinningSequence> sequenceList=winningSequenceManager.getSequences(new Position(6));

        Assert.assertEquals(sequenceList.size(),2);
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.ROW2.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.COL3.condition()));
    }
    @Test
    public void sequencesForPositionSevenShouldBeThree(){
        List<WinningSequence> sequenceList=winningSequenceManager.getSequences(new Position(7));

        Assert.assertEquals(sequenceList.size(),3);
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.ROW3.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.COL1.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.DIAG2.condition()));
    }
    @Test
    public void sequencesForPositionEightShouldBeTwo(){
        List<WinningSequence> sequenceList=winningSequenceManager.getSequences(new Position(8));

        Assert.assertEquals(sequenceList.size(),2);
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.ROW3.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.COL2.condition()));
    }
    @Test
    public void sequencesForPositionNineShouldBeThree(){
        List<WinningSequence> sequenceList=winningSequenceManager.getSequences(new Position(9));

        Assert.assertEquals(sequenceList.size(),3);
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.ROW3.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.COL3.condition()));
        Assert.assertTrue(sequenceList.contains(WinningCondition3x3.DIAG1.condition()));
    }

}
