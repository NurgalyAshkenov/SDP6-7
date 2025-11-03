package decorator;
import strategy.NotificationStrategy;
public class LoggingNotificationDecorator extends NotificationDecorator {
    public LoggingNotificationDecorator(NotificationStrategy wrapped) {
        super(wrapped);
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("[LOG] Sending notification: " + message);
        wrapped.sendNotification(message);
    }
}
