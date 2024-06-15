package com.bitstudy.app.service;

import com.bitstudy.app.dao.UserDao;
import com.bitstudy.app.domain.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    // <!--1. 사용자 (세션) 아이디 가져와서 사용자 정보 뽑아내는것-->
    public UserDto selectUser(String id) {

        return userDao.selectUser(id);

    }
    // <!--   3. 로그인할때 아이디 패스워드 보내서 그 값이 있는지 없는지 확인해서 로그인 + 자동로그인 -->
    public UserDto selectLogin(Map map) {
        return userDao.selectLogin(map);
    }


    // <!--    2. 회원가입용 -->
    public int insertUser(UserDto userDto) {
        return userDao.insertUser(userDto);
    }
    //<!--13. 마이페이지에서 회원정보 수정할때 그 페이지에서 정보 뽑아와서 여기로 보내주기 -->
    public int updateUser(UserDto userDto) {
        return  userDao.updateUser(userDto);
    }

    //<!--14. 세션아이디 받아와서 회원탈퇴-->
    public int deleteUser(String id){
        return  userDao.deleteUser(id);
    }
}
