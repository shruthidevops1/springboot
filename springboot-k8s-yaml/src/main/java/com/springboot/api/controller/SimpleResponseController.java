package com.springboot.api.controller;

import com.springboot.api.service.SimpleResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/now")
public class SimpleResponseController {

    @Autowired
    private SimpleResponseService simpleResponseService;

    @RequestMapping(method = RequestMethod.GET)
    public String hello(@RequestParam(name = "timezone", required = false) String timezone) {
        return Optional.ofNullable(timezone)
                .map(simpleResponseService::buildAndReturnResponse)
                .orElse(simpleResponseService.buildAndReturnResponse());
    }

}
