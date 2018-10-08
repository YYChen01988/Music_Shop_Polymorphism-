import behaviour.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stocks;
    private ArrayList<ISell> soldItems;


    public Shop() {
        this.stocks = new ArrayList<>();
        this.soldItems = new ArrayList<>();

    }

    public int getNumberOfStocking() {
        return this.stocks.size();
    }


    public void addItem(ISell item) {
        stocks.add(item);
    }


    public void sellItem(ISell item) {
        ISell removeItem = null;
        for (ISell good : stocks){
            if(good == item){
                removeItem = good;
            }
        }
        stocks.remove(removeItem);
        soldItems.add(removeItem);
    }

    public int potentialProfit() {
        int total = 0;
        for(ISell item : stocks){
            total += item.calculateMarkup();
        }
        return total;
    }

    public int profit(){
        int total = 0;
        for(ISell item : soldItems){
            total+= item.calculateMarkup();
        }
        return total;
    }


    public String meetTarget() {
        if(profit()> potentialProfit()*0.8){
            return "Wonderful, You meet the target";
        }else{
            return "Work Harder!";
        }
    }
}
