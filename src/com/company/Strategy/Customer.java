package com.company.Strategy;

import java.util.function.Predicate;

public class Customer {
    private int creditScore;
    private double creditRatio;
    private int creditHistory;

    public boolean isApproved(Predicate<Customer> strategy) {
        return strategy.test(this);
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getCreditRatio() {
        return creditRatio;
    }

    public void setCreditRatio(double creditRatio) {
        this.creditRatio = creditRatio;
    }

    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }
}
