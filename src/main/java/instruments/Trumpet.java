package instruments;

public class Trumpet extends Instrument {

    private int valvesNumber;
    private InstrumentType type;

    public Trumpet(String material, String color, int boughtPrice, int sellPrice, int valvesNumber, InstrumentType type) {
        super(material, color, boughtPrice, sellPrice);
        this.valvesNumber = valvesNumber;
        this.type = type;
    }

    public int getValvesNumber() {
        return valvesNumber;
    }

    public InstrumentType getType() {
        return type;
    }
}
