import MusicShop.Instruments.Bagpipe;
import MusicShop.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagpipeTest {
    
    Bagpipe bagpipe;

    @Before
    public void before(){
        bagpipe = new Bagpipe(InstrumentType.WOODWIND, "bagpipeSound", 20.00, 50.00, "Scotland");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, bagpipe.getInstrumentType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(20.00, bagpipe.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(50.00, bagpipe.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("bagpipeSound", bagpipe.play());
    }

    @Test
    public void hasMarkup(){
        assertEquals(30.00, bagpipe.calculateMarkup(), 0.01);
    }

    @Test
    public void hasSize(){
        assertEquals("Scotland", bagpipe.getOrigin());
    }
    
    
}

