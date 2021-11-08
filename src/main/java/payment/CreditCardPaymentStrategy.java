package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("Payed " + price + " with Credit Card");
        return true;
    }
}
