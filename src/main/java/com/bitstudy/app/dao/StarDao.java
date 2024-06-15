package com.bitstudy.app.dao;

import com.bitstudy.app.domain.StarDto;

import java.util.List;
import java.util.Map;

public interface StarDao {
    //
    int deleteAll();

    // <!-- deleteEach - 별 취소 -->
    int deleteEach(Map map);

    //  <!--7-4. 별점테이블 모임번호 그룹화해서 그 수 뽑아서 저장하고 거기있는 모임번호 별점(평균) 카운트 뽑아오기-->
    List<StarDto> starForUpdate();

    // <!--   별 입력 이걸 meeting table에서 받아서 처리 할거임-->
    int starInsert(StarDto starDto);

    StarDto star(Integer FK_M_seqno);

    StarDto selectStarUser(Map map);

    int starUpdate(StarDto starDto);
}
