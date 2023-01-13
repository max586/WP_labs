package Visitor;

import java.util.List;

public class client {
    public static void main(String[] args) {
        var autoParts = List.of(new BodyPart(), new ElectricalPart(), new SuspentionPart());
        var visitors = List.of(new FabricationTimeVisitor(), new FabrictaionCostVisitor(),
                new AvgUsageTimeVisitor(), new YearlyCostVisitor());
        for(var autoPart: autoParts){
            System.out.println("auto part: "+autoPart.getClass());
            for(var visitor: visitors){
                System.out.println("visitor: "+visitor.getClass());
                System.out.println(autoPart.accept(visitor));
            }
        }
    }
}
