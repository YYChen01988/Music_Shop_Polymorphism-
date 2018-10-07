package instruments;

import juiceBar.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String color;
//    private  String type;
    private  int boughtPrice;
    private int sellPrice;

    public Instrument(String material, String color, int boughtPrice, int sellPrice) {
        this.material = material;
        this.color = color;
//        this.type = type;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public String play(String sound) {
        return sound;
    }

    @Override
    public int calculateMarkup() {
        return sellPrice-boughtPrice;
    }
}
