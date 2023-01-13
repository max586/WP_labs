package Visitor;

public class YearlyCostVisitor extends Visitor{
    @Override
    public double visit(AutoPart el) {
        return el.yearlyCost();
    }
}
