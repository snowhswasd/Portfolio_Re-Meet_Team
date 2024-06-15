package com.bitstudy.app.controller;


import com.bitstudy.app.domain.*;
import com.bitstudy.app.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    UserService userService;
    @Autowired
    StarService starService;
    @Autowired
    HeartService heartService;
    @Autowired
    MeetingService meetingService;
    @Autowired
    Meeting_detail_imgService meeting_detail_imgService;
    @Autowired
    LocalService localService;
    @Autowired
    Big_cateService big_cateService;
    @Autowired
    Small_cateService small_cateService;



    @GetMapping("/")
    public String main(HttpServletRequest request, Model m){
//          최초 실행시 주석 제거한다
//        실행이 끝나면 다시 주석  최적화 작업
//        // 모임번호,별갯수,별평균 나옴
//        List<StarDto> starDto = starService.starForUpdate();
//
//        //하트수 모아오기
//        List<HeartDto> heartDto = heartService.heartForUpdate();
//
//        //번호랑 이미지 한장 불러오기
//        List<Meeting_detail_imgDto> meeting_detail_imgDto = meeting_detail_imgService.getTitleImg();
//
//
//        //별점수 업데이트
//        for (StarDto num : starDto){
//            meetingService.starCountUpdate(num.getS_point_AVG(),num.getS_count(),num.getFK_M_seqno());
//         }
//
//        // 하트수 업데이트
//        for (HeartDto num2 : heartDto){
//            meetingService.heartCountUpdate(num2.getFK_M_seqno(),num2.getH_count());
//        }
//
//        // 대표 이미지 업데이트
//        for (Meeting_detail_imgDto num3 : meeting_detail_imgDto){
//            meetingService.titleImgUpdate(num3.getFK_M_seqno(),num3.getMDI_image());
//        }

        HttpSession session = request.getSession();

//        이거 임시로 넣은거임 로그인 했을때 화면 보여주려고
//        session.setAttribute("id","user2");


        String id = (String) session.getAttribute("id");
//        System.out.println(id);
        UserDto userDto = userService.selectUser(id);
//        System.out.println("aaaaaa");
//        System.out.println("유저 디티오값 : " + userDto);


        if (userDto!=null){
            // 카테고리
            List<MeetingDto> cateMeeting = meetingService.selectCate(userDto.getFK_BC_cate(),id);

            //후기
            // 여기 안에들어있는거 키값이(imgList, textList)
            Map reviewMap = meetingService.test3( userDto.getFK_BC_cate(),userDto.getHopeLocal(),id);

            m.addAttribute("cateMeeting",cateMeeting);
            m.addAttribute("reviewMap",reviewMap);
        }

//        System.out.println("bbbbb");
        //별
        List<MeetingDto> starMeeting = meetingService.selectStarPoint(id);
//        System.out.println("ccccc");
        //하트
        List<MeetingDto> heartMeeting = meetingService.selectHeartPoint(id);
//        System.out.println("ddddd");
        //새로만들어진 애들
        List<MeetingDto> newMeeting = meetingService.selectNewDate(id);
//        System.out.println("eeeeee");


        //지역 다찍어줄려고 리스트에 담아서 보내주기.
        List<LocalDto> localList = localService.selecLocal();
//        System.out.println("로컬리스트에요: " +localList);

        //빅 카테고리 다찍어줄려고 리스트에 담아서 보내주기.
        List<Big_cateDto> bigCateList =big_cateService.select_bigCate();
//        System.out.println("빅카테고리 리스트에요:"+bigCateList);

        //스몰 카테고리 다찍어 줄려고 리스트에 담아서 보내주기
        List<Small_cateDto> smallCateList = small_cateService.select_smallCate();
//        System.out.println(smallCateList);






        m.addAttribute("starMeeting",starMeeting);
        m.addAttribute("heartMeeting",heartMeeting);
        m.addAttribute("newMeeting",newMeeting);


        m.addAttribute("userDto",userDto);
        m.addAttribute("localList",localList);
        m.addAttribute("bigCateList",bigCateList);
        m.addAttribute("smallCateList",smallCateList);


            return "mainPage2";

    };
    @PutMapping("/heart/modify/{M_seqno}")
    @ResponseBody
    public ResponseEntity<String> heartClick(@PathVariable Integer M_seqno,HttpSession session){
        try {
            String id = (String) session.getAttribute("id");
            int test2Result = meetingService.test2(M_seqno,id);
//            System.out.println("여기넘어오면 일단 ㅇㅋ");

//            return new ResponseEntity<String>("성공",HttpStatus.OK);
            HttpHeaders responseHeader = new HttpHeaders();
            responseHeader.add("content-type","text/html; charset=UTF-8");

            if (test2Result == 1){
                return new ResponseEntity<String>("위시 리스트에 추가되었습니다!",responseHeader,HttpStatus.OK);
            }
            else if(test2Result == 0){
                return new ResponseEntity<String>("위시 리스트에서 취소되었습니다!",responseHeader,HttpStatus.OK);
            }
            else {
                return new ResponseEntity<String>("로그인 후 이용해주세요.",responseHeader,HttpStatus.OK);
            }

        } catch (Exception e) {
            return new ResponseEntity<String> (HttpStatus.BAD_REQUEST);// 400
        }

    };
};
