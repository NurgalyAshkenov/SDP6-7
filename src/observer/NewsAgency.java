package observer;
import java.util.ArrayList;
import java.util.List;
public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(String news) {
        for (Subscriber sub : subscribers) {
            sub.update(news);
        }
    }
    public void addNews(String news) {
        System.out.println("New article published: " + news);
        notifySubscribers(news);
    }
}
