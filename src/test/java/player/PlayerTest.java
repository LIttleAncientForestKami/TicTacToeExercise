package player;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void getMarkTest() {
        Player player = new Player(Mark.X);
        Mark mark = player.getMark();
        assertEquals(mark, Mark.X);
    }

    @Test
    public void TestAddAndReturnListOfMoves() {
        //Given
        Player player = new Player(Mark.O);
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(1, 2, 3));
        //When
        player.addToListOfMoves(1);
        player.addToListOfMoves(2);
        player.addToListOfMoves(3);
        Set<Integer> movesList = player.returnListOfMoves();
        //Then
        assertEquals(movesList, integers);
    }
    

}