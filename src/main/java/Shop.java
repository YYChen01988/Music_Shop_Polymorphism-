import behaviour.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stocks;

    public Shop() {
        this.stocks = new ArrayList<>();
    }

    public int getNumberOfStocking() {
        return this.stocks.size();
    }


    public void addItem(ISell item) {
        stocks.add(item);
    }


    public void sellItem(ISell item) {
        stocks.remove(item);
    }

    public int potentialProfit() {
        int total = 0;
        for(ISell item : stocks){
            total += item.calculateMarkup();
        }
        return total;
    }
}
