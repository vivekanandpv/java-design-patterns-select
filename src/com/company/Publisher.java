package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<ISubscriber> subscribers = new ArrayList<>();

    public void announce() {
        for(ISubscriber subscriber: subscribers) {
            subscriber.notify("Announcement made");
        }
    }

    public void register(ISubscriber subscriber) {
        this.subscribers.add(subscriber);
    }
}
