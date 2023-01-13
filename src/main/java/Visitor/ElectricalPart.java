package Visitor;

public class ElectricalPart extends AutoPart{
    @Override
    public double fabricationCost() {
        return 20;
    }

    @Override
    public double fabricationTime() {
        return 20;
    }

    @Override
    public double avgUsageTime() {
        return 20;
    }

    @Override
    public double yearlyCost() {
        return 20;
    }
}
