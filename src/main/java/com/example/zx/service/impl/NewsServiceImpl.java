package com.example.zx.service.impl;

import com.example.zx.bean.News;
import com.example.zx.mapper.NewsMapper;
import com.example.zx.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> getList() {

        return newsMapper.getList();
    }

    @Override
    public News getObjById(Integer id) {
        return newsMapper.getObjById(id);
    }

    @Override
    public Boolean saveOrUpdate(News news) {
        if(news.getId()!=null){
            return newsMapper.update(news);
        }else {
            news.setCreate_time(new Date());
        }
        return newsMapper.save(news);
    }

    @Override
    public Boolean delete(News news) {

        return newsMapper.delete(news);
    }
}
