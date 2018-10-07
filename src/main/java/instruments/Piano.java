package instruments;

public class Piano extends Instrument {

    private InstrumentType type;

    public Piano(String material, String color, int boughtPrice, int sellPrice, InstrumentType type) {
        super(material, color, boughtPrice, sellPrice);
        this.type = InstrumentType.PIANO;
    }

    public InstrumentType getType() {
        return type;
    }
}
