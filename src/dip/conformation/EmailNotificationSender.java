package dip.conformation;

public class EmailNotificationSender implements INotificationSender {

    @Override
    public void sendNotification(int productId, int customerId) {
        System.out.println("EmailNotification sending..");
    }
}
