package com.log_demo.demo.controller;

import com.log_demo.demo.common.AjaxObject;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestDemo {

    @GetMapping("/demo1")
    public AjaxObject test(){
        return AjaxObject.ok("");
    }
}
