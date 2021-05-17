package com.dev.math.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/add/{a}/{b}")
    public Integer add(@PathVariable Integer a, @PathVariable Integer b) {
        return a+b;
    }

    @GetMapping("/multiply/{a}/{b}")
    public Integer multiply(@PathVariable Integer a, @PathVariable Integer b) {
        return a*b;
    }

    @GetMapping("/square/{a}")
    public Integer square(@PathVariable Integer a) {
        return a*a;
    }

}
