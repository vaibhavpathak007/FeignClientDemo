package com.dev.consumer.controller;

import com.dev.consumer.client.MathServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    MathServiceClient mathHelper;

    @GetMapping("/perform-calculation")
    public List<String> performCall(){
        List<String> resultList = new ArrayList<>();
        resultList.add("add(10, 20): "+ mathHelper.add(10,20));
        resultList.add("multiply(10, 20): "+ mathHelper.multiply(10,20));
        resultList.add("square(10): "+ mathHelper.square(10));
        return resultList;
    }

}
