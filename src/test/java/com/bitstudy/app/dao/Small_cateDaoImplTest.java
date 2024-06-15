package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Small_cateDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class Small_cateDaoImplTest {
    @Autowired
    Small_cateDao small_cateDao;

    @Test
    public void select_smallCate() {

        List<Small_cateDto> small_cateDtoList =  small_cateDao.select_smallCate();

        System.out.println(small_cateDtoList);
    }
}