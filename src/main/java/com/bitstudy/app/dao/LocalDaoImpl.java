package com.bitstudy.app.dao;

import com.bitstudy.app.domain.LocalDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LocalDaoImpl implements LocalDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.LocalMapper.";

    // <!--    4. 메인페이지 네비 4개 중 하나에 다 뽑아주려고 -->
    @Override
    public List<LocalDto> selecLocal(){
        return session.selectList(namespace+"selectLocal");
    };

}
