package Prototype;

public class Picture extends Multimedia{
    public Picture(String name, int[] params) {
        super(name, params);
        type = "picture";
    }

    @Override
    public Multimedia clone() {
        return new Picture(name, params);
    }
}
