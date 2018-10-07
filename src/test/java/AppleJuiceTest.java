import juiceBar.AppleJuice;
import juiceBar.JuiceType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleJuiceTest {

    AppleJuice appleJuice;

    @Before
    public void before() {
        appleJuice = new AppleJuice("Apple Juice", 5, 7, JuiceType.APPLE);
    }

    @Test
    public void hasType() {
        assertEquals(JuiceType.APPLE, appleJuice.getType());
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

    @Test
    public void canUpgrade() {
        appleJuice.upgradeDrink();
        assertEquals(42, appleJuice.calculateMarkup());
    }
}
