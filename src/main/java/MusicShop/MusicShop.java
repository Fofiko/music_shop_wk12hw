package MusicShop;

import MusicShop.Interfaces.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> stock;

    public MusicShop(String name, ArrayList<ISell> stock) {
        this.name = "hobgoblin music";
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return this.stock.size();
    }
}
