package task1;

public class CreditCard implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment by CREDIT CARD has been processed");
    }
}
