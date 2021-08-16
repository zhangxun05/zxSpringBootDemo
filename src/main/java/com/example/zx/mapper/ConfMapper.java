package com.example.zx.mapper;

import com.example.zx.bean.Conf;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ConfMapper {

    @Select("select * from sys_conf where id=1")
    Conf getList();
}
