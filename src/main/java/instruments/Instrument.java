package instruments;

public abstract class Instrument implements IPlay {

    private String material;
    private String color;
    private  String type;

    public Instrument(String material, String color, String type) {
        this.material = material;
        this.color = color;
        this.type = type;
    }

    @Override
    public String play(String sound) {
        return sound;
    }
}
