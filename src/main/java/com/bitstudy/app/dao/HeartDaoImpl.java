package com.bitstudy.app.dao;

import com.bitstudy.app.domain.HeartDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HeartDaoImpl implements HeartDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.HeartMapper.";

    // <!---7-2 미팅의 하트 업데이트 하기 위해 뽑아 오는 쿼리문-->
    @Override
    public List<HeartDto> heartForUpdate( ){
        return session.selectList(namespace+"heartForUpdate");
    };

    //    <!--7-3 이미 하트 입력한 사람 거르자-->
    @Override
    public HeartDto selectHeart(HeartDto heartDto){

//        System.out.println("다오에요: "+ heartDto);
        return session.selectOne(namespace+"selectHeart",heartDto);
    };

    //<!--하나만 들고오기.-->
    @Override
    public HeartDto heart(Integer FK_M_seqno){
        return session.selectOne(namespace+"heart",FK_M_seqno);
    };


    //    <!--11. 하트 누르기-->
    //    <!--7-3 선행 필요-->
    @Override
    public Integer insertHeart(HeartDto heartDto){
        return session.insert(namespace+"insertHeart",heartDto);
    };


    //    <!--14. 하트취소-->
    //    <!--7-3 선행 필요-->
    @Override
    public Integer deleteHeart(HeartDto heartDto){
        return session.delete(namespace+"deleteHeart",heartDto);
    };


    //    <!-- 접속한 아이디로 하트를 누른모임들은 하트가 빨간색으로 나와야함 -->
    @Override
    public List<Integer> userHeartList(String H_writer){
        return session.selectList(namespace+"userHeartList",H_writer);
    };



}
