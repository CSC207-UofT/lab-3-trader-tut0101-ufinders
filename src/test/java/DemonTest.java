import org.junit.*;

import static org.junit.Assert.*;


public class DemonTest {
    Demon BillC;

    @Before
    public void setUp() throws Exception {
        BillC = new Demon(9000);
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(999999999, BillC.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        BillC.upgradeSpeed();
        assertEquals(2, BillC.getMaxSpeed());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, BillC.getPrice());
    }

    @Test(timeout = 50)
    public void TestPowerLevel() {assertEquals(true, BillC.isOver9000());}

}
