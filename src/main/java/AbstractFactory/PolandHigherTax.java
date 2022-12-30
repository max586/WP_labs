package AbstractFactory;

public class PolandHigherTax extends PolandTax{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*32/100;
    }
}
