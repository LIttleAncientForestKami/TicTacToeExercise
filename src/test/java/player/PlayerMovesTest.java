package player;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.TreeSet;

import static org.testng.Assert.*;

public class PlayerMovesTest {

    @Test
    public void addAndGetTest(){
        //Given
        PlayerMoves moves = new PlayerMoves();
        TreeSet<Integer> testsMoves = new TreeSet<>();
        //When
        moves.addMove(1);
        testsMoves.add(1);
        moves.addMove(2);
        testsMoves.add(2);
        //Then
        assertEquals(testsMoves,moves.getPlayerMoves());
    }
}