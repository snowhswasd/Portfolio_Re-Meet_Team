package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Big_cateDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Big_cateDaoImpl implements Big_cateDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.big_cateMapper.";

    // <!--  5. 대분류 불러오기 -->
    @Override
    public List<Big_cateDto> select_bigCate(){
        return session.selectList(namespace+"select_bigCate");
    };


}
