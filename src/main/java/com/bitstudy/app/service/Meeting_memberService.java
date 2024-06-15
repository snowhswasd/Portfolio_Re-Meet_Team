package com.bitstudy.app.service;

import com.bitstudy.app.dao.Meeting_memberDao;
import com.bitstudy.app.domain.Meeting_memberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Meeting_memberService {
    @Autowired
    Meeting_memberDao meetingMemberDao;

    //<!--11-1 댓글이랑 별점 달때 모임에 가입된 사람인지 체크 할때 사용-->
    //<!--미팅가입할때 가입이 되있냐 물어볼때 사용.-->
    public Meeting_memberDto selectMember(Meeting_memberDto meeting_memberDto){
        return meetingMemberDao.selectMember(meeting_memberDto);
    }

    //<!--11-2 미팅 가입할때 정보 널어주기  이거 하려면 위에 쿼리문 한번 실행
    //     이유는 이미 가입된 사람인지 체크하고 널어줘야하기떄문이야-->
    // 지금여기는 유저가 가입할려는 그모임에 이미 가입되있는지 확인하고 없으면 넣고 있으면 0이라는 결과값을 보내거임.
    public int insertMember(Meeting_memberDto meeting_memberDto){
        Meeting_memberDto ttt = meetingMemberDao.selectMember(meeting_memberDto);

        if (ttt == null){
            return meetingMemberDao.insertMember(meeting_memberDto);
        }
        else {
            return 0;
        }
    }

    //  <!--14. 세션에서 받아온 아이디랑 모임 고유번호 보내서 모임 탈퇴하기 누르면 데이터베이스에서 삭제-->
    // 지금여기는 유저가 탈퇴 할려는 그모임에 이미 가입되있는지 확인하고 있으면 삭제하고 없으면 0이라는 결과값을 보내거임.
    public int deleteMember(Meeting_memberDto meeting_memberDto){

        Meeting_memberDto ttt = meetingMemberDao.selectMember(meeting_memberDto);

        if (ttt == null){
            return 0;
        }

        else{
            return meetingMemberDao.deleteMember(meeting_memberDto);
        }

    }

    //위에 두개 합친거임 위에 왜저렇게 만들었지 혹시나해서 만든건가.
    public int MemberInOut(Meeting_memberDto meeting_memberDto){
        Meeting_memberDto ttt = meetingMemberDao.selectMember(meeting_memberDto);

        if (ttt == null){
            meetingMemberDao.insertMember(meeting_memberDto);
            return 1;
        }
        else{
            meetingMemberDao.deleteMember(meeting_memberDto);
            return 0;
        }

    }




}
