package MusicShop.Instruments;

public class Harmonica extends Instrument {

    private String version;

    public Harmonica(InstrumentType instrumentType, String sound, double buyingPrice, double sellingPrice, String version) {
        super(instrumentType, sound, buyingPrice, sellingPrice);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
