package MusicShop.Instruments;

import MusicShop.Interfaces.IPlay;
import MusicShop.Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private InstrumentType instrumentType;
    private String sound;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(InstrumentType instrumentType, String sound, double buyingPrice, double sellingPrice){
        this.instrumentType = instrumentType;
        this.sound = sound;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String play() {
        return this.sound;
    }

    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }


}
