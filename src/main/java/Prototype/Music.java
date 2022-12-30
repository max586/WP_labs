package Prototype;

public class Music extends Multimedia{
    public Music(String name, int[] params) {
        super(name, params);
        type = "music";
    }

    @Override
    public Multimedia clone() {
        return new Music(name, params.clone());
    }
}
