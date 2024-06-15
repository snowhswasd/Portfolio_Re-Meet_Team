package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Meeting_memberDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Meeting_memberDaoImpl implements Meeting_memberDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.meetingMemberMapper.";

    //<!--11-1 댓글이랑 별점 달때 모임에 가입된 사람인지 체크 할때 사용-->
    @Override
    public Meeting_memberDto selectMember(Meeting_memberDto meeting_memberDto){
        return session.selectOne(namespace+"selectMember",meeting_memberDto);
    };

    //<!--11-2 미팅 가입할때 정보 널어주기  이거 하려면 위에 쿼리문 한번 실행
    //     이유는 이미 가입된 사람인지 체크하고 널어줘야하기떄문이야-->
    @Override
    public int insertMember(Meeting_memberDto meeting_memberDto){
        return session.insert(namespace+"insertMember",meeting_memberDto);
    };

    //    <!--14. 세션에서 받아온 아이디랑 모임 고유번호 보내서 모임 탈퇴하기 누르면 데이터베이스에서 삭제-->
    //    <!--회원 탈퇴할때도 이거 돌려야함-->
    @Override
    public int deleteMember(Meeting_memberDto meeting_memberDto){
        return session.delete(namespace+"deleteMember",meeting_memberDto);
    };

    @Override
    public List<Integer> selectMemberCount(String id) {
        return session.selectList(namespace+"selectMemberCount",id);
    };




}
