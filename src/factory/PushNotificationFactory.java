package factory;
import strategy.PushNotification;
import strategy.NotificationStrategy;
public class PushNotificationFactory implements NotificationFactory {
    @Override
    public NotificationStrategy createNotification() {
        return new PushNotification();
    }
}
