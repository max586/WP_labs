package Prototype;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Multimedia> l = new ArrayList<>();
        l.add(new Music("aba",new int[]{1,2,3}));
        l.add(new Movie("aka", new int[]{4,5,6}));
        l.add(new Picture("ppo", new int[]{7,8,9}));
        
        List<Multimedia> lCopy = new ArrayList<>();
        for(Multimedia mult: l){
            lCopy.add(mult.clone());
        }
        
        for(Multimedia mult: lCopy){
            System.out.println(mult);
        }
    }
}
