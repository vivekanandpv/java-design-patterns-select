package com.company;

import com.company.singleton.DatabaseConnector;

public class Main {

    public static void main(String[] args) {
        DatabaseConnector connector1 = DatabaseConnector.getInstance();
        DatabaseConnector connector2 = DatabaseConnector.getInstance();

        System.out.println(connector1 == connector2);
    }
}
