package Visitor;

public class FabrictaionCostVisitor extends Visitor{
    @Override
    public double visit(AutoPart el) {
        return el.fabricationCost();
    }
}
