package MusicShop.Instruments;

public class Bagpipe extends Instrument{

    String origin;

    public Bagpipe(InstrumentType instrumentType, String sound, double buyingPrice, double sellingPrice, String origin) {
        super(instrumentType, sound, buyingPrice, sellingPrice);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }
}
