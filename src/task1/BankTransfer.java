package task1;

public class BankTransfer implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Payment by BANK TRANSFER has been processed");
    }
}
