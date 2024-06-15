package com.bitstudy.app.dao;

import com.bitstudy.app.domain.HeartDto;

import java.util.List;

public interface HeartDao {
    // <!---7-2 미팅의 하트 업데이트 하기 위해 뽑아 오는 쿼리문-->
    List<HeartDto> heartForUpdate();

    //    <!--7-3 이미 하트 입력한 사람 거르자-->
    HeartDto selectHeart(HeartDto heartDto);


    //<!--하나만 들고오기.-->
    HeartDto heart(Integer FK_M_seqno);

    //    <!--11. 하트 누르기-->
    //    <!--7-3 선행 필요-->
    Integer insertHeart(HeartDto heartDto);

    //    <!--14. 하트취소-->
    //    <!--7-3 선행 필요-->
    Integer deleteHeart(HeartDto heartDto);


    List<Integer> userHeartList(String H_writer);
}
