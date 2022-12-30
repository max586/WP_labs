package AbstractFactory;

public class USALowerFactory extends Factory{
    @Override
    public SupplementaryPayment createSupplementaryPayment() {
        return new USALowerSupplementaryPayment();
    }

    @Override
    public Tax createTax() {
        return new USALowerTax();
    }
}
