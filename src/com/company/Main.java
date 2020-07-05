package com.company;

import com.company.TemplateMethod.NormalOrder;
import com.company.TemplateMethod.OrderTemplate;
import com.company.TemplateMethod.PremiumOrder;

public class Main {

    public static void main(String[] args) {
        OrderTemplate premiumOrder = new PremiumOrder();
        OrderTemplate normalOrder = new NormalOrder();

        premiumOrder.process();
        normalOrder.process();
    }
}
