package com.company;

import com.company.Strategy.Customer;
import com.company.Strategy.PrimeApprovalStrategy;
import com.company.Strategy.SubprimeApprovalStrategy;

public class Main {

    public static void main(String[] args) {
        Customer c1 = new Customer(new PrimeApprovalStrategy());

        c1.setCreditHistory(65);
        c1.setCreditScore(758);
        c1.setCreditRatio(0.45);

        System.out.println("Customer c1 approval status: " + c1.isApproved());

        Customer c2 = new Customer(new SubprimeApprovalStrategy());

        c2.setCreditHistory(65);
        c2.setCreditScore(758);
        c2.setCreditRatio(0.45);

        System.out.println("Customer c2 approval status: " + c2.isApproved());

    }
}
