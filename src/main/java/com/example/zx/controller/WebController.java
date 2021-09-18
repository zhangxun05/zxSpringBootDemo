package com.example.zx.controller;

import com.example.zx.bean.Conf;
import com.example.zx.service.ConfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
    @Autowired
    private ConfService confService;

    //返回指定页面
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("dis","asdasdasdaadasda");
        mv.addObject("dis1","1111");
        return mv;
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
