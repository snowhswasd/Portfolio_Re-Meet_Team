package com.bitstudy.app.service;

import com.bitstudy.app.dao.LocalDao;
import com.bitstudy.app.domain.LocalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalService {
    @Autowired
    LocalDao localDao;
    // <!--    4. 메인페이지 네비 4개 중 하나에 다 뽑아주려고 -->

    public List<LocalDto> selecLocal(){
        return localDao.selecLocal();
    }





}
