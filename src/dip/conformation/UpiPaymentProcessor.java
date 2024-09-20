package dip.conformation;

public class UpiPaymentProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(int productId, int customerId) {
        System.out.println("UPIPayment processing...");
    }
}
