package com.epam.ticTacToe.board;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

/**
 * Created by damian on 04.07.16.
 */
public class FieldTest {

    private Field field1;
    private Field fieldEqualToField1;
    private Field field2;

    @BeforeMethod
    public void setUp() {
        /**
         * Arrange
         */
        field1 = new Field(0, 1);
        fieldEqualToField1 = new Field(0, 1);
        field2 = new Field(1, 2);
    }

    @Test
    public void testFieldsEquality() {
        /**
         * Assert
         */
        assertEquals(0, field1.compareTo(fieldEqualToField1));
        assertNotEquals(0, field2.compareTo(field1));
    }

    @Test
    public void testFieldsComparing() {
        /**
         * Assert
         */
        assertEquals(-1, field1.compareTo(field2));
        assertEquals(1,field2.compareTo(field1));
    }

    @AfterMethod
    public void tearDown() {
        field1 = null;
        fieldEqualToField1 = null;
        field2 = null;
    }
}
