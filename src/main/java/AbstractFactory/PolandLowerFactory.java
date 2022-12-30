package AbstractFactory;

public class PolandLowerFactory extends Factory{
    @Override
    public SupplementaryPayment createSupplementaryPayment() {
        return new PolandLowerSupplementaryPayment();
    }

    @Override
    public Tax createTax() {
        return new PolandLowerTax();
    }
}
