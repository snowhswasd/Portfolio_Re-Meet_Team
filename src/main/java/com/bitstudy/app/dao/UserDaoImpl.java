package com.bitstudy.app.dao;


import com.bitstudy.app.domain.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    SqlSession session;

    String namespace ="com.bitstudy.app.dao.UserMapper.";

    // <!--1. 사용자 (세션) 아이디 가져와서 사용자 정보 뽑아내는것-->
    @Override
    public UserDto selectUser(String id){
        return session.selectOne(namespace+"selectUser",id);
    };

    // <!--   3. 로그인할때 아이디 패스워드 보내서 그 값이 있는지 없는지 확인해서 로그인 + 자동로그인 -->
    @Override
    public UserDto selectLogin(Map map){
        return session.selectOne(namespace+"selectLogin",map);
    };


    // <!--    2. 회원가입용 -->
    @Override
    public int insertUser(UserDto userDto){
        return session.insert(namespace+"insertUser",userDto);
    };

    //<!--13. 마이페이지에서 회원정보 수정할때 그 페이지에서 정보 뽑아와서 여기로 보내주기 -->
    @Override
    public int updateUser(UserDto userDto){
        return session.update(namespace+"updateUser",userDto);
    };

    //<!--14. 세션아이디 받아와서 회원탈퇴-->
    @Override
    public int deleteUser(String id){
        return session.delete(namespace+"deleteUser",id);
    };




}
