package AbstractFactory;

public class USAHigherFactory extends Factory{
    @Override
    public SupplementaryPayment createSupplementaryPayment() {
        return new USAHigherSupplementaryPayment();
    }

    @Override
    public Tax createTax() {
        return new USAHigherTax();
    }
}
