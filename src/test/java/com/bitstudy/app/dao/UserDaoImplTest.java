package com.bitstudy.app.dao;

import com.bitstudy.app.domain.UserDto;
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
public class UserDaoImplTest {
    @Autowired
    UserDao userDao;


    @Test
    public void selectUser() {

        userDao.deleteUser("qqqqqqqq");

        UserDto userDto = new UserDto("qqqqqqqq","wwwww", "male", "sport", "바보", "강원도", "970101");

        userDao.insertUser(userDto);


        UserDto ttt = userDao.selectUser("qqqqqqqq");
        System.out.println("ttt : " + ttt);
//        assertTrue(ttt.getName("바보")==1);


    }

    @Test
    public void selectLogin() {

        Map map = new HashMap();
        map.put("id", "aaaaa");
        map.put("pw", "aaaaa");


        UserDto userDto =new UserDto("aaaadsa", "aqswdefr","male", "cook", "홍길동323", "Seouldsd", "990201111");

        userDao.insertUser(userDto);

        userDao.selectLogin(map);
    }


    @Test
    public void insertUser() {
        ArrayList<String> local = new ArrayList<>();
        local.add("관악구");
        local.add("서초구");
        local.add("용산구");
        local.add("영등포구");
        local.add("강남구");
        local.add("성동구");
        local.add("마포구");
        local.add("양천구");
        local.add("광진구");
        local.add("동대문구");

        ArrayList<String> big_cate = new ArrayList<>();
        big_cate.add("음악");
        big_cate.add("스포츠");
        big_cate.add("쿠킹");
        big_cate.add("뷰티");
        big_cate.add("핸드메이드");
        big_cate.add("반려동물");
        big_cate.add("전자기기");
        big_cate.add("자기계발");

        ArrayList<String> gender = new ArrayList<>();
        gender.add("남성");
        gender.add("여성");

        ArrayList<String> name = new ArrayList<>();
        name.add("성경모");
        name.add("조다영");
        name.add("나상민");
        name.add("하승우");
        name.add("서은광");


        ArrayList<String> birth = new ArrayList<>();
        birth.add("921009");
        birth.add("930612");
        birth.add("991220");
        birth.add("990621");
        birth.add("901122");


        for (int i=0; i<=1000; i++){
            UserDto userDto = new UserDto("user"+(i+1), "1234",(gender.get(i%2)), (big_cate.get(i%8)), (name.get(i%5)) ,(local.get(i%10)), (birth.get(i%5)));

            userDao.insertUser(userDto);
        }
    }

    @Test
    public void updateUser() {
        UserDto userDto =new UserDto("aaaadsa", "aqswdefr","male", "cook", "홍길동323", "Seouldsd", "990201111");


        userDto.setName("홍길동그라미123");
        userDto.setBirth("000201");

        userDao.insertUser(userDto);
    }

    @Test
    public void deleteUser() {

        userDao.deleteUser("aaaadsa");

    }
}