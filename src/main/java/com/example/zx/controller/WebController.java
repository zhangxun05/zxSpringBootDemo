package com.example.zx.controller;

import com.example.zx.bean.Conf;
import com.example.zx.service.ConfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @Autowired
    private ConfService confService;

    //返回指定页面
    @RequestMapping("/index")
    public String  index(){
        return "index.html";
    }
    //返回指定文字
    @RequestMapping("/text")
    @ResponseBody
    public String  text(){
        return "hello word!";
    }

    //返回指定文字
    @RequestMapping("/index1")
    @ResponseBody
    public Conf index1(){
        return confService.getList();
    }
}
