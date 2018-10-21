import MusicShop.Instruments.InstrumentType;
import MusicShop.Instruments.Ukulele;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UkuleleTest {

    Ukulele ukulele;

    @Before
    public void before(){
        ukulele = new Ukulele(InstrumentType.FRETTED, "ukuSound", 17.00, 32.00, "soprano");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.FRETTED, ukulele.getInstrumentType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(17.00, ukulele.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(32.00, ukulele.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("ukuSound", ukulele.play());
    }

    @Test
    public void hasMarkup(){
        assertEquals(15.00, ukulele.calculateMarkup(), 0.01);
    }

    @Test
    public void hasTonalRange(){
        assertEquals("soprano", ukulele.getTonalRange());
    }

}

