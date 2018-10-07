import instruments.Guitar;
import instruments.InstrumentType;
import juiceBar.AppleJuice;
import juiceBar.ISell;
import org.junit.Before;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    AppleJuice appleJuice;
    Guitar guitar;

    @Before
    public void before() {
        shop = new Shop();
        appleJuice = new AppleJuice("Apple Juice", 5, 7);
        guitar = new Guitar("Wood","Black",200, 450, 6, InstrumentType.GUITAR);
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
        shop.addItem(guitar);
        assertEquals(504, shop.potentialProfit());
    }
}