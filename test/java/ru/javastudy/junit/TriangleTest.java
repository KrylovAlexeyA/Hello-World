package ru.javastudy.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class TriangleTest {

    private Triangle triangle;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before TriangleTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After TriangleTest.class");
    }

    @Before
    public void initTest() {
        triangle = new Triangle();
    }

    @After
    public void afterTest() {
        triangle = null;
    }
    @Test
    public void testSquareR() throws Exception {
        assertEquals(10, triangle.squareT(5, 4));
    }

}