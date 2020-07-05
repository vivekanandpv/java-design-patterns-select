package com.company.Observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {
    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    public void setState(String state) {
        this.messageHistory.add(state);
        this.notifyObservers();
    }

    @Override
    public String getState() {
        return this.messageHistory.getLast();
    }
}
