package com.bitstudy.app.dao;

import com.bitstudy.app.domain.StarDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class StarDaoImplTest {
    @Autowired
    StarDao starDao;

    @Test
    public void deleteAll() {
        starDao.deleteAll();
    }

    @Test
    public void deleteEach() {
        Map map = new HashMap();
        map.put("FK_M_seqno",3);
        map.put("S_writer","성경모");

        starDao.deleteEach(map);
    }

    @Test
    public void starForUpdate() {
        starDao.starForUpdate();
    }

    @Test
    public void starInsert() {
        StarDto starDto = new StarDto(3,"성경모",5);
        starDao.starInsert(starDto);
    }

    @Test
    public void selectStarUser() {
        Map map = new HashMap();
        map.put("FK_M_seqno",3);
        map.put("S_writer","성경모");



        starDao.selectStarUser(map);
    }

    @Test
    public void starUpdate() {
        StarDto starDto = new StarDto(3,"성경모",5);
        starDao.starUpdate(starDto);
    }


}