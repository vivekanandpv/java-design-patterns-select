package com.company;

@FunctionalInterface
public interface ISubscriber {
    void notify(String message);
}
