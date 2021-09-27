/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class PonyTest {
    Pony p;

    @Before
    public void setUp() throws Exception {
        p = new Pony("TestPney", 15);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("neigh", p.sound());
    }

}