package com.bitstudy.app.service;

import com.bitstudy.app.dao.HeartDao;
import com.bitstudy.app.domain.HeartDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeartService {

    @Autowired
    HeartDao heartDao;
    // <!---7-2 미팅의 하트 업데이트 하기 위해 뽑아 오는 쿼리문-->
    public List<HeartDto> heartForUpdate( ){
        return heartDao.heartForUpdate();
    }


    //    <!--7-3 이미 하트 입력한 사람 거르자-->
    public HeartDto selectHeart(HeartDto heartDto){
        return heartDao.selectHeart(heartDto);
    }


    //    <!--11. 하트 누르기-->
    //    <!--7-3 선행 필요-->
    public int insertHeart(HeartDto heartDto){
        return heartDao.insertHeart(heartDto);
    }


    //    <!--14. 하트취소-->
    //    <!--7-3 선행 필요-->
    public int deleteHeart(HeartDto heartDto){
        return heartDao.deleteHeart(heartDto);
    }

    //   <!-- 접속한 아이디로 하트를 누른모임들은 하트가 빨간색으로 나와야함 -->
    public List<Integer> userHeartList(String H_writer){
        return heartDao.userHeartList(H_writer);
    }


}
