package com.bitstudy.app.controller;


import com.bitstudy.app.domain.LoginDto;
import com.bitstudy.app.domain.UserDto;
import com.bitstudy.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    UserService userService;


    @GetMapping("/login")
    public String loginForm() {
        return "loginForm";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session, HttpServletRequest request) {

        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for(Cookie c: cookies) {
                String key = c.getName();
                String value = c.getValue();

                if(key.equals("id")) {
                    Cookie cookieID = new Cookie("id", value);
                    cookieID.setMaxAge(0);
                }
            }
        }


        session.invalidate();

        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(LoginDto loginDto, HttpServletRequest request, HttpServletResponse response) throws Exception {

        String id = loginDto.getId();
        String pw = loginDto.getPw();
        boolean rememberId = loginDto.isRememberID();
        boolean storeID = loginDto.isStoreID();

//System.out.println("loginDto: " + loginDto);
        if (!loginChk(id, pw)) {
            String msg1 = URLEncoder.encode("일치하는 정보가 없습니다.", "UTF-8");
            return "redirect:/login?msg1=" + msg1+"&mode=false";
        }
        Cookie cookieID = new Cookie("id", id);

        //id기억
        //id기억 안눌렀으면 여기 if문 실행
        if(!rememberId){
            cookieID.setMaxAge(0);
        }
//        System.out.println("아이디기억" + rememberId);
//        System.out.println("ID : " + id + "PW : " + pw);
        response.addCookie(cookieID);
        HttpSession session = request.getSession();
        session.setAttribute("id", id);

//        System.out.println("aaaaaaaaaaaa: "+ id);


        Cookie cookieID2 = new Cookie("id2", id);
        if(!storeID){
            cookieID2.setMaxAge(0);
        }
//        System.out.println("자동로그인" + rememberId);
//        System.out.println("ID : " + id + "PW : " + pw);
        response.addCookie(cookieID2);
        HttpSession session2 = request.getSession();
        session2.setAttribute("id2", id);

//        System.out.println("bbbbbbbbbbbbbbb : " + id);

        String msg = URLEncoder.encode("성공했습니다.", "UTF-8");
        return "redirect:/?msg=" + msg+"&mode=true";

//        return "redirect:/";

//        여기서 생성한 세션은 브라우저 창 끄면 없어져
        //하지만 ,id라는 이름으로 쿠키가 저장되있어
        // 따라서 다른 컨트롤러에서 저장된 쿠키 알아보고, 그 상태에서 세션 생성하면
        // 그게 자동 로그인



    }
    private boolean loginChk(String id, String pw) {


        Map map = new HashMap();
        map.put("id", id);
        map.put("pw", pw);

        UserDto userDto = userService.selectLogin(map);

        if (userDto == null) {
            return false;
        }

        return true;
    }

}

