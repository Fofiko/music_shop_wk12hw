package MusicShop;

import MusicShop.Interfaces.ISell;

import java.util.Comparator;

public class PriceComparator implements Comparator<ISell> {


    @Override
    public int compare(ISell o1, ISell o2) {
        return (int)(o2.getSellingPrice() - o1.getSellingPrice());
    }
}
