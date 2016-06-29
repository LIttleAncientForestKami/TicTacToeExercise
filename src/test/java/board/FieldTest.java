package board;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

@Test()
public class FieldTest {
    private List<Field> list = new LinkedList<>();

    @BeforeClass
    private void initialize() {
        list.add( new Field( 5, Mark.O) );
        list.add( new Field( new Position(5), Mark.O ));
        list.add( new Field( 5, Mark.X ));
        list.add( new Field( new Position(5), Mark.X ));
    }

    @DataProvider(name = "hash_eq")
    private Object[][] provideObjectsForHashAndEqualityTest() {
        return new Object[][] {
                {true, list.get(0), list.get(0)},
                {true, list.get(1), list.get(1)},
                {true, list.get(2), list.get(2)},
                {true, list.get(3), list.get(3)},
                {true, list.get(0), list.get(1)},
                {false, list.get(0), list.get(2)},
                {false, list.get(0), list.get(3)},
                {false, list.get(1), list.get(2)},
                {false, list.get(1), list.get(3)},
                {true, list.get(2), list.get(3)}
        };
    }

    @DataProvider(name = "compare")
    private Object[][] provideDataToCompare() {
        Field ob1 = new Field(5, Mark.O);
        Field ob2 = new Field(6, Mark.X);
        Field ob3 = new Field(4, Mark.X);

        return new Object[][] {
                {ob1.compareTo( ob2 ) < 0},
                {ob1.compareTo( ob3 ) > 0},
                {ob2.compareTo( ob3 ) > 0}
        };
    }

    @Test(dataProvider = "compare")
    public void testCompareTo(boolean value) {
        assertTrue( value );
    }

    @Test(dataProvider = "hash_eq")
    public void testHashCode(boolean excepted, Field actualLeft, Field actualRight) {
        assertEquals(actualLeft.hashCode() == actualRight.hashCode(), excepted);
    }

    @Test(dataProvider = "hash_eq")
    public void testEquals(boolean excepted, Field actual1, Field actual2) {
        assertEquals(actual1.equals( actual2 ), excepted);
        assertEquals(actual2.equals( actual1 ), excepted);
    }
}