package task1;

public class PayPal implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment by PAYPAL has been processed");
    }
}
