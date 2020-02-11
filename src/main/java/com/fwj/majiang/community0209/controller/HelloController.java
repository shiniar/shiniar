package com.fwj.majiang.community0209.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//识别扫描当前的类，把它当作spring的一个bean管理 并允许这个类接收前端的请求
public class HelloController {
    @GetMapping("/")
    public String index(){ return "index"; }
}
