import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class DogTest {

    Dogs d;


    @Test(timeout = 50)
    public void Testsound() {
        assertEquals("Woof", d.sound());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, d.getPrice());
    }
}
