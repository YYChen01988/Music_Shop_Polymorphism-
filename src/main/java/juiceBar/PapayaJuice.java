package juiceBar;

public class PapayaJuice extends Juice {

    private JuiceType type;

    public PapayaJuice(String type, int boughtPrice, int sellPrice, JuiceType type1) {
        super(type, boughtPrice, sellPrice);
        this.type = JuiceType.PAPAYA;
    }

    public JuiceType getType() {
        return type;
    }

}
