package Facade;

public class Instrument {
    int id;
    boolean isRegistered;

    public int getId() {
        return id;
    }

    public Instrument(int id){
        this.id = id;
        this.isRegistered=false;
    }
    public void register(){
        this.isRegistered=true;
    }
    public void unregister(){
        this.isRegistered = false;
    }
}
