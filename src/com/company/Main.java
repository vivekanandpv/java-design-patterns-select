package com.company;

import com.company.Observer.MessageStream;
import com.company.Observer.Observer;
import com.company.Observer.PhoneClient;
import com.company.Observer.Subject;

public class Main {

    public static void main(String[] args) {
        Subject subject = new MessageStream();

        Observer phoneClient = new PhoneClient(subject);
        //  Will double as the observer added itself to the invocation list in its constructor
        subject.attach(phoneClient);

        subject.setState("Message being broadcast!");
    }
}
