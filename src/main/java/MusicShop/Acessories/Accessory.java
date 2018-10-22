package MusicShop.Acessories;

import MusicShop.Interfaces.ISell;

public abstract class Accessory implements ISell {

    private AccessoryType accessoryType;
    private double buyingPrice;
    private double sellingPrice;

    public Accessory(AccessoryType accessoryType, double buyingPrice, double sellingPrice){
        this.accessoryType = accessoryType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
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

    @Override
    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }


}
