package AbstractFactory;

public class PolandLowerTax extends PolandTax{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*18/100;
    }
}
