package com.dev.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service

@FeignClient(value = "math-service/math")
public interface MathServiceClient {

    @RequestMapping(method = RequestMethod.GET, value =  "/add/{a}/{b}")
    public Integer add(@PathVariable Integer a, @PathVariable Integer b);

    @RequestMapping(method = RequestMethod.GET, value    = "/multiply/{a}/{b}")
    public Integer multiply(@PathVariable Integer a, @PathVariable Integer b);

    @RequestMapping(method = RequestMethod.GET, value = "/square/{a}")
    public Integer square(@PathVariable Integer a);
}
