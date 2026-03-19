package task1;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new BankTransfer();

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();

    }
}
