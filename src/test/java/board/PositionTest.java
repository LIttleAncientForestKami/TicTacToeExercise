package board;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

@Test()
public class PositionTest {
    private List<Position> list = new LinkedList<>();

    @BeforeClass
    private void initialize() {
        list.add( new Position(5) );
        list.add( new Position(5) );
        list.add( new Position(4) );
        list.add( new Position(1) );
        list.add( new Position(4) );
    }

    @DataProvider(name = "hash_eq")
    private Object[][] provideObjectsForHashAndEqualityTest() {
        return new Object[][] {
                {true, list.get(0), list.get(0)},
                {true, list.get(1), list.get(1)},
                {true, list.get(2), list.get(2)},
                {true, list.get(3), list.get(3)},
                {true, list.get(4), list.get(4)},
                {true, list.get(0), list.get(1)},
                {false, list.get(0), list.get(2)},
                {false, list.get(0), list.get(3)},
                {false, list.get(0), list.get(4)},
                {false, list.get(1), list.get(2)},
                {false, list.get(1), list.get(3)},
                {false, list.get(1), list.get(4)},
                {false, list.get(2), list.get(3)},
                {true, list.get(2), list.get(4)},
                {false, list.get(3), list.get(4)}
        };
    }

    @DataProvider(name = "compare")
    private Object[][] provideCompareData() {
        return new Object[][] {
                {list.get(0).compareTo( list.get(1) ) == 0},
                {list.get(0).compareTo( list.get(2) ) > 0},
                {list.get(0).compareTo( list.get(3) ) > 0},
                {list.get(0).compareTo( list.get(4) ) > 0},
                {list.get(1).compareTo( list.get(2) ) > 0},
                {list.get(1).compareTo( list.get(3) ) > 0},
                {list.get(1).compareTo( list.get(4) ) > 0},
                {list.get(2).compareTo( list.get(3) ) > 0},
                {list.get(2).compareTo( list.get(4) ) == 0},
                {list.get(3).compareTo( list.get(4) ) < 0}
        };
    }

    @Test(dataProvider = "compare")
    public void testGreater(boolean condition) {
        Assert.assertTrue(condition);
    }

    @Test(dataProvider = "hash_eq")
    public void testHashCode(boolean excepted, Position actualLeft, Position actualRight) {
        Assert.assertEquals(actualLeft.hashCode() == actualRight.hashCode(), excepted);
    }

    @Test(dataProvider = "hash_eq")
    public void testEquals(boolean excepted, Position actual1, Position actual2) {
        Assert.assertEquals(actual1.equals( actual2 ), excepted);
        Assert.assertEquals(actual2.equals( actual1 ), excepted);
    }
}