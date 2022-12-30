package Prototype;

import java.util.Arrays;

public abstract class Multimedia{
    protected String name;
    protected String type="";
    protected int[] params;
    
    public Multimedia(String name, int[] params){
        this.name = name;
        this.params = params;
    }
    public abstract Multimedia clone();
    @Override
    public String toString(){
        return type+"\n"+name+"\n"+ Arrays.toString(params)+"\n-----------------\n";
    }
}
