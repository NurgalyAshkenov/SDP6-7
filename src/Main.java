import factory.EmailNotificationFactory;
import factory.PushNotificationFactory;
import factory.SMSNotificationFactory;
import factory.NotificationFactory;
import decorator.LoggingNotificationDecorator;
import observer.*;
import strategy.NotificationStrategy;
public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationFactory smsFactory = new SMSNotificationFactory();
        NotificationFactory pushFactory = new PushNotificationFactory();

        NotificationStrategy emailWithLogging = new LoggingNotificationDecorator(emailFactory.createNotification());
        NotificationStrategy sms = smsFactory.createNotification();
        Subscriber Nurik = new User("Nurik", emailWithLogging);
        Subscriber Nurgaly = new User("Nurgaly", sms);
        agency.subscribe(Nurik);
        agency.subscribe(Nurgaly);

        agency.addNews("Breaking news: Major event!");
        NotificationStrategy pushWithLogging = new LoggingNotificationDecorator(pushFactory.createNotification());
        Nurik.setNotificationStrategy(pushWithLogging);
        agency.addNews("Update: Details revealed.");
    }
}
