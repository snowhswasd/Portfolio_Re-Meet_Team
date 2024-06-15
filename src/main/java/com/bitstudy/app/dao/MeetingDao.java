package com.bitstudy.app.dao;

import com.bitstudy.app.domain.MeetingDto;
import com.bitstudy.app.domain.SearchDto;

import java.util.List;
import java.util.Map;

public interface MeetingDao {
    //    <!--특정모임 불러오기-->
    //    <!--searchDto만들면 수정 필요 매개변수 타입 -->
    List<MeetingDto> selectMeeting_seperate(SearchDto searchDto);

    //    <!--검색한 모임의 결과 갯수 찍어주기-->
    int SearchCount(SearchDto searchDto);

    // <!--8-1) 미팅 테이블에 (select) 별점 누른수 30명이상 안에서 별점 높은 순으로 줄세워서 9개 뽑아오기-->
    List<MeetingDto> selectStarPoint(String H_writer);

    // <!--8-1) 미팅 테이블에 (select) 하트 높은 순으로 줄세워서 9개 뽑아오기-->
    List<MeetingDto> selectHeartPoint(String H_writer);

    // <!--9-1) 미팅 테이블(select) 날짜별로 9개 뽑아오기 == 새로 만들어진 리스트 -->
    List<MeetingDto> selectNewDate(String H_writer);

    // <!--10-1) 미팅 테이블(select(빅카테,위치)) 보내서 값 9개 받아오기.//메인페이지 후기 -->
    //맵에 들어갈 내용: FK_BC_cate,M_local
    List<Integer> selectReview(Map map);

    //// <!--10-2)  미팅 테이블(select(빅카테) 값 9개 뽑아오기 == 카테고리 추천 -->
    List<MeetingDto> selectCate(Map map);

    //    <!--31) 미팅테이블(select(모임 고유번호)) 보내주고 리스트로 받아와서 필요한거 뷰파일에서 찍기 -->
    //    <!--상세페이지 옆에 모임에 대한 설명관련-->
    MeetingDto selectDetailSide(Map map);

    // <!-- 7-1 하트 카운트 화면 들어가면 업데이트 해주는 것-->
    // 맵에 들어갈 내용: count, M_seqno
    int heartCountUpdate(Map map);

    //<!-- 7-5 스타카운트랑 점수 업데이트 해주는것-->
    //    <!--평균점수 받을떄 중간에 형변환 해서 받아야함-->
    // 맵에  M_starPoint, M_starCount, M_seqno
    int starCountUpdate(Map map);


    //    <!-- 화면들어가기전에 모임 번호에 맞춰서 대표이미지 업로드  -->
    int titleImgUpdate(Map map);


    //<!--21. 새로운 모임 만들기-->
    int insertMeeting(MeetingDto meetingDto);

    //테스트
    int testUpdate(Map map);


    List<Integer> makeMyMeeting(String id);

    int selectForImg(MeetingDto meetingDto);

    String makeMyMeetingName(String id);
}
