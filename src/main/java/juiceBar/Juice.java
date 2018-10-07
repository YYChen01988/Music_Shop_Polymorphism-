package juiceBar;

public class Juice implements ISell, Upgradable {
//    private String type;
    private  int boughtPrice;
    private int sellPrice;

    public Juice(String type, int boughtPrice, int sellPrice) {
//        this.type = type;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }


//    public String getType() {
//        return type;
//    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public int calculateMarkup() {
        return sellPrice-boughtPrice;
    }


    @Override
    public void upgradeDrink() {
        boughtPrice +=10;
        sellPrice += 50;
    }
}
