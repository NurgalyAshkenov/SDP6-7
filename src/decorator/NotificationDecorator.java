package decorator;
import strategy.NotificationStrategy;
public abstract class NotificationDecorator implements NotificationStrategy {
    protected NotificationStrategy wrapped;
    public NotificationDecorator(NotificationStrategy wrapped) {
        this.wrapped = wrapped;
    }
}
