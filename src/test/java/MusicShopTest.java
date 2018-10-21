import MusicShop.Acessories.AccessoryType;
import MusicShop.Acessories.Metronome;
import MusicShop.Instruments.Bagpipe;
import MusicShop.Instruments.InstrumentType;
import MusicShop.Instruments.Ukulele;
import MusicShop.MusicShop;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Ukulele ukulele;
    Bagpipe bagpipe;
    Metronome metronome;

    @Before
    public void before(){
        musicShop = new MusicShop("hobgoblin music");
        ukulele = new Ukulele(InstrumentType.FRETTED, "ukuSound", 17.00, 32.00, "soprano");
        bagpipe = new Bagpipe(InstrumentType.WOODWIND, "bagpipeSound", 20.00, 50.00, "Scotland");
        metronome = new Metronome(AccessoryType.METRONOMES, 20.00, 35.00, "pyramid");
    }

    @Test
    public void hasName(){
        assertEquals("hobgoblin music", musicShop.getName());
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, musicShop.countStock());
    }


    @Test
    public void checkAddToStock(){
        musicShop.addToStock(ukulele);
        musicShop.addToStock(bagpipe);
        assertEquals(2, musicShop.countStock());
    }


    @Test
    public void checkRemoveFromStock(){
        musicShop.addToStock(ukulele);
        musicShop.addToStock(bagpipe);
        musicShop.removeFromStock(ukulele);
        assertEquals(1, musicShop.countStock());
    }



}
