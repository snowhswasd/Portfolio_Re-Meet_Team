package com.bitstudy.app.controller;


import com.bitstudy.app.dao.*;
import com.bitstudy.app.domain.*;
import com.bitstudy.app.service.*;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MyPageController {

    @Autowired
    StarService starService;
    @Autowired
    HeartService heartService;
    @Autowired
    Meeting_detail_imgService meeting_detail_imgService;


    @Autowired
    UserService userService;

    @Autowired
    UserDao userDao;

    @Autowired
    LocalDao localDao;

    @Autowired
    Big_cateDao big_cateDao;

    @Autowired
    Small_cateDao small_cateDao;

    @Autowired
    MeetingService meetingService;

    @Autowired
    Meeting_detail_imgDao meetingDetailImgDao;


    @GetMapping("/myPage")
    public String myPageform( HttpSession session, Model kkk) throws UnsupportedEncodingException {

        String id = (String) session.getAttribute("id");

        //로그인 안되있으면 login 으로 보내기.
        if (id==null){
            String msg = URLEncoder.encode("로그인후 이용 가능합니다!", "UTF-8");
            return "redirect:/login?msg="+msg;
        }

        UserDto userDto = userService.selectUser(id);
        Map meetingMember = meetingService.showMemeberList(id);
        Map myMeeting = meetingService.showMyMakeList(id);

        //지역 다찍어줄려고 리스트에 담아서 보내주기.
        List<LocalDto> localList = localDao.selecLocal();

        //빅 카테고리 다찍어줄려고 리스트에 담아서 보내주기.
        List<Big_cateDto> bigCateList =big_cateDao.select_bigCate();

        //스몰 카테고리 다찍어 줄려고 리스트에 담아서 보내주기
        List<Small_cateDto> smallCateList = small_cateDao.select_smallCate();


        kkk.addAttribute("userinfo", userDto);
        kkk.addAttribute("meetingMember", meetingMember);
        kkk.addAttribute("myMeeting", myMeeting);
        System.out.println("여기요1!!! : " + meetingMember);
        System.out.println("==============================================");
        System.out.println("여기요2!!! : " + myMeeting);
        kkk.addAttribute("localList3",localList);
        kkk.addAttribute("bigCateList3",bigCateList);
        kkk.addAttribute("smallCateList3",smallCateList);

        return "myPage";
    }


    @GetMapping("/deleteMember")
    public String memberDelete(HttpSession session) {

        String id = (String) session.getAttribute("id");
        userService.deleteUser(id);
        session.invalidate();

        return "redirect:/";
    }


    @PostMapping("/updateMember/save")
    public String updateMemberSave(UserDto userDto, HttpSession session, Model model) {

        String id = (String) session.getAttribute("id"); //로그인 아이디를 뽑아오고


        userDto.setId(userService.selectUser(id).getId()); // 로그인 된 회원 정보 뽑아옴
        String name = userService.selectUser(id).getName();
        String birth = userService.selectUser(id).getBirth();
        String gender = userService.selectUser(id).getGender();



        userService.updateUser(userDto);

        userDto.setName(name);
        userDto.setBirth(birth);
        userDto.setGender(gender);



        model.addAttribute("newUser", userDto);

        return "redirect:/myPage";
    }

    /*------------------ajax Big카테고리 영역 --------------------------*/
    @GetMapping("/myPage/Bigcate")
    public ResponseEntity<List<Big_cateDto>> Bigcatelist() {
        try {
//            System.out.println("에이젝스옴");
            List<Big_cateDto> catelist = big_cateDao.select_bigCate();

            return new ResponseEntity<List<Big_cateDto>>(catelist, HttpStatus.OK);
        } catch (Exception e) {
//            throw new RuntimeException(e);

            e.printStackTrace();
            return new ResponseEntity<List<Big_cateDto>> (HttpStatus.BAD_REQUEST);// 400
        }

    }

    /*------------------ajax Small카테고리 영역 --------------------------*/
    @GetMapping("/myPage/Smallcate")
    @ResponseBody
    public ResponseEntity<List<Small_cateDto>> Smallcatelist( Integer aaa ) {
        try {

            List<Small_cateDto> catelist = small_cateDao.select_smallCate2(aaa);

            return new ResponseEntity<List<Small_cateDto>>(catelist, HttpStatus.OK);
        } catch (Exception e) {
//            throw new RuntimeException(e);

            e.printStackTrace();
            return new ResponseEntity<List<Small_cateDto>> (HttpStatus.BAD_REQUEST);// 400
        }

    }


    /*------------------ajax hopeLocal 영역 --------------------------*/
    @GetMapping("/myPage/local")
    public ResponseEntity<List<LocalDto>> locallist() {
        try {
            List<LocalDto> locallist = localDao.selecLocal();

            return new ResponseEntity<List<LocalDto>>(locallist, HttpStatus.OK);
        } catch (Exception e) {
//            throw new RuntimeException(e);

            e.printStackTrace();
            return new ResponseEntity<List<LocalDto>> (HttpStatus.BAD_REQUEST);// 400
        }

    }

    private static final String F_PATH = "C:/Users/sungk/Desktop/team종결/team/src/main/webapp/resources/img/remeet";

    @PostMapping("/myPage/saveRemeet")
    public String makeRemeet
            (@RequestPart(value="filename", required = false)
             MultipartFile[] mf, Meeting_detail_imgDto meeting_detail_imgDto,UserDto userDto, MeetingDto meetingDto, HttpServletRequest request, HttpSession session ) throws Exception {

        List<Map<String, Object>> fileList = new ArrayList<Map<String, Object>>();
        String id = (String) session.getAttribute("id");
        meetingDto.setM_writer(id);

        meeting_detail_imgService.insertImg(meeting_detail_imgDto);

        /* 파일 업로드 */


        for(int i = 0; i< mf.length;i++) {

            String originalFileName = mf[i].getOriginalFilename();
            String safeFile = F_PATH + System.currentTimeMillis() + originalFileName;


            Map<String, Object> fileInfo = new HashMap<String, Object>();
            fileInfo.put("aaa", originalFileName);


            fileList.add(fileInfo);



            mf[i].transferTo(new File(safeFile));

            meeting_detail_imgDto.setMDI_image(originalFileName);
        }

        userDto.setId(userService.selectUser(id).getId()); // 로그인 된 회원 정보 뽑아옴
        String M_writer = userService.selectUser(id).getName();


        meetingDto.setM_writer(M_writer);

        meetingService.insertMeeting(meetingDto);

        int M_seqno = meetingService.selectForImg(meetingDto);




        meeting_detail_imgDto.setFK_M_seqno(M_seqno);


        for(int i = 0 ; i<mf.length; i++){


            meeting_detail_imgDto.setMDI_image(mf[i].getOriginalFilename());
            if(!(meeting_detail_imgDto.getMDI_image().equals(""))){
                meeting_detail_imgService.insertImg(meeting_detail_imgDto);
            }

            /*밖에서 하면 다섯번째꺼만 되니까*/
        }


        Meeting_detail_imgDto meeting_detail_imgDto2 = meetingDetailImgDao.selectImg2(M_seqno);
        meetingService.titleImgUpdate(meeting_detail_imgDto2.getFK_M_seqno(),meeting_detail_imgDto2.getMDI_image());


        return "redirect:/myPage";
    }



}



