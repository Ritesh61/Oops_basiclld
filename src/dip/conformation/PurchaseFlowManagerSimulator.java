package dip.conformation;

public class PurchaseFlowManagerSimulator {

    public static void main(String[] args) {
        PurchaseFlowManager purchaseFlowManager = new PurchaseFlowManager(new NetBankingProcessor(), new EmailNotificationSender());
                purchaseFlowManager.triggerPurchaseFlow(1, 2);
        System.out.println("************");
        PurchaseFlowManager alternatePurchaseFlowManager = new PurchaseFlowManager (new UpiPaymentProcessor(), new SmsNotificationSender());
        alternatePurchaseFlowManager.triggerPurchaseFlow(1,  3);
    }
}
