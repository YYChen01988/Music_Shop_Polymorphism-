package juiceBar;

public class AppleJuice extends Juice {

    private JuiceType type;
    public AppleJuice(String type, int boughtPrice, int sellPrice, JuiceType type1) {
        super(type, boughtPrice, sellPrice);
        this.type = JuiceType.APPLE;
    }

    public JuiceType getType() {
        return type;
    }
}
