package InstrumentTests;

import MusicShop.Instruments.Harmonica;
import MusicShop.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarmonicaTest {
    
    Harmonica harmonica;

    @Before
    public void before(){
        harmonica = new Harmonica(InstrumentType.SQUEEZEBOX, "harmonicaSound", 5.00, 10.00, "chromatic");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.SQUEEZEBOX, harmonica.getInstrumentType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(5.00, harmonica.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10.00, harmonica.getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeSellingPrice(){
        harmonica.setSellingPrice(55.55);
        assertEquals(55.55, harmonica.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("harmonicaSound", harmonica.play());
    }

    @Test
    public void hasMarkup(){
        assertEquals(5.00, harmonica.calculateMarkup(), 0.01);
    }

    @Test
    public void hasSize(){
        assertEquals("chromatic", harmonica.getVersion());
    }
}

