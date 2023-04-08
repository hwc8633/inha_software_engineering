package week5;

import java.util.ArrayList;
import java.util.List;

public class LandCh implements Subject {
    private int price;
    private List<Subscriber> subscribers;

    public LandCh() {
        subscribers = new ArrayList<>();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifySubscriber();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        subscribers.forEach(s -> s.update());
    }
}
