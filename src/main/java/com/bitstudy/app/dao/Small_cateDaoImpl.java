package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Small_cateDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Small_cateDaoImpl implements Small_cateDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.small_cateDto.";

    //<!--  대분류 불러오기 -->
    @Override
    public List<Small_cateDto> select_smallCate(){
        return session.selectList(namespace+"select_smallCate");
    };




    //
    @Override
    public List<Small_cateDto> select_smallCate2(Integer aaa){
        return session.selectList(namespace+"select_smallCate2",aaa);
    };





}
