package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Meeting_detail_imgDto;

import java.util.List;

public interface Meeting_detail_imgDao {
    //<!--   모임 이미지 불러오기 메인페이지 1장만 뽑기 -->
    String selectImg(Integer FK_M_seqno);


    //<!--  모임 이미지 불러오기 1장 링크랑, 메인 이미지 업로드 할떄 사용 -->
    Meeting_detail_imgDto selectImg2(Integer FK_M_seqno);

    // <!--    모임 이미지 불러오기 상세페이지 -->
    List<Meeting_detail_imgDto> selectImgAll(Integer FK_M_seqno);

    // <!--    모임 이미지 입력하기 -->
    int insertImg(Meeting_detail_imgDto meeting_detail_imgDto);

    //<!--  이미지가 있는 모임 번호 뽑기  -->
    List<Integer> selectImgNumber();
}
