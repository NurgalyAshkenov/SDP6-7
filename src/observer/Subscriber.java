package observer;
import strategy.NotificationStrategy;
public interface Subscriber {
    void update(String news);
    void setNotificationStrategy(NotificationStrategy strategy);
}