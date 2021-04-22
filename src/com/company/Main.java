package com.company;

import com.company.Strategy.Customer;

public class Main {

    public static void main(String[] args) {
        Customer c1 = new Customer();

        c1.setCreditHistory(65);
        c1.setCreditScore(758);
        c1.setCreditRatio(0.45);

        boolean c1Result = c1.isApproved(c -> {
            return c.getCreditHistory() > 60
                    && c.getCreditScore() > 750
                    && c.getCreditRatio() < 0.4;
        });

        System.out.println("Customer c1 approval status: " + c1Result);

        Customer c2 = new Customer();

        c2.setCreditHistory(65);
        c2.setCreditScore(758);
        c2.setCreditRatio(0.45);

        boolean c2Result = c2.isApproved(c -> {
            return c.getCreditHistory() > 12
                    && c.getCreditScore() > 600
                    && c.getCreditRatio() < 0.7;
        });

        System.out.println("Customer c2 approval status: " + c2Result);

    }
}
