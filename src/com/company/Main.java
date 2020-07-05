package com.company;

import com.company.Proxy.CardSwiper;
import com.company.Proxy.PoSProxy;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        CardSwiper cardSwiper = new PoSProxy();

        cardSwiper.swipeCard("123456789", 100.25);
        System.out.println(cardSwiper.getReport(new Date()));
    }
}
