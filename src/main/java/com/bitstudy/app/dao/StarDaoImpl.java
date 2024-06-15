package com.bitstudy.app.dao;


import com.bitstudy.app.domain.StarDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class StarDaoImpl implements StarDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.StarMapper.";

    //
    @Override
    public int deleteAll(){
        return session.delete(namespace+"deleteAll");
    };

    // <!-- deleteEach - 별 취소 -->
    @Override
    public int deleteEach(Map map){
        return session.delete(namespace+"deleteEach",map);
    };

    //  <!--7-4. 별점테이블 모임번호 그룹화해서 그 수 뽑아서 저장하고 거기있는 모임번호 별점(평균) 카운트 뽑아오기-->
    @Override
    public List<StarDto> starForUpdate(){
        return session.selectList(namespace+"starForUpdate");
    };

    // <!--   별 입력 이걸 meeting table에서 받아서 처리 할거임-->
    @Override
    public int starInsert(StarDto starDto){
        return session.insert(namespace+"starInsert",starDto);
    };

    @Override
    public StarDto star(Integer FK_M_seqno){
        return session.selectOne(namespace+"star",FK_M_seqno);
    };


    @Override
    public StarDto selectStarUser(Map map){
        return session.selectOne(namespace+"selectStarUser",map);
    };

    @Override
    public int starUpdate(StarDto starDto){
        return session.update(namespace+"starUpdate",starDto);
    };

}
