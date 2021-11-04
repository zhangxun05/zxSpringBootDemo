package com.example.zx.mapper;

import com.example.zx.bean.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface NewsMapper {

    @Select("select * from sys_news")
    List<News> getList();
    @Select("select * from sys_news where id =#{id} ")
    News getObjById(@Param("id") Integer id);

    @Insert("insert into sys_news (`time`,`title`,`content`,`create_time`) " +
            "valus(#{news.time},#{news.title},#{news.content},#{news.create_time})")
    Boolean save(@Param("news") News news);

    @Update("update sys_news set `time`=#{news.time},title=#{news.title}," +
            "create_time=#{news.create_time},content=#{news.content} where id=#{news.id}")
    Boolean update(@Param("news") News news);
}
