import instruments.Guitar;
import instruments.InstrumentType;
import juiceBar.AppleJuice;
import juiceBar.JuiceType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    AppleJuice appleJuice;
    Guitar guitar, guitar1;

    @Before
    public void before() {
        shop = new Shop();
        appleJuice = new AppleJuice("Apple Juice", 5, 7, JuiceType.APPLE);
        guitar = new Guitar("Wood","Black",200, 450, 6, InstrumentType.GUITAR);
        guitar1 = new Guitar("Oak Wood","Brown",200, 450, 6, InstrumentType.GUITAR);
    }

    @Test
    public void canAddItemToStock() {
        shop.addItem(appleJuice);
        assertEquals(1, shop.getNumberOfStocking());
        shop.addItem(guitar);
        assertEquals(2, shop.getNumberOfStocking());
    }

    @Test
    public void canSellItem() {
        shop.addItem(appleJuice);
        shop.addItem(appleJuice);
        shop.addItem(guitar);
        shop.addItem(guitar);
        shop.sellItem(guitar);
        assertEquals(3, shop.getNumberOfStocking());
    }

    @Test
    public void canGetPotentialProfit() {
        shop.addItem(appleJuice);
        shop.addItem(appleJuice);
        shop.addItem(guitar);
        shop.addItem(guitar1);
        assertEquals(504, shop.potentialProfit());
    }

    @Test
    public void hasSoldItemsProfit() {
        shop.addItem(appleJuice);
        shop.addItem(appleJuice);
        shop.addItem(guitar);
        shop.addItem(guitar1);
        shop.sellItem(guitar);
        shop.sellItem(guitar1);
        assertEquals(500, shop.profit());
    }

    @Test
    public void canCheckIfMeetTarget() {
        shop.addItem(appleJuice);
        shop.addItem(appleJuice);
        shop.addItem(guitar);
        shop.addItem(guitar1);
        shop.sellItem(guitar);
        shop.sellItem(guitar1);
        assertEquals("Wonderful, You meet the target", shop.meetTarget());
    }
}
