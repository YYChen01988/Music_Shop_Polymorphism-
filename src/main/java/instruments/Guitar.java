package instruments;

public class Guitar extends Instrument{

    private int stringNumber;
    private InstrumentType type;

    public Guitar(String material, String color, int boughtPrice, int sellPrice, int stringNumber, InstrumentType type) {
        super(material, color, boughtPrice, sellPrice);
        this.stringNumber = stringNumber;
        this.type = InstrumentType.GUITAR;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public InstrumentType getType() {
        return type;
    }
}
