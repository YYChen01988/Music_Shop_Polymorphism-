package instruments;

public class Guitar extends Instrument{

    private int stringNumber;
    public Guitar(String material, String color, String type) {
        super(material, color, type);

        this.stringNumber = stringNumber;
    }
}
