package com.bbs.comparable.demo;

import com.bbs.comparable.entity.Order;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        var order1 = new Order(1L, LocalDate.now(),1);
        var order2 = new Order(2L, LocalDate.of(2023,1,10),2);
        var order3 = new Order(1L, LocalDate.of(2023,12,21),3);
        var order4 = new Order(4L, LocalDate.of(2022,5,6),4);
        var order5 = new Order(4L, LocalDate.of(2024,6,14),5);

        var orders = List.of(order1,order2,order3,order4,order5);

        List<Order> orderedOrders = orders.stream()
                .peek(Demo::p)
                .sorted()
                .peek(Demo::p)
                .toList();
    }

    private static<T> void p(T t) {
        System.out.println(" -->" + t);
    }
}
