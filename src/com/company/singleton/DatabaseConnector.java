package com.company.singleton;

public class DatabaseConnector {
    private static volatile DatabaseConnector instance;

    private DatabaseConnector() {
    }

    public synchronized static DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }

        return instance;
    }
}
