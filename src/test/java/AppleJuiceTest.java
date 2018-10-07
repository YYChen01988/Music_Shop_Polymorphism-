import juiceBar.AppleJuice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleJuiceTest {

    AppleJuice appleJuice;

    @Before
    public void before() {
        appleJuice = new AppleJuice("Apple Juice", 5, 7);
    }

    @Test
    public void hasType() {
        assertEquals("Apple Juice", appleJuice.getType());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(5, appleJuice.getBoughtPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(7, appleJuice.getSellPrice());
    }

    @Test
    public void haveProfit() {
        assertEquals(2, appleJuice.calculateMarkup());
    }
}
