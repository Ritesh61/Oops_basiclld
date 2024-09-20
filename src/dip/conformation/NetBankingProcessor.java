package dip.conformation;

public class NetBankingProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(int productId, int customerId) {
        System.out.println("NetBankingPayment processing...");
    }
}
