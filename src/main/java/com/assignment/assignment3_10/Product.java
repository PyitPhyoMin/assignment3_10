package com.assignment.assignment3_10;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

//Using Lombok library and annotations for methods.[Min]
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private final String id = UUID.randomUUID().toString();
    private String name;
    private double price;
    private String description;

}
