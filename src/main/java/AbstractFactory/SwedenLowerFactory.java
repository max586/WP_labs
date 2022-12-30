package AbstractFactory;

public class SwedenLowerFactory extends Factory{
    @Override
    public SupplementaryPayment createSupplementaryPayment() {
        return new SwedenLowerSupplementaryPayment();
    }

    @Override
    public Tax createTax() {
        return new SwedenLowerTax();
    }
}
