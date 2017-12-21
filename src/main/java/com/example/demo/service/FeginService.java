package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "${baidumap.url}", name = "bmurl")
public interface FeginService {

    @RequestMapping(value = "/wxtest/v2/applications/status/count", method = RequestMethod.GET)
    String test();
}
