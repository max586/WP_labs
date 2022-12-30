package AbstractFactory;

public class SwedenHigherSupplementaryPayment extends SwedenSupplementaryPayment{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*45/100;
    }
}
