
import org.junit.*;

import static org.junit.Assert.*;



public class ElephantTest {
    Elephant e;

    @Before
    public void setUp() throws Exception {
        e = new Elephant("suzy", 3);
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(3, e.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetName() {
        assertEquals("suzy", e.getName());
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("ooo", e.sound());
    }


}
