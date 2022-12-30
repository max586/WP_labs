package AbstractFactory;

public class SwedenHigherFactory extends Factory{
    @Override
    public SupplementaryPayment createSupplementaryPayment() {
        return new SwedenHigherSupplementaryPayment();
    }

    @Override
    public Tax createTax() {
        return new SwedenHigherTax();
    }
}
