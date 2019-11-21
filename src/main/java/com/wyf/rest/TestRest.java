package com.wyf.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yswzw
 * @Date: 2019/11/21 14:43
 * @Description:
 */
@RestController
@RequestMapping
public class TestRest {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
