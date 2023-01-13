package Visitor;

public class AvgUsageTimeVisitor extends Visitor{
    @Override
    public double visit(AutoPart el) {
        return el.avgUsageTime();
    }
}
