package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Meeting_detail_textDto;

public interface Meeting_detail_textDao {
    //<!--   32. 모임 상세 정보 불러오기 select -->
    Meeting_detail_textDto selectText(Integer FK_M_seqno);

    //<!--    32.모임 상세 정보 입력하기 insert -->
    int insertText(Meeting_detail_textDto meeting_detail_textDto);

    //<!--    32.모임 상세 정보 입력하기 update -->
    int updateText(Meeting_detail_textDto meeting_detail_textDto);

    //<!--    32.모임 상세 정보 입력하기 delete -->
    // 이거 안쓸거같은데요 ?
    int deleteText(Meeting_detail_textDto meeting_detail_textDto);
}
