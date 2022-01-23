package com.kamil.expenses;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Controller
public class ExpensesPageController {

    @RequestMapping(method = RequestMethod.GET, produces = "text/html", path = "/expenses")
    @ResponseBody
    public String renderPage() {
        InputStream is = ExpensesController.class.getClassLoader().getResourceAsStream("templates/expenses.html");
        String response = new BufferedReader(new InputStreamReader(is))
                .lines()
                .collect(Collectors.joining("\n"));
        return response;
    }
}
