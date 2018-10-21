package MusicShop.Instruments;

public class Cello extends Instrument {

    private String size;

    public Cello(InstrumentType instrumentType, String sound, double buyingPrice, double sellingPrice, String size) {
        super(instrumentType, sound, buyingPrice, sellingPrice);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
