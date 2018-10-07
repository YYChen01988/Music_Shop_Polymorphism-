import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Oak Wood","Black",200, 450, 6, InstrumentType.GUITAR);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Oak Wood", guitar.getMaterial());
    }

    @Test
    public void hasColor() {
        assertEquals("Black", guitar.getColor());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(200, guitar.getBoughtPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(450, guitar.getSellPrice());
    }

    @Test
    public void canCountStringNumber() {
        assertEquals(6, guitar.getStringNumber());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void hasPotentialProfit() {
        assertEquals(250, guitar.calculateMarkup());
    }
}
