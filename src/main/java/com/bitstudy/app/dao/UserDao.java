package com.bitstudy.app.dao;

import com.bitstudy.app.domain.UserDto;

import java.util.Map;

public interface UserDao {
    // <!--1. 사용자 (세션) 아이디 가져와서 사용자 정보 뽑아내는것-->
    UserDto selectUser(String id);

    // <!--   3. 로그인할때 아이디 패스워드 보내서 그 값이 있는지 없는지 확인해서 로그인 + 자동로그인 -->
    UserDto selectLogin(Map map);

    // <!--    2. 회원가입용 -->
    int insertUser(UserDto userDto);

    //<!--13. 마이페이지에서 회원정보 수정할때 그 페이지에서 정보 뽑아와서 여기로 보내주기 -->
    int updateUser(UserDto userDto);

    //<!--14. 세션아이디 받아와서 회원탈퇴-->
    int deleteUser(String id);
}
