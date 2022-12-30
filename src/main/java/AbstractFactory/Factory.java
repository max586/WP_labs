package AbstractFactory;

public abstract class Factory {
    private static final Country country=Country.USA;
    private static final PaymentType paymentType=PaymentType.HIGHER;
    public abstract SupplementaryPayment createSupplementaryPayment();
    public abstract Tax createTax();
    public static Factory get(){
        switch(country){
            case POLAND -> {
                switch(paymentType){
                    case LOWER -> {return new PolandLowerFactory();}
                    case HIGHER -> {return new PolandHigherFactory();}
                }
            } case USA -> {
                switch(paymentType){
                    case LOWER -> {return new USALowerFactory();}
                    case HIGHER -> {return new USAHigherFactory();}
                }
            } case SWEDEN -> {
                switch(paymentType){
                    case LOWER -> {return new SwedenLowerFactory();}
                    case HIGHER -> {return new SwedenHigherFactory();}
                }
            }
        }
        return null;
    }
}
