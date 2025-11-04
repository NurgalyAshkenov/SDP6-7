package factory;
import strategy.NotificationStrategy;
public interface NotificationFactory {
    NotificationStrategy createNotification();
}
