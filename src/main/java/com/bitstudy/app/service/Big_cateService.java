package com.bitstudy.app.service;


import com.bitstudy.app.dao.Big_cateDao;
import com.bitstudy.app.domain.Big_cateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Big_cateService {


    @Autowired
    Big_cateDao Big_cateDao;

    // <!--  5. 대분류 불러오기 -->
    public List<Big_cateDto> select_bigCate() {
        return Big_cateDao.select_bigCate();
    }


}
