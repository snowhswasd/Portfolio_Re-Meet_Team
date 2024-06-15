package com.bitstudy.app.controller;


import com.bitstudy.app.domain.*;
import com.bitstudy.app.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ClassController {
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


    @GetMapping("/ClassPage")
    public String Class(HttpServletRequest request, Model mm,Integer M_seqno){

        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("id");


//        System.out.println(M_seqno); // 번호 잘 넘어왔는지 확인.

//        // 모임번호,별갯수,별평균 나옴 모아온 이걸로 밑에 별 업데이트
//        List<StarDto> starDto = starService.starForUpdate();
//
//        //하트수 모아오기 모아온 이걸로 밑에 하트 업데이트
//        List<HeartDto> heartDto = heartService.heartForUpdate();
//
//        //별점수 업데이트
//        for (StarDto num : starDto){
//            meetingService.starCountUpdate(num.getS_point_AVG(),num.getS_count(),num.getFK_M_seqno());
//        }
//        // 하트수 업데이트
//        for (HeartDto num2 : heartDto){
//            meetingService.heartCountUpdate(num2.getFK_M_seqno(),num2.getH_count());
//        }


        // 리퀘스트로 받아온 정보에 모임번호로 미팅 정보들고오기.
        MeetingDto meetingDto = meetingService.selectDetailSide(M_seqno,id);
//        System.out.println("미팅 디티오가 어떻게? "+ meetingDto); // 정보 잘 받아왔는지 확인
        Meeting_detail_textDto meeting_detail_textDto = meeting_detail_textService.selectText(M_seqno);
//        System.out.println("텍스트는 들고왔어요.");
//        System.out.println(id);



        // 들어온 사람이 모임 만든사람인지 아닌지 체크할려고 정보 뽑아오기
        Meeting_memberDto meeting_memberDto = new Meeting_memberDto(M_seqno,id);
        Meeting_memberDto MMD = meeting_memberService.selectMember(meeting_memberDto);
        Integer MMD_result=0;


        // 미팅맴버에 들어있으면 1보내주고 아니면 0 보내줌 이값으로 가입하기 탈퇴하기 찍기.
        if (MMD == null){MMD_result = 0;}
        else {MMD_result = 1;}

//        System.out.println("이미지 불러오기 전");
        // 미팅 이미지 전체 불러오기
        List<Meeting_detail_imgDto> imgList = meeting_detail_imgService.selectImgAll(M_seqno);

        //지역 다찍어줄려고 리스트에 담아서 보내주기.
        List<LocalDto> localList = localService.selecLocal();
//        System.out.println("로컬리스트에요: " +localList);

        //빅 카테고리 다찍어줄려고 리스트에 담아서 보내주기.
        List<Big_cateDto> bigCateList =big_cateService.select_bigCate();
//        System.out.println("빅카테고리 리스트에요:"+bigCateList);

        //스몰 카테고리 다찍어 줄려고 리스트에 담아서 보내주기
        List<Small_cateDto> smallCateList = small_cateService.select_smallCate();
//        System.out.println(smallCateList);



        mm.addAttribute("detail",meetingDto);
        mm.addAttribute("meetingText",meeting_detail_textDto);
        mm.addAttribute("MMD_result",MMD_result);
        mm.addAttribute("imgList",imgList);
        mm.addAttribute("localList2",localList);
        mm.addAttribute("bigCateList2",bigCateList);
        mm.addAttribute("smallCateList2",smallCateList);




        return "classPage2";
    };




//
//    @GetMapping("/ClassPage/heart/{M_seqno}")
//    @ResponseBody
//    public ResponseEntity<String> ClassPageHeart(@PathVariable Integer M_seqno, HttpSession session){
//        try {
//            System.out.println("트라이 밑이에요:" + M_seqno); //여기 번호 찍어주는데 request에 있는거 찍으니깐 넘어 오다 안오다 해서  ajax에 담아서 넣었음.
//            String id = (String) session.getAttribute("id");
//            int test2Result = meetingService.test2(M_seqno,id);
//            System.out.println("여기넘어오면 일단 ㅇㅋ");
//
//            HttpHeaders responseHeader = new HttpHeaders();
//            responseHeader.add("content-type","text/html; charset=UTF-8");
//
//            if (test2Result == 1){
//                return new ResponseEntity<String>("위시 리스트에 추가되었습니다!",responseHeader,HttpStatus.OK);
//            }
//            else if(test2Result == 0){
//                return new ResponseEntity<String>("위시 리스트에서 취소되었습니다!",responseHeader,HttpStatus.OK);
//            }
//            else {
//                return new ResponseEntity<String>("로그인후 이용해주세요.",responseHeader,HttpStatus.OK);
//            }
//
//
//        } catch (Exception e) {
//            return new ResponseEntity<String> (HttpStatus.BAD_REQUEST);// 400
//        }
//
//    };

    @PatchMapping("/ClassPage/star/{M_seqno}")
    @ResponseBody
    public ResponseEntity<String> ClassPageStar(@PathVariable Integer M_seqno,Integer S_point,  HttpSession session) {
        try {
//            System.out.println("트라이 밑이에요:" + M_seqno);
//            System.out.println(S_point);
            String id = (String) session.getAttribute("id");
            int result = meetingService.test1(M_seqno, id,S_point);
//            System.out.println("여기넘어오면 일단 ㅇㅋ");

            HttpHeaders responseHeader = new HttpHeaders();
            responseHeader.add("content-type","text/html; charset=UTF-8");

            if (result == 0){
                return new ResponseEntity<String>("모임에 가입 되어있지 않습니다.",responseHeader, HttpStatus.OK);
            }

            else if (result == 1){
                return new ResponseEntity<String>("별점이 등록되었습니다.", responseHeader,HttpStatus.OK);
            }

            else{
                return new ResponseEntity<String>("별점이 업데이트 되었습니다.", responseHeader,HttpStatus.OK);
            }


        }
        catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);// 400
        }

    }


        @PutMapping("/ClassPage/member/{M_seqno}")
        @ResponseBody
    public ResponseEntity<String> ClassPageMember(@PathVariable Integer M_seqno, HttpSession session) {
        try {
//            System.out.println("맴버 트라이 밑이에요:" + M_seqno); //여기 번호 찍어주는데 request에 있는거 찍으니깐 넘어 오다 안오다 해서  ajax에 담아서 넣었음.

            String id = (String) session.getAttribute("id");

            Meeting_memberDto meeting_memberDto = new Meeting_memberDto(M_seqno,id);

            int result = meeting_memberService.MemberInOut(meeting_memberDto);
//            System.out.println("여기넘어오면 일단 ㅇㅋ");

            HttpHeaders responseHeader = new HttpHeaders();
            responseHeader.add("content-type","text/html; charset=UTF-8");


            if (result == 0){
                return new ResponseEntity<String> ("모임에서 탈퇴 되었습니다.", responseHeader, HttpStatus.OK);// 200
            }

            else if(result == 1){
                return new ResponseEntity<String> ("모임에 가입 되었습니다.", responseHeader, HttpStatus.OK);// 200
            }

            else{
                return new ResponseEntity<String> ("로그인 후 이용가능합니다.", responseHeader, HttpStatus.OK);// 200
            }

        }
        catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);// 400
        }

    }

    //댓글 다불러오기
    @GetMapping("/comments")
    @ResponseBody
    public ResponseEntity<List<CommentDto>> list(Integer M_seqno) {
        // ResponseEntity: 응답이나 요청시 전송할 정보를 보낼 대상에 임의의 상태코드를 보낼수 있음
        try {
            List<CommentDto> commentList = commentService.selectPage(M_seqno);
//            System.out.println("리스트 찍히는곳: "+ commentList);
            return new ResponseEntity<List<CommentDto>> (commentList, HttpStatus.OK);// 200

        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
            return new ResponseEntity<List<CommentDto>> (HttpStatus.BAD_REQUEST);// 400
        }
    }

    //댓글 등록
    @PostMapping("/comments")
    public ResponseEntity<String> write(@RequestBody String C_text, Integer M_seqno, HttpSession session) {
        try {
//            System.out.println("글내용: "+ C_text);

            //이거 성공해서 값 넘어갈때 인코딩해주는애
            HttpHeaders responseHeader = new HttpHeaders();
            responseHeader.add("content-type","text/html; charset=UTF-8");

            String commenter = (String) session.getAttribute("id");

            if (commenter == null){
                return  new ResponseEntity<String> ("로그인 후 이용해주세요", responseHeader, HttpStatus.OK);// 200
            }

            Meeting_memberDto meeting_memberDto = new Meeting_memberDto(M_seqno,commenter);

            if (meeting_memberService.selectMember(meeting_memberDto) == null){
                return  new ResponseEntity<String> ("리밋 가입 후 이용해주세요.", responseHeader, HttpStatus.OK);// 200
            }

            CommentDto commentDto = new CommentDto(M_seqno,commenter,C_text);

            commentService.insertComment(commentDto);

            return new ResponseEntity<String> ("댓글 등록 성공", responseHeader, HttpStatus.OK);// 200

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String> (HttpStatus.BAD_REQUEST);// 400
        }
    }

    /* 댓글 삭제 */
    @DeleteMapping("/comments/{cno}")
    public ResponseEntity<String> remove(@PathVariable Integer cno, HttpSession session) {
        try {
            String commenter = (String) session.getAttribute("id");

            HttpHeaders responseHeader = new HttpHeaders();
            responseHeader.add("content-type","text/html; charset=UTF-8");

            if (commentService.commentDelete(cno,commenter) == 0){
                return new ResponseEntity<String> ("댓글 삭제에 실패했습니다.", responseHeader, HttpStatus.OK);// 200
            }
            else {
                return new ResponseEntity<String> ("댓글 삭제에 성공했습니다.", responseHeader, HttpStatus.OK);// 200
            }


        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String> (HttpStatus.BAD_REQUEST);// 400
        }
    }













};
