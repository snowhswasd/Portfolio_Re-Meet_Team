package com.bitstudy.app.controller;


import com.bitstudy.app.dao.Big_cateDao;
import com.bitstudy.app.dao.LocalDao;
import com.bitstudy.app.dao.UserDao;
import com.bitstudy.app.domain.Big_cateDto;
import com.bitstudy.app.domain.LocalDto;
import com.bitstudy.app.domain.UserDto;
import com.bitstudy.app.service.Big_cateService;
import com.bitstudy.app.service.LocalService;
import com.bitstudy.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;

    @Autowired
    Big_cateDao big_cateDao;

    @Autowired
    Big_cateService big_cateService;

    @Autowired
    LocalDao localDao;

    @Autowired
    LocalService localService;

    @GetMapping("/register/join")
    public String register() {
        return "registerForm";
    }


    @PostMapping("/register/save")
    public String save (UserDto userDto) throws Exception {

        if (userService.selectUser(userDto.getId()) != null) {
            String msg = URLEncoder.encode("이미 사용중인 아이디 입니다.", "UTF-8");
            return "redirect:/register/join?msg=" + msg+"&mode=false";
//            return "redirect:/register/join";
        }

//        System.out.println("userDto : " + userDto);

        userService.insertUser(userDto);

        return "redirect:/login";
    }



    /*------------------ajax 카테고리 영역 --------------------------*/
    @GetMapping("/register/cate")
    public ResponseEntity<List<Big_cateDto>> catelist() {
        try {
//            System.out.println("에이젝스옴");
            List<Big_cateDto> catelist = big_cateDao.select_bigCate();
//            System.out.println("여기에요: "+catelist);

            return new ResponseEntity<List<Big_cateDto>>(catelist, HttpStatus.OK);
        } catch (Exception e) {
//            throw new RuntimeException(e);

            e.printStackTrace();
            return new ResponseEntity<List<Big_cateDto>> (HttpStatus.BAD_REQUEST);// 400
        }

    }

    /*------------------ajax hopeLocal 영역 --------------------------*/
    @GetMapping("/register/local")
    public ResponseEntity<List<LocalDto>> locallist() {
        try {
            List<LocalDto> locallist = localDao.selecLocal();
//            System.out.println(locallist);

            return new ResponseEntity<List<LocalDto>>(locallist, HttpStatus.OK);
        } catch (Exception e) {
//            throw new RuntimeException(e);

            e.printStackTrace();
            return new ResponseEntity<List<LocalDto>> (HttpStatus.BAD_REQUEST);// 400
        }

    }

}


