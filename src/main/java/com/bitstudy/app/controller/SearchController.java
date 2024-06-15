package com.bitstudy.app.controller;


import com.bitstudy.app.domain.*;
import com.bitstudy.app.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SearchController {
    @Autowired
    StarService starService;
    @Autowired
    HeartService heartService;
    @Autowired
    MeetingService meetingService;
    @Autowired
    Meeting_detail_imgService meeting_detail_imgService;
    @Autowired
    Meeting_detail_textService meeting_detail_textService;
    @Autowired
    Meeting_memberService meeting_memberService;
    @Autowired
    CommentService commentService;
    @Autowired
    LocalService localService;
    @Autowired
    Big_cateService big_cateService;
    @Autowired
    Small_cateService small_cateService;


    @GetMapping("/search")
    public String search(SearchDto searchDto, Model mmm, HttpSession session, String s_cate,Integer page){

//        System.out.println("어떻게 받아오냐 ?" + s_cate);


//        // 모임번호,별갯수,별평균 나옴
//        List<StarDto> starDto = starService.starForUpdate();
//
//        //하트수 모아오기
//        List<HeartDto> heartDto = heartService.heartForUpdate();
//
//        //별점수 업데이트
//        for (StarDto num : starDto){
//            meetingService.starCountUpdate(num.getS_point_AVG(),num.getS_count(),num.getFK_M_seqno());
//        }
//
//        // 하트수 업데이트
//        for (HeartDto num2 : heartDto){
//            meetingService.heartCountUpdate(num2.getFK_M_seqno(),num2.getH_count());
//        }

        //지역 다찍어줄려고 리스트에 담아서 보내주기.
        List<LocalDto> localList = localService.selecLocal();

        //빅 카테고리 다찍어줄려고 리스트에 담아서 보내주기.
        List<Big_cateDto> bigCateList =big_cateService.select_bigCate();

        //스몰 카테고리 다찍어 줄려고 리스트에 담아서 보내주기
        List<Small_cateDto> smallCateList = small_cateService.select_smallCate();



        String id = (String) session.getAttribute("id");
        searchDto.setH_writer(id);

        if (s_cate != null){
            String[] arr = s_cate.split(",");
//            System.out.println("소카테고리 몇개인지: " + arr.length);

            if (arr.length==1){
                searchDto.setSC_option1(arr[0]);
            }
            else if (arr.length==2){
                searchDto.setSC_option1(arr[0]);
                searchDto.setSC_option2(arr[1]);
            }
            else if (arr.length==3){
                searchDto.setSC_option1(arr[0]);
                searchDto.setSC_option2(arr[1]);
                searchDto.setSC_option3(arr[2]);
            }
            else if (arr.length==4){
                searchDto.setSC_option1(arr[0]);
                searchDto.setSC_option2(arr[1]);
                searchDto.setSC_option3(arr[2]);
                searchDto.setSC_option4(arr[3]);
            }
            else if (arr.length==5){
                searchDto.setSC_option1(arr[0]);
                searchDto.setSC_option2(arr[1]);
                searchDto.setSC_option3(arr[2]);
                searchDto.setSC_option4(arr[3]);
                searchDto.setSC_option5(arr[4]);
            }
        }

        if (searchDto.getL_option() == ""){searchDto.setL_option(null);}
        if (searchDto.getBC_option() == ""){searchDto.setBC_option(null);}
        if (searchDto.getSC_option1() == ""){searchDto.setSC_option1(null);}


        if(page == null) {page=1;}

//        System.out.println("서비스 가기전 search: " + searchDto);

        int totalCount = meetingService.SearchCount(searchDto);
//        System.out.println("일하고온 갯수: " + totalCount);

        MainPageHandler mainPageHandler = new MainPageHandler(page,totalCount);
//        System.out.println(mainPageHandler);

        searchDto.setOffset((mainPageHandler.getPage()-1) * mainPageHandler.getPageSize());


        List<MeetingDto> meetingList =  meetingService.selectMeeting_seperate(searchDto,page);
        // meetingService 안에있는 메서드 명이 selectMeeting_seperate 인 애를 불러서 사용.
        // 사용하기 위해서 서비스에서 요청한(매개변수)를 맞춰주고 사용함.
        // 그리고 서비스를 갔다온다음 리턴해주는 값의 타입인  MeetingDto가 여러개라   List<MeetingDto>라는 타입을 가진  meetingList 변수명에 서비스를 저장.
        // 그값을 모델에 보내줘서 뷰파일에서 찍는거임.



        //서치 dto에서 offset으로 현재 페이지 표시해서 받아 온다는 소리임.
        mmm.addAttribute("ph",mainPageHandler);
        mmm.addAttribute("localList3",localList);
        mmm.addAttribute("bigCateList3",bigCateList);
        mmm.addAttribute("smallCateList3",smallCateList);
        mmm.addAttribute("meetingList",meetingList);


        return "searchPage";
    }


}
