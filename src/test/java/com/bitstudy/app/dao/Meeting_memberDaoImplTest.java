package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Meeting_memberDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class Meeting_memberDaoImplTest {
    @Autowired
    Meeting_memberDao meeting_memberDao;

    @Test
    public void selectMember() {
        Meeting_memberDto meeting_memberDto = new Meeting_memberDto(9,"aaaa");
        Meeting_memberDto ttt = meeting_memberDao.selectMember(meeting_memberDto);

        assertTrue(ttt != null);
    }

    @Test
    public void insertMember() {
        Meeting_memberDto meeting_memberDto = new Meeting_memberDto(9,"aaaa");
        meeting_memberDao.insertMember(meeting_memberDto);
    }

    @Test
    public void deleteMember() {
        Meeting_memberDto meeting_memberDto = new Meeting_memberDto(9,"aaaa");

        meeting_memberDao.deleteMember(meeting_memberDto);
    }
}