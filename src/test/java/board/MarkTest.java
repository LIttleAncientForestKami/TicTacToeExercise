package board;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test()
public class MarkTest {
    @DataProvider(name = "marks")
    private Object[][] provideMarks() {
        return new Object[][] {
                {Mark.O.changeMark(), Mark.X},
                {Mark.X.changeMark(), Mark.O},
                {null, null}
        };
    }

    @DataProvider(name = "strings")
    private Object[][] provideStrings() {
        return new Object[][] {
                {Mark.O.toString(), "O"},
                {Mark.X.toString(), "X"}
        };
    }

    @Test(dataProvider = "marks")
    public void changeMarksTest(Mark actual, Mark expected) {
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "strings")
    public void toStringTest(String actual, String expected) {
        assertEquals(actual, expected);
    }
}
