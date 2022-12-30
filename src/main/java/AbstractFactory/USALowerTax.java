package AbstractFactory;

public class USALowerTax extends USATax{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*20/100;
    }
}
