package com.bitstudy.app.service;

import com.bitstudy.app.dao.Small_cateDao;
import com.bitstudy.app.domain.Small_cateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Small_cateService {
    @Autowired
    Small_cateDao smallCateDao;


    //<!--  대분류 불러오기 -->
    public List<Small_cateDto> select_smallCate(){
        return smallCateDao.select_smallCate();
    }



}
