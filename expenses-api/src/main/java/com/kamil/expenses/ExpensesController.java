package com.kamil.expenses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ExpensesController {

    @GetMapping("hello/{name}")
    public Expense helloWorld(@PathVariable String name) {
        Expense expense = new Expense();
        expense.setPrice(new BigDecimal("10.23"));
        expense.setDescription(name);
        return expense;
    }
}
