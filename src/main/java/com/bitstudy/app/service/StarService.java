package com.bitstudy.app.service;

import com.bitstudy.app.dao.StarDao;
import com.bitstudy.app.domain.StarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StarService {
    @Autowired
    StarDao starDao;
    // <!-- deleteEach - 별 취소 -->

    public int deleteEach(Integer FK_M_seqno,  String S_writer){
        Map map = new HashMap();
        map.put("FK_M_seqno",FK_M_seqno);
        map.put("S_writer",S_writer);

        return starDao.deleteEach(map);
    }


    //  <!--7-4. 별점테이블 모임번호 그룹화해서 그 수 뽑아서 저장하고 거기있는 모임번호 별점(평균) 카운트 뽑아오기-->
    public List<StarDto> starForUpdate(){
        return starDao.starForUpdate();
    }


    // <!--   별 입력 이걸 meeting table에서 받아서 처리 할거임-->
    public int starInsert(StarDto starDto){
        return starDao.starInsert(starDto);
    }


    // <!--   별누른사람 체크 해줄려고 그별에 모임번화랑 유저id값 있냐 ? 물어보는 거임.-->
    public StarDto selectStatUser(Integer FK_M_seqno,  String S_writer){
        Map map = new HashMap();
        map.put("FK_M_seqno",FK_M_seqno);
        map.put("S_writer",S_writer);

        return starDao.selectStarUser(map);
    }

    //<!--  별누른사람은 또 누르면 업데이트  -->
    public int starUpdate(StarDto starDto){
        return starDao.starUpdate(starDto);
    }

}
