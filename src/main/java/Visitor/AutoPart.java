package Visitor;

public abstract class AutoPart {
    public abstract double fabricationCost();
    public abstract double fabricationTime();
    public abstract double avgUsageTime();
    public abstract double yearlyCost();
    public double accept(Visitor visitor){
        return visitor.visit(this);
    }
}
