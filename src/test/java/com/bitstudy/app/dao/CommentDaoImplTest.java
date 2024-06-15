package com.bitstudy.app.dao;

import com.bitstudy.app.domain.CommentDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class CommentDaoImplTest {
    @Autowired
    CommentDao commentDao;

    @Test
    public void commentLimitOne() {
        commentDao.commentLimitOne(1);
    }

    @Test
    public void selectPage() {
        Map map = new HashMap();
        map.put("FK_M_seqno",1);
        map.put("offset",3);

        commentDao.selectPage(map);

    }

    @Test
    public void commentCountAll() {
        commentDao.commentCountAll(1);
    }

    @Test
    public void commentDeleteAll() {
        commentDao.commentDeleteAll();
    }

    @Test
    public void commentDelete() {
//        CommentDto commentDto = new CommentDto(1, "재롱이", "재롱이짱");
//        commentDao.insertComment(commentDto);

        Map map = new HashMap();

        map.put("C_seqno", 1);
        map.put("C_writer", "재롱이");


        commentDao.commentDelete(map);

    }

    @Test
    public void insertComment() {
        ArrayList<String> comm = new ArrayList<>();
        comm.add("함께 하는 사람들이 좋아서 너무 재밌었어요!");
        comm.add("조용한 모임을 찾고있었는데 만족스러웠습니다");
        comm.add("도움이 많이 됐던 시간이었어요 다음 모임 때도 참석하겠습니다");
        comm.add("모였을 때 시간가는 줄 몰랐어요 추천합니다");
        comm.add("저랑은 좀 안 맞았던 것 같아요 그래도 즐거웠습니다");
        comm.add("좋은 칭구를 사귈 수 있었어요");
        comm.add("리밋장님이 역할을 잘해주셔서 편하게 즐기다가 왔네요");
        comm.add("리밋으로 좋은 모임을 알게돼서 좋아요");
        comm.add("우리 리밋 평생가기루~~~~~~~~~~~!");
        comm.add("처음갔는데 친절하게 맞아주셔서 감사했어요 또 만나요 ㅎㅎ");
        comm.add("매일 가고싶은 모임이에요 !!");


        for (int i = 0; i < 2400; i++) {
            CommentDto commentDto = new CommentDto(i%240, "user"+(i%1000), comm.get(i % 11));
            commentDao.insertComment(commentDto);
        }
    }

    @Test
    public void commentUpdate() {
        CommentDto commentDto = new CommentDto(1, "재롱이2", "재롱이짱");

        commentDto.setC_text("재롱이 짱짱");
        commentDao.insertComment(commentDto);

    }
}