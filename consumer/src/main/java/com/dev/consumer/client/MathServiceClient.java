package com.dev.consumer.client;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "math-service/math")
public interface MathServiceClient {


    @RequestMapping(method = RequestMethod.GET, value = "/add/{a}/{b}")
    @Retry(name = "default", fallbackMethod = "mathFallback")
    Integer add(@PathVariable Integer a, @PathVariable Integer b);

    @RequestMapping(method = RequestMethod.GET, value = "/multiply/{a}/{b}")
    @Retry(name = "default", fallbackMethod = "mathFallback")
    Integer multiply(@PathVariable Integer a, @PathVariable Integer b);

    @RequestMapping(method = RequestMethod.GET, value = "/square/{a}")
    @Retry(name = "default", fallbackMethod = "squareFallback")
    Integer square(@PathVariable Integer a);

    default Integer mathFallback(Integer a, Integer b, Exception ex) {
        return 0;
    }

    default Integer squareFallback(Integer a, Exception ex) {
        return 0;
    }
}
