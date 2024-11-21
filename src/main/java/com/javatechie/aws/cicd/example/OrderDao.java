package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> getOrders() {
        return Stream.of(
                new Order(101, "tv", 1, 30000),
                new Order(58, "fridge", 4, 2000),
                new Order(205, "desktop", 1, 150000),
                new Order(809, "AC", 1, 1799))
                .collect(Collectors.toList());
    }
}
