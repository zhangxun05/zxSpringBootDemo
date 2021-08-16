package com.example.zx.service.impl;

import com.example.zx.bean.Conf;
import com.example.zx.mapper.ConfMapper;
import com.example.zx.service.ConfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfServiceImpl implements ConfService {

    @Autowired
    private ConfMapper confMapper;

    @Override
    public Conf getList() {

        return confMapper.getList();
    }
}
