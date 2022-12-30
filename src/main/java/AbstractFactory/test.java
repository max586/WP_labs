package AbstractFactory;

public class test {
    public static void main(String[] args){
        Double baseAmount = 100000D;
        Factory fact = Factory.get();
        SupplementaryPayment sp = fact.createSupplementaryPayment();
        Double amountToTax = sp.calculate(baseAmount);
        Tax tax = fact.createTax();
        System.out.println(tax.calculate(amountToTax));
    }
}
