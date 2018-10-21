package AccessoryTests;

import MusicShop.Acessories.AccessoryType;
import MusicShop.Acessories.Metronome;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetronomeTest {
    
    Metronome metronome;
    
    @Before
    public void before() {
        metronome = new Metronome(AccessoryType.METRONOMES, 20.00, 35.00, "pyramid");
    }

    @Test
    public void hasAccessoryType(){
        assertEquals(AccessoryType.METRONOMES, metronome.getAccessoryType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(20.00, metronome.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(35.00, metronome.getSellingPrice(), 0.01);
    }

    @Test
    public void canChangeSellingPrice(){
        metronome.setSellingPrice(45.00);
        assertEquals(45.00, metronome.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkup(){
        assertEquals(15.00, metronome.calculateMarkup(), 0.01);
    }

    @Test
    public void hasSize(){
        assertEquals("pyramid", metronome.getShape());
    }
    
}
