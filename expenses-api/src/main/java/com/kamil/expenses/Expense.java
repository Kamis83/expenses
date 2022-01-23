package com.kamil.expenses;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Expense {
    private String description;
    private BigDecimal price;
    public static Integer whatever;

    public void tellMeThePrice() {
        System.out.println(description + " has a price " + price);
    }

    public static void tellMeThePrice(String description, BigDecimal price) {
        System.out.println(whatever);
    }
}
