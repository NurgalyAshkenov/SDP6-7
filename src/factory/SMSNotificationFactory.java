package factory;
import strategy.SMSNotification;
import strategy.NotificationStrategy;
public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public NotificationStrategy createNotification() {
        return new SMSNotification();
    }
}
