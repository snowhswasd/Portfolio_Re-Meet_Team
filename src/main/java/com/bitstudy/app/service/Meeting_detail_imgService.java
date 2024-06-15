package com.bitstudy.app.service;

import com.bitstudy.app.dao.Meeting_detail_imgDao;
import com.bitstudy.app.domain.Meeting_detail_imgDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Meeting_detail_imgService {
    @Autowired
    Meeting_detail_imgDao meetingDetailImgDao;

    //<!--   모임 이미지 불러오기 1장 링크만 뽑기 후기에 사용 -->
    public String selectImg(Integer FK_M_seqno){
        return meetingDetailImgDao.selectImg(FK_M_seqno);
    }

    //<!--  모임 이미지 불러오기 1장 링크랑, 메인 이미지 업로드 할떄 사용 -->
    public Meeting_detail_imgDto selectImg2(Integer FK_M_seqno){
        return meetingDetailImgDao.selectImg2(FK_M_seqno);
    }


    // <!--    모임 이미지 불러오기 상세페이지 -->
    public List<Meeting_detail_imgDto> selectImgAll(Integer FK_M_seqno){
        return meetingDetailImgDao.selectImgAll(FK_M_seqno);
    }


    // <!--    모임 이미지 입력하기 -->
    public int insertImg(Meeting_detail_imgDto meeting_detail_imgDto){
        return meetingDetailImgDao.insertImg(meeting_detail_imgDto);
    }


    // <!--  이미지가 있는 모임 번호 뽑기  -->
    public List<Integer> selectImgNumber( ){
        return meetingDetailImgDao.selectImgNumber();
    }


    // 모임이미지가 있는 모임 번호 뽑아오고 그번호 보내줘서 위에있는 이미지 한장 불러오는거 할거임

    public List<Meeting_detail_imgDto> getTitleImg(){
        List<Integer> aaa = meetingDetailImgDao.selectImgNumber();

        List<Meeting_detail_imgDto> bbb = new ArrayList<>();

        for (Integer num: aaa){
            bbb.add(meetingDetailImgDao.selectImg2(num));
        }
        return bbb;
    };


}
