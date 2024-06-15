package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Meeting_detail_imgDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

public class Meeting_detail_imgDaoImplTest {
    @Autowired
    Meeting_detail_imgDao meeting_detail_imgDao;

    @Test
    public void selectImg() {
        meeting_detail_imgDao.selectImg(1);
    }

    @Test
    public void selectImgAll() {
        meeting_detail_imgDao.selectImgAll(1);
    }

    @Test
    public void insertImg() {

        for (int i = 1; i<=240; i++){
            Meeting_detail_imgDto meeting_detail_imgDto = new Meeting_detail_imgDto(i, i+"-1.jpg");
            Meeting_detail_imgDto meeting_detail_imgDto2 = new Meeting_detail_imgDto(i, i+"-2.jpg");
            Meeting_detail_imgDto meeting_detail_imgDto3 = new Meeting_detail_imgDto(i, i+"-3.jpg");
            Meeting_detail_imgDto meeting_detail_imgDto4 = new Meeting_detail_imgDto(i, i+"-4.jpg");
            Meeting_detail_imgDto meeting_detail_imgDto5 = new Meeting_detail_imgDto(i, i+"-5.jpg");

            meeting_detail_imgDao.insertImg(meeting_detail_imgDto);
            meeting_detail_imgDao.insertImg(meeting_detail_imgDto2);
            meeting_detail_imgDao.insertImg(meeting_detail_imgDto3);
            meeting_detail_imgDao.insertImg(meeting_detail_imgDto4);
            meeting_detail_imgDao.insertImg(meeting_detail_imgDto5);

        }
    }
}