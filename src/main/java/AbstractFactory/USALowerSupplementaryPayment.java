package AbstractFactory;

public class USALowerSupplementaryPayment extends USASupplementaryPayment{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*20/100;
    }
}
