package com.bitstudy.app.dao;

import com.bitstudy.app.domain.Big_cateDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

public class Big_cateDaoImplTest {
    @Autowired
    Big_cateDao big_cateDao;

    @Test
    public void select_bigCate() {
        List<Big_cateDto> big_cateDtoList = big_cateDao.select_bigCate();
        System.out.println(big_cateDtoList);
    }
}