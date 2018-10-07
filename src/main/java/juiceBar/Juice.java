package juiceBar;

public class Juice implements ISell {
    private String type;
    private  int boughtPrice;
    private int sellPrice;

    public Juice(String type, int boughtPrice, int sellPrice) {
        this.type = type;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }


    public String getType() {
        return type;
    }

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


}
