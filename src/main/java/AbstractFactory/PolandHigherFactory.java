package AbstractFactory;

public class PolandHigherFactory extends Factory{
    @Override
    public SupplementaryPayment createSupplementaryPayment() {
        return new PolandHigherSupplementaryPayment();
    }

    @Override
    public Tax createTax() {
        return new PolandHigherTax();
    }
}
