package com.example.zx.controller;

import com.example.zx.bean.Conf;
import com.example.zx.bean.News;
import com.example.zx.service.ConfService;
import com.example.zx.service.NewsService;
import com.example.zx.tools.ResposeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    private ConfService confService;
    @Autowired
    private NewsService newsService;

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

    //返回指定页面
    @RequestMapping("/news_list")
    public ModelAndView news_list(){
        ModelAndView mv = new ModelAndView("news/list");
        List<News> list = newsService.getList();
        mv.addObject("list",list);
        mv.addObject("title","新闻列表");
        return mv;
    }

    //返回指定页面
    @RequestMapping("/news_view")
    public ModelAndView news_view(Integer id){
        ModelAndView mv = new ModelAndView("news/add");
        mv.addObject("title","新闻增加");
        News obj = new News();
        if(null != id){
            obj = newsService.getObjById(id);
            mv.addObject("title","新闻编辑");
        }
        mv.addObject("obj",obj);

        return mv;
    }

    //返回指定页面
    @RequestMapping("/news_save")
    @ResponseBody
    public ResposeData news_save(News news){
        this.newsService.saveOrUpdate(news);

        return new ResposeData(true,"保存成功",null);
    }

}
