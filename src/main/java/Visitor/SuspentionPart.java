package Visitor;

public class SuspentionPart extends AutoPart{
    @Override
    public double fabricationCost() {
        return 30;
    }

    @Override
    public double fabricationTime() {
        return 30;
    }

    @Override
    public double avgUsageTime() {return 30;}

    @Override
    public double yearlyCost() {
        return 30;
    }
}
