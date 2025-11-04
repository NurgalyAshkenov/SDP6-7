package factory;
import strategy.EmailNotification;
import strategy.NotificationStrategy;
public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public NotificationStrategy createNotification() {
        return new EmailNotification();
    }
}
