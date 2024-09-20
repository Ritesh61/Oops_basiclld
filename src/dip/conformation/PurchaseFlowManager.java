package dip.conformation;

public class PurchaseFlowManager {

    private final IPaymentProcessor iPaymentProcessor;
    private final INotificationSender iNotificationSender;

    /**
     * Dependency Injection
     * @param iPaymentProcessor
     * @param iNotificationSender
     */
    public PurchaseFlowManager(IPaymentProcessor iPaymentProcessor, INotificationSender iNotificationSender) {
        this.iPaymentProcessor = iPaymentProcessor;
        this.iNotificationSender = iNotificationSender;
    }

    public void triggerPurchaseFlow(int productId, int customerId) {
        iPaymentProcessor.processPayment(productId, customerId);
        iNotificationSender.sendNotification(productId, customerId);
    }
}
