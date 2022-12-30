package Prototype;

public class Movie extends Multimedia{
    public Movie(String name, int[] params) {
        super(name, params);
        type = "movie";
    }

    @Override
    public Multimedia clone() {
        return new Movie(name, params);
    }
}
