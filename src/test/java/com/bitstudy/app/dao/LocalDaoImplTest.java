package com.bitstudy.app.dao;

import com.bitstudy.app.domain.LocalDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class LocalDaoImplTest {

    @Autowired
    LocalDao localDao;

    @Test
    public void selecLocal() {

        List<LocalDto> ttt = localDao.selecLocal();
        System.out.println(ttt);
    }
}