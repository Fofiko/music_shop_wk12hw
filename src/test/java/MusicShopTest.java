import MusicShop.Acessories.AccessoryType;
import MusicShop.Acessories.Metronome;
import MusicShop.Instruments.*;
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
    Cello cello;
    Harmonica harmonica;

    @Before
    public void before(){
        musicShop = new MusicShop("hobgoblin music");
        ukulele = new Ukulele(InstrumentType.FRETTED, "ukuSound", 17.00, 32.00, "soprano");
        bagpipe = new Bagpipe(InstrumentType.WOODWIND, "bagpipeSound", 20.00, 50.00, "Scotland");
        metronome = new Metronome(AccessoryType.METRONOMES, 20.00, 35.00, "pyramid");
        cello = new Cello(InstrumentType.STRINGED, "celloSound", 10.00, 20.00, "suzuki");
        harmonica = new Harmonica(InstrumentType.SQUEEZEBOX, "harmonicaSound", 5.00, 10.00, "chromatic");
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

    @Test
    public void calculateTotalStockMarkup(){
        musicShop.addToStock(ukulele);
        musicShop.addToStock(bagpipe);
        musicShop.addToStock(metronome);
        assertEquals(60.00, musicShop.getStockMarkup(), 0.10);
    }

    @Test
    public void sortStockPriceHighToLow(){
        musicShop.addToStock(ukulele);
        musicShop.addToStock(bagpipe);
        musicShop.sortStockByItem();
    }

}
