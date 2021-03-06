package MusicShop;

import MusicShop.Interfaces.ISell;
import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.sort;

public class MusicShop {

    private String name;
    private ArrayList<ISell> stock;

    public MusicShop(String name) {
        this.name = "hobgoblin music";
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int countStock() {
        return stock.size();
    }

    public void addToStock(ISell stockItem) {
        this.stock.add(stockItem);
    }

    public void removeFromStock(ISell stockItem) {
        this.stock.remove(stockItem);
    }


    public double getStockMarkup() {
        double stockMarkup = 0;
        for (ISell stockItem : stock) {
            stockMarkup += stockItem.calculateMarkup();
        }
        return stockMarkup;
    }


    public void sortStockByItem(){
        Collections.sort(stock, new PriceComparator());
    }



}
