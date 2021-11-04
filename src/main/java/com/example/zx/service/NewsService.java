package com.example.zx.service;

import com.example.zx.bean.News;

import java.util.List;

public interface NewsService {

    List<News> getList();

    News getObjById(Integer id);

    Boolean saveOrUpdate(News news);
}
