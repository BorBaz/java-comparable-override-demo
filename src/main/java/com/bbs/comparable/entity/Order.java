package com.bbs.comparable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Order implements Comparable<Order> {

    private Long orderId;
    private LocalDate orderDate;
    private Integer clock;


    @Override
    public int compareTo(Order other) {
        int orderIdComparison = this.orderId.compareTo(other.orderId);
        if (orderIdComparison != 0) {
            // Si los orderId son diferentes, se devuelve el resultado de la comparación de los orderId
            return orderIdComparison;
        } else {
            // Si los orderId son iguales, se devuelve el resultado de la comparación de los orderDate
            return this.orderDate.compareTo(other.orderDate);
        }
    }
}
