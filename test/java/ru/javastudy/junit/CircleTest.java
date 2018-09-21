package ru.javastudy.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class    CircleTest {

    private Circle circle;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CircleTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After CircleTest.class");
    }

    @Before
    public void initTest() {
        circle = new Circle();
    }

    @After
    public void afterTest() {
        circle = null;
    }

    @Test
    public void testSquareR() throws Exception {
        assertEquals(200.96, circle.squareС(8.0) ,000.1);
    }

}