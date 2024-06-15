package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Meeting_detail_textDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Meeting_detail_textDaoImpl implements Meeting_detail_textDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.MeetingDetail_textMapper.";

    //<!--   32. 모임 상세 정보 불러오기 select -->
    @Override
    public Meeting_detail_textDto selectText(Integer FK_M_seqno){
        return session.selectOne(namespace+"selectText",FK_M_seqno);
    };

    //<!--    32.모임 상세 정보 입력하기 insert -->
    @Override
    public int insertText(Meeting_detail_textDto meeting_detail_textDto){
        return session.insert(namespace+"insertText",meeting_detail_textDto);
    };

    //<!--    32.모임 상세 정보 입력하기 update -->
    @Override
    public int updateText(Meeting_detail_textDto meeting_detail_textDto){
        return session.update(namespace+"updateText",meeting_detail_textDto);
    };

    //<!--    32.모임 상세 정보 입력하기 delete -->
    // 이거 안쓸거같은데요 ?
    @Override
    public int deleteText(Meeting_detail_textDto meeting_detail_textDto){
        return session.delete(namespace+"deleteText",meeting_detail_textDto);
    };




}
