package ru.javastudy.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before RectangleTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After RectangleTest.class");
    }

    @Before
    public void initTest() {
        rectangle = new Rectangle();
    }

    @After
    public void afterTest() {
        rectangle = null;
    }


    @Test
    public void testSquareR() throws Exception {
        assertEquals(24, rectangle.squareR(8, 3));
    }
}
