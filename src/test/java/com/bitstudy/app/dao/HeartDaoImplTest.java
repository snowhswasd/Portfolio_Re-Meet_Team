package com.bitstudy.app.dao;

import com.bitstudy.app.domain.HeartDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class HeartDaoImplTest {

    @Autowired
    HeartDao heartDao;

    @Test
    public void heartForUpdate() {
        HeartDto heartDto = new HeartDto(1, "재롱이");
        heartDto.setH_writer("담비");
        heartDao.insertHeart(heartDto);

    }
    @Test
    public void selectHeart() {
        HeartDto heartDto = new HeartDto(193 , "user1");

        HeartDto ttt= heartDao.selectHeart(heartDto);

        System.out.println(ttt);



    }

    @Test
    public void insertHeart() {

        for (int i=0; i<1000; i++){
            System.out.println(i);
            HeartDto heartDto = new HeartDto((i%240)+1, "user"+(i+1));
            heartDao.insertHeart(heartDto);

        };


    }

    @Test
    public void deleteHeart() {

        HeartDto heartDto = new HeartDto(195, "user2");

//        heartDao.insertHeart(heartDto);

        heartDao.deleteHeart(heartDto);
    }


    @Test
    public void userHeartList() {

        List<Integer> ttt =heartDao.userHeartList("성경모");


        System.out.println(ttt);
    }

}