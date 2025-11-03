import factory.NotificationFactory;
import decorator.LoggingNotificationDecorator;
import observer.*;
import strategy.NotificationStrategy;
public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NotificationStrategy emailWithLogging = new LoggingNotificationDecorator(
                NotificationFactory.createNotification("EMAIL"));
        NotificationStrategy sms = NotificationFactory.createNotification("SMS");
        Subscriber alice = new User("Alice", emailWithLogging);
        Subscriber bob = new User("Bob", sms);
        agency.subscribe(alice);
        agency.subscribe(bob);
        agency.addNews("Breaking news: Major event!");

        NotificationStrategy pushWithLogging = new LoggingNotificationDecorator(
                NotificationFactory.createNotification("PUSH"));
        alice.setNotificationStrategy(pushWithLogging);

        agency.addNews("Update: Details revealed.");
    }
}
