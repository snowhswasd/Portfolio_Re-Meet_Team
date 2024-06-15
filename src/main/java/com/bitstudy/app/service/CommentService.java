package com.bitstudy.app.service;

import com.bitstudy.app.dao.CommentDao;
import com.bitstudy.app.domain.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommentService {
    @Autowired
    CommentDao commentDao;

    //    <!--10-3) 후기글 테이블 (모임번호) 보내주고 limit 1 걸어줘서 받아오기 (한개 받아오기)-->
    public String commentLimitOne(Integer FK_Mseqno){
        return commentDao.commentLimitOne(FK_Mseqno);
    }


    //  <!-- 33-1) 게시판용 - 특정 번째부터 n개 가져오기. 최신글 순으로 불러오기   -->
    // 받아야 하는 맵값 : FK_M_seqno, offset
    public List<CommentDto> selectPage(Integer FK_M_seqno) {
        Map map = new HashMap();
        map.put("FK_M_seqno" , FK_M_seqno);
        map.put("offset" , 0);
        return commentDao.selectPage(map);
    }


    //     <!--33-2) 댓글 테이블 (select(count)) 모임번호 번호주고 그번호에있는 댓글 갯수 들고오기-->
    public int commentCountAll(Integer FK_Mseqno){
        return commentDao.commentCountAll(FK_Mseqno);
    }


    //<!--  모든 후기 삭제-->
    public int commentDeleteAll(){
        return commentDao.commentDeleteAll();
    }


    //<!--   33-3.  후기 작성자만 특정 동호회의 후기 삭제-->
    // 맵에 들어갈것: C_seqno , C_writer
    public int commentDelete(Integer C_seqno, String C_writer){
        Map map = new HashMap();
        map.put("C_seqno" , C_seqno);
        map.put("C_writer",C_writer);

        return commentDao.commentDelete(map);
    }

    // <!--   33-4 후기 등록-->
    public int insertComment(CommentDto commentDto){
        return commentDao.insertComment(commentDto);
    }

    // <!--  33-5. 수정 - 댓글 작성자만 수정 가능하게 하기 -->
    public int commentUpdate(CommentDto commentDto){
        return commentDao.commentUpdate(commentDto);
    }




}
