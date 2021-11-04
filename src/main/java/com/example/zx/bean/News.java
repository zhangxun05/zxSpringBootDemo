package com.example.zx.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "sys_news")
@Data
public class News implements Serializable {

    @Id
    @Column(unique = true, nullable = false)
    private Integer id;
    private String title;
    //接收参数的格式
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //输出参数的格式
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
    private String content;
    //接收参数的格式
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //输出参数的格式
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;
}
