package InstrumentTests;

import MusicShop.Instruments.Cello;
import MusicShop.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {
    
    Cello cello;

    @Before
    public void before(){
        cello = new Cello(InstrumentType.STRINGED, "celloSound", 10.00, 20.00, "suzuki");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRINGED, cello.getInstrumentType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(10.00, cello.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(20.00, cello.getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeSellingPrice(){
        cello.setSellingPrice(55.55);
        assertEquals(55.55, cello.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("celloSound", cello.play());
    }

    @Test
    public void hasMarkup(){
        assertEquals(10.00, cello.calculateMarkup(), 0.01);
    }

    @Test
    public void hasSize(){
        assertEquals("suzuki", cello.getSize());
    }
}

