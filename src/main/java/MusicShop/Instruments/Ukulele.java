package MusicShop.Instruments;

public class Ukulele extends Instrument {

    private String tonalRange;

    public Ukulele(InstrumentType instrumentType, String sound, double buyingPrice, double sellingPrice, String tonalRange) {
        super(instrumentType, sound, buyingPrice, sellingPrice);
        this.tonalRange = tonalRange;
    }

    public String getTonalRange() {
        return tonalRange;
    }
}
