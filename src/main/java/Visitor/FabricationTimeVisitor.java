package Visitor;

public class FabricationTimeVisitor extends Visitor{
    @Override
    public double visit(AutoPart el) {
        return el.fabricationTime();
    }
}
