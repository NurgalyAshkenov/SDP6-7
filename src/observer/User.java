package observer;
import strategy.NotificationStrategy;
public class User implements Subscriber {
    private String name;
    private NotificationStrategy notificationStrategy;
    public User(String name, NotificationStrategy ns) {
        this.name = name;
        this.notificationStrategy = ns;
    }
    @Override
    public void update(String news) {
        notificationStrategy.sendNotification(name + ", new article: " + news);
    }
    @Override
    public void setNotificationStrategy(NotificationStrategy strategy) {
        this.notificationStrategy = strategy;
    }
}
