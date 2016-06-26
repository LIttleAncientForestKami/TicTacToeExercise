package board;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.TreeSet;

@Test()
public class EmptyPositionListerTest {
    private Board board = new Board();
    private EmptyPositionLister emptyPositionLister = new EmptyPositionLister();

    @Test
    public void testEmpty() {
        Assert.assertEquals(emptyPositionLister.listEmptyPositions(board), new TreeSet<>(Arrays.asList( new Integer[] {1,2,3,4,5,6,7,8,9})));
    }
}
