package MusicShop.Acessories;

public class Metronome extends Accessory{

    private String shape;

    public Metronome(AccessoryType accessoryType, double buyingPrice, double sellingPrice, String shape) {
        super(accessoryType, buyingPrice, sellingPrice);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
