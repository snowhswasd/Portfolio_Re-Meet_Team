package com.bitstudy.app.service;

import com.bitstudy.app.dao.Meeting_detail_textDao;
import com.bitstudy.app.domain.Meeting_detail_textDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Meeting_detail_textService {
    @Autowired
    Meeting_detail_textDao meetingDetailTextDao;

    //<!--   32. 모임 상세 정보 불러오기 select -->
    public Meeting_detail_textDto selectText(Integer FK_M_seqno){
        return meetingDetailTextDao.selectText(FK_M_seqno);
    }


    //<!--    32.모임 상세 정보 입력하기 insert -->
    public int insertText(Meeting_detail_textDto meeting_detail_textDto){
        return meetingDetailTextDao.insertText(meeting_detail_textDto);
    }


    //<!--    32.모임 상세 정보 입력하기 update -->
    public int updateText(Meeting_detail_textDto meeting_detail_textDto){
        return meetingDetailTextDao.updateText(meeting_detail_textDto);
    }


    //<!--    32.모임 상세 정보 입력하기 delete -->
    // 이거 안쓸거같은데요 ?
    public int deleteText(Meeting_detail_textDto meeting_detail_textDto){
        return meetingDetailTextDao.deleteText(meeting_detail_textDto);
    }

}
