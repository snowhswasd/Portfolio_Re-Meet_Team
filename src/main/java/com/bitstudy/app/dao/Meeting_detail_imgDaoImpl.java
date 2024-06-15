package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Meeting_detail_imgDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Meeting_detail_imgDaoImpl implements Meeting_detail_imgDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.MeetingDetail_imgMapper.";

    //<!--   모임 이미지 불러오기 1장 링크만 뽑기 후기에 사용 -->
    @Override
    public String selectImg(Integer FK_M_seqno){
        return session.selectOne(namespace+"selectImg",FK_M_seqno);
    };

    //<!--  모임 이미지 불러오기 1장 링크랑, 메인 이미지 업로드 할떄 사용 -->
    @Override
    public Meeting_detail_imgDto selectImg2(Integer FK_M_seqno){
        return session.selectOne(namespace+"selectImg2",FK_M_seqno);
    };

    // <!--    모임 이미지 불러오기 상세페이지 -->
    @Override
    public List<Meeting_detail_imgDto> selectImgAll(Integer FK_M_seqno){
        return session.selectList(namespace+"selectImgAll",FK_M_seqno);
    };

    // <!--    모임 이미지 입력하기 -->
    @Override
    public int insertImg(Meeting_detail_imgDto meeting_detail_imgDto){
        return session.insert(namespace+"insertImg",meeting_detail_imgDto);
    };


    //<!--  이미지가 있는 모임 번호 뽑기  -->
    @Override
    public List<Integer> selectImgNumber(){
        return session.selectList(namespace+"selectImgNumber");
    };



}
