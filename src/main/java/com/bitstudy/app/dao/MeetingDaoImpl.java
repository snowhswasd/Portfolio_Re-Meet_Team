package com.bitstudy.app.dao;

import com.bitstudy.app.domain.MeetingDto;
import com.bitstudy.app.domain.SearchDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public class MeetingDaoImpl implements MeetingDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.MeetingMapper.";

    //    <!--특정모임 불러오기-->
    //    <!--searchDto만들면 수정 필요 매개변수 타입 -->
    @Override
    public List<MeetingDto> selectMeeting_seperate(SearchDto searchDto){
//        System.out.println("다오에있는 리스트: "+searchDto);
        return session.selectList(namespace+"selectMeeting_seperate",searchDto);
    };

    //    <!--검색한 모임의 결과 갯수 찍어주기-->
    @Override
    public int SearchCount(SearchDto searchDto){
//        System.out.println("카운트 다오까지 왔어요.");
        return session.selectOne(namespace+"SearchCount",searchDto);
    };

    // <!--8-1) 미팅 테이블에 (select) 별점 누른수 10명이상 안에서 별점 높은 순으로 줄세워서 9개 뽑아오기-->
    @Override
    public List<MeetingDto> selectStarPoint(String H_writer){
        return session.selectList(namespace+"selectStarPoint",H_writer);
    };

    // <!--8-1) 미팅 테이블에 (select) 하트 높은 순으로 줄세워서 9개 뽑아오기-->
    @Override
    public  List<MeetingDto> selectHeartPoint(String H_writer){
        return session.selectList(namespace+"selectHeartPoint",H_writer);
    };

    // <!--9-1) 미팅 테이블(select) 날짜별로 9개 뽑아오기 == 새로 만들어진 리스트 -->
    @Override
    public List<MeetingDto> selectNewDate(String H_writer){
        return session.selectList(namespace+"selectNewDate",H_writer);
    };

    // <!--10-1) 미팅 테이블(select(빅카테,위치)) 보내서 값 9개 받아오기.//메인페이지 후기 -->
    //맵에 들어갈 내용: FK_BC_cate,M_local
    @Override
    public List<Integer> selectReview(Map map){
        return session.selectList(namespace+"selectReview",map);
    };

    // <!--10-2)  미팅 테이블(select(빅카테) 값 9개 뽑아오기 == 카테고리 추천 -->
    @Override
    public List<MeetingDto> selectCate(Map map){
        return session.selectList(namespace+"selectCate",map);
    };

    //    <!--31) 미팅테이블(select(모임 고유번호)) 보내주고 리스트로 받아와서 필요한거 뷰파일에서 찍기 -->
    //    <!--상세페이지 옆에 모임에 대한 설명관련-->
    @Override
    public MeetingDto selectDetailSide(Map map){
        return session.selectOne(namespace+"selectDetailSide",map);
    };

    // <!-- 7-1 하트 카운트 화면 들어가면 업데이트 해주는 것-->
    // 맵에 들어갈 내용: count, M_seqno
    @Override
    public int heartCountUpdate(Map map){
        return session.update(namespace+"heartCountUpdate",map);
    };

    //<!-- 7-5 스타카운트랑 점수 업데이트 해주는것-->
    //    <!--평균점수 받을떄 중간에 형변환 해서 받아야함-->
    // 맵에  M_starPoint, M_starCount, M_seqno
    @Override
    public int starCountUpdate(Map map){

        return session.update(namespace+"starCountUpdate",map);
    };

    // <!-- 화면들어가기전에 모임 번호에 맞춰서 대표이미지 업로드  -->
    @Override
    public int titleImgUpdate(Map map){
        return session.update(namespace+"titleImgUpdate",map);
    };


    //<!--21. 새로운 모임 만들기-->
    @Override
    public int insertMeeting(MeetingDto meetingDto){
        return session.insert(namespace+"insertMeeting",meetingDto);
    };

    //테스트 업데이트
    @Override
    public int testUpdate(Map map){
        return session.update(namespace+"testUpdate",map);
    };


    @Override
    public List<Integer> makeMyMeeting(String id){
        return session.selectList(namespace+"makeMyMeeting", id);
    };

    @Override
    public int selectForImg(MeetingDto meetingDto){
        return session.selectOne(namespace+"selectForImg", meetingDto);
    };

    @Override
    public String makeMyMeetingName(String id){
        return session.selectOne(namespace+"makeMyMeetingName", id);
    };


}
