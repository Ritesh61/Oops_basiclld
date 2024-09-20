package dip.conformation;

public class SmsNotificationSender implements INotificationSender {
    @Override
    public void sendNotification(int productId, int customerId) {
        System.out.println("SmsNotification sending..");
    }
}
