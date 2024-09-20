package dip.conformation;

public interface IPaymentProcessor {

    void processPayment(int productId, int customerId);
}
