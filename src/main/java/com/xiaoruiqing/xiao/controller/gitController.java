package com.xiaoruiqing.xiao.controller;/*
@auther XiaoRuiQing
@Date 2018/12/8
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("git")
public class gitController {
    public String hello(){
        System.out.println("xrqing");
        return "hello";
    }
}
