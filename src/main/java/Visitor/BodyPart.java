package Visitor;

public class BodyPart extends AutoPart{
    @Override
    public double fabricationCost() {
        return 10;
    }

    @Override
    public double fabricationTime() {
        return 10;
    }

    @Override
    public double avgUsageTime() {
        return 10;
    }

    @Override
    public double yearlyCost() {
        return 10;
    }
}
