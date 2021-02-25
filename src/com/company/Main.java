package com.company;

public class Main {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        publisher.register(s -> System.out.println("Subscriber 1: " + s));
        publisher.register(s -> System.out.println("Subscriber 2: " + s));
        publisher.register(s -> System.out.println("Subscriber 3: " + s));
        publisher.register(s -> System.out.println("Subscriber 4: " + s));
        publisher.register(s -> System.out.println("Subscriber 5: " + s));

        publisher.announce();
        publisher.announce();
    }
}
