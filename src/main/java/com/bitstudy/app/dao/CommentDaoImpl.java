package com.bitstudy.app.dao;

import com.bitstudy.app.domain.CommentDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CommentDaoImpl implements CommentDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.CommentMapper.";

    //    <!--10-3) 후기글 테이블 (모임번호) 보내주고 limit 1 걸어줘서 받아오기 (한개 받아오기)-->
    @Override
    public String commentLimitOne(Integer FK_M_seqno){
        return session.selectOne(namespace+"commentLimitOne",FK_M_seqno);
    };

    //  <!-- 33-1) 게시판용 - 특정 번째부터 n개 가져오기. 최신글 순으로 불러오기   -->
    // 받아야 하는 맵값 : FK_Mseqno, offset
    // 맵 보내줘야할것: FK_Mseqno offset
    @Override
    public List<CommentDto> selectPage(Map map){
        return session.selectList(namespace+"selectPage",map);
    };


    //     <!--33-2) 댓글 테이블 (select(count)) 모임번호 번호주고 그번호에있는 댓글 갯수 들고오기-->
    @Override
    public int commentCountAll(Integer FK_M_seqno){
        return session.selectOne(namespace+"commentCountAll",FK_M_seqno);
    };


    //<!--  모든 후기 삭제-->
    @Override
    public int commentDeleteAll(){
        return session.delete(namespace+"commentDeleteAll");
    };


    //<!--   33-3.  후기 작성자만 특정 동호회의 후기 삭제-->
    // 맵에 들어갈것: C_seqno , C_writer
    @Override
    public int commentDelete(Map map){
        return session.delete(namespace+"commentDelete",map);
    };

    // <!--   33-4 후기 등록-->
    @Override
    public int insertComment(CommentDto commentDto){
        return session.insert(namespace+"insertComment",commentDto);
    };

    // <!--  33-5. 수정 - 댓글 작성자만 수정 가능하게 하기 -->
    @Override
    public int commentUpdate(CommentDto commentDto){
        return session.update(namespace+"commentUpdate",commentDto);
    };


}
