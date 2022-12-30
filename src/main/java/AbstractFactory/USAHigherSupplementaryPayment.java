package AbstractFactory;

public class USAHigherSupplementaryPayment extends USASupplementaryPayment{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*40/100;
    }
}
