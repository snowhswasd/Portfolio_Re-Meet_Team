package com.bitstudy.app.service;

import com.bitstudy.app.dao.*;
import com.bitstudy.app.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MeetingService {
    @Autowired
    MeetingDao meetingDao;

    @Autowired
    StarDao starDao;

    @Autowired
    HeartDao heartDao;

    @Autowired
    Meeting_memberDao meetingMemberDao;

    @Autowired
    UserDao userDao;

    @Autowired
    Meeting_detail_imgDao meeting_detail_imgDao;

    @Autowired
    CommentDao commentDao ;

    @Autowired
    Meeting_detail_textDao meeting_detail_textDao ;





    //    <!--특정모임 불러오기-->
    public List<MeetingDto> selectMeeting_seperate(SearchDto searchDto,Integer page){

        if (searchDto.getSC_option1()==null){
            return meetingDao.selectMeeting_seperate(searchDto);
        }
        else {
            List<MeetingDto> ttt = meetingDao.selectMeeting_seperate(searchDto);
//            System.out.println("서비스에서찍은 검색후 큰 리스트: " + ttt);
//            System.out.println("서치 디티오 안에있는 sc옵션1: " + searchDto.getSC_option1());
            List<MeetingDto> yyy = new ArrayList<>();
            List<MeetingDto> kkk = new ArrayList<>();
            int count = 12;
            for (MeetingDto num : ttt){
//                System.out.println("맵퍼에서 가져온 리스트에있는 스몰카테: " + num.getFK_SC_cate());
                if(num.getFK_SC_cate().equals( searchDto.getSC_option1()) || num.getFK_SC_cate().equals( searchDto.getSC_option2()) || num.getFK_SC_cate().equals( searchDto.getSC_option3()) || num.getFK_SC_cate().equals( searchDto.getSC_option4()) || num.getFK_SC_cate().equals( searchDto.getSC_option5())){

                    yyy.add(num);

                }
            }
            count= (page-1)*count;
            for (int i=0; i<12; i++){
                if (yyy.size()>i+count){kkk.add(yyy.get(i+count));}
            }
            count=0;
            return kkk;
        }
    }

    //    <!--검색한 모임의 결과 갯수 찍어주기-->
    //    <!--검색한 모임의 결과 갯수 찍어주기-->
    public int SearchCount(SearchDto searchDto){
        if (searchDto.getSC_option1()==null){
            return meetingDao.SearchCount(searchDto);
        }
        else {
            List<MeetingDto> ttt = meetingDao.selectMeeting_seperate(searchDto);
            List<MeetingDto> yyy = new ArrayList<>();
            for (MeetingDto num : ttt){
                if(num.getFK_SC_cate().equals( searchDto.getSC_option1()) || num.getFK_SC_cate().equals( searchDto.getSC_option2()) || num.getFK_SC_cate().equals( searchDto.getSC_option3()) || num.getFK_SC_cate().equals( searchDto.getSC_option4()) || num.getFK_SC_cate().equals( searchDto.getSC_option5())){
                    yyy.add(num);
                }
            }
            return yyy.size();
        }

    }

    // <!--8-1) 미팅 테이블에 (select) 별점 누른수 10명이상 안에서 별점 높은 순으로 줄세워서 9개 뽑아오기-->
    public List<MeetingDto> selectStarPoint(String H_writer){
        return meetingDao.selectStarPoint(H_writer);
    }

    // <!--8-1) 미팅 테이블에 (select) 하트 높은 순으로 줄세워서 9개 뽑아오기-->
    public  List<MeetingDto> selectHeartPoint(String H_writer){
        return meetingDao.selectHeartPoint(H_writer);
    }

    // <!--9-1) 미팅 테이블(select) 날짜별로 9개 뽑아오기 == 새로 만들어진 리스트 -->
    public List<MeetingDto> selectNewDate(String H_writer){
        return meetingDao.selectNewDate(H_writer);
    }

    // <!--10-1) 미팅 테이블(select(빅카테,위치)) 보내서 값 9개 받아오기.//메인페이지 후기 -->
    //맵에 들어갈 내용: FK_BC_cate,M_local
    public List<Integer> selectReview( Integer FK_BC_cate, String M_local){

        Map map = new HashMap();
        map.put("FK_BC_cate",FK_BC_cate);
        map.put("M_local",M_local);

        return meetingDao.selectReview(map);
    }


    // <!--10-2)  미팅 테이블(select(빅카테) 값 9개 뽑아오기 == 카테고리 추천 -->
    public List<MeetingDto> selectCate(String FK_BC_cate,String id){
        Map map = new HashMap<>();
        map.put("FK_BC_cate",FK_BC_cate);
        map.put("H_writer",id);

        return meetingDao.selectCate(map);
    };


    //    <!--31) 미팅테이블(select(모임 고유번호)) 보내주고 리스트로 받아와서 필요한거 뷰파일에서 찍기 -->
    //    <!--상세페이지 옆에 모임에 대한 설명관련-->
    public MeetingDto selectDetailSide(Integer M_seqno,String id){

        Map map = new HashMap();
        map.put("M_seqno",M_seqno);
        map.put("H_writer",id);

        return meetingDao.selectDetailSide(map);
    }

    // <!-- 7-1 하트 카운트 화면 들어가면 업데이트 해주는 것-->
    // 맵에 들어갈 내용: count, M_seqno
    public int heartCountUpdate(Integer M_seqno,Integer count){

        Map map = new HashMap();
        map.put("M_seqno",M_seqno);
        map.put("count",count);

        return meetingDao.heartCountUpdate(map);
    }

    //<!-- 7-5 스타카운트랑 점수 업데이트 해주는것-->
    //    <!--평균점수 받을떄 중간에 형변환 해서 받아야함-->
    // 맵에  M_starPoint, M_starCount, M_seqno
    public int starCountUpdate(Double S_point_AVG, Integer S_count,Integer M_seqno){
        Map map=new HashMap<>();
        map.put("M_starPoint",S_point_AVG);
        map.put("M_starCount",S_count);
        map.put("M_seqno",M_seqno);

        return meetingDao.starCountUpdate(map);
    }

    // <!-- 화면들어가기전에 모임 번호에 맞춰서 대표이미지 업로드  -->
    public Integer titleImgUpdate(Integer M_seqno,String M_titleImg){
        Map map = new HashMap<>();
        map.put("M_seqno",M_seqno);
        map.put("M_titleImg",M_titleImg);

        return meetingDao.titleImgUpdate(map);
    };





    //<!--21. 새로운 모임 만들기-->
    public int insertMeeting(MeetingDto meetingDto){
        return meetingDao.insertMeeting(meetingDto);
    }


    //*************** 여기부터는 합친것들 *************************
    //별 클릭시
    //그모임에 그사람이 가입되어 있는지 확인후
    //별안에 애가 들어있는지 확인하고
    //들어가있으면 수정.
    //없으면 점수준걸로 인설트.

    public int test1(Integer M_seqno,String id, Integer s_point){

        Meeting_memberDto meeting_memberDto = new Meeting_memberDto();
        meeting_memberDto.setId(id);
        meeting_memberDto.setFK_M_seqno(M_seqno);

        Meeting_memberDto aaa =meetingMemberDao.selectMember(meeting_memberDto);

        //위에서 미팅번호랑 사용자 id받아와서 그사림이 별점줄 자격이있는지 체크(모임에 가입되어있는지)
        if (aaa==null){
            return 0;
        }

        else {
            Map map = new HashMap();
            map.put("FK_M_seqno",M_seqno);
            map.put("S_writer",id);
            StarDto bbb = starDao.selectStarUser(map);

            StarDto starDto = new StarDto(M_seqno,id,s_point);
            //이미 별점을 준사람인지 체크하고 줬으면 업데이트 안줬으면 인설트
            //인설트하면 1 보내고 업데이트하면 2보내고
            if (bbb == null){
                starDao.starInsert(starDto);
                StarDto starDto2 = starDao.star(M_seqno);
                Map mapS = new HashMap();
                mapS.put("M_starPoint",starDto2.getS_point_AVG());
                mapS.put("M_starCount",starDto2.getS_count());
                mapS.put("M_seqno",starDto2.getFK_M_seqno());

                meetingDao.starCountUpdate(mapS);
                return 1;
            }
            else {
                starDao.starUpdate(starDto);
                StarDto starDto2 = starDao.star(M_seqno);
                Map mapS = new HashMap();
                mapS.put("M_starPoint",starDto2.getS_point_AVG());
                mapS.put("M_starCount",starDto2.getS_count());
                mapS.put("M_seqno",starDto2.getFK_M_seqno());

                meetingDao.starCountUpdate(mapS);

                return  2;
            }
        }
    };

//    public int test1_1(Integer M_seqno,String id, Integer s_point){
//
//        Meeting_memberDto meeting_memberDto = new Meeting_memberDto();
//        meeting_memberDto.setId(id);
//        meeting_memberDto.setFK_M_seqno(M_seqno);
//
//        Meeting_memberDto aaa =meetingMemberDao.selectMember(meeting_memberDto);
//
//        //위에서 미팅번호랑 사용자 id받아와서 그사림이 별점줄 자격이있는지 체크(모임에 가입되어있는지)
//        if (aaa==null){
//            return 0;
//        }
//
//        else {
//            Map map = new HashMap();
//            map.put("FK_M_seqno",M_seqno);
//            map.put("S_writer",id);
//            StarDto bbb = starDao.selectStarUser(map);
//
//            StarDto starDto = new StarDto(M_seqno,id,s_point);
//            //이미 별점을 준사람인지 체크하고 줬으면 업데이트 안줬으면 인설트
//            //인설트하면 1 보내고 업데이트하면 2보내고
//            if (bbb == null){
//                starDao.starInsert(starDto);
//                return 1;
//            }
//            else {
//                starDao.starUpdate(starDto);
//                return  2;
//            }
//        }
//    };

    //하트 클릭시
    //하트 테이블 안에 있는 애가 들어있는지 확인하고
    //들어가있으면 취소
    //안들어가 있으면 추가

    public int test2(Integer M_seqno,String id){
        //위에서 미팅번호랑 사용자 id 받아오기
        //하트를 누른사람인지 안누른 사람인지 체크
        //미팅번호랑 아이디 보내서 확인하기.
        HeartDto heartDto = new HeartDto(M_seqno,id);
        HeartDto ccc = heartDao.selectHeart(heartDto);

//        System.out.println("여기에요: "+ ccc);

        if (ccc == null){
            heartDao.insertHeart(heartDto);
            HeartDto heartDto2 = heartDao.heart(M_seqno);

            Map map1 = new HashMap();
            map1.put("M_seqno",M_seqno);
            map1.put("count",heartDto2.getH_count());

            meetingDao.heartCountUpdate(map1);

            return 1;
        }
        else {
            heartDao.deleteHeart(heartDto);
            HeartDto heartDto2 = heartDao.heart(M_seqno);

            Map map2 = new HashMap();
            map2.put("M_seqno",M_seqno);
            map2.put("count",heartDto2.getH_count());

            meetingDao.heartCountUpdate(map2);


            return  0;
        }

    };

//    public int test2_2(Integer M_seqno,String id){
//        //위에서 미팅번호랑 사용자 id 받아오기
//        //하트를 누른사람인지 안누른 사람인지 체크
//        //미팅번호랑 아이디 보내서 확인하기.
//        HeartDto heartDto = new HeartDto(M_seqno,id);
//
//        System.out.println("여기에요 잘못된곳이:"+ heartDto);
//
//        HeartDto ccc = heartDao.selectHeart(heartDto);
//        System.out.println("여기에요: "+ ccc);
//
//        if (ccc == null){
//            heartDao.insertHeart(heartDto);
//            return 1;
//        }
//        else {
//            heartDao.deleteHeart(heartDto);
//            return  0;
//        }
//
//    };



    //후기 (미팅에 2,3번 묶어서 넣을 수 있을거 같음)
    //할일 3개
    //1. 로그인된 유저 아이디 보고 아디값 보내서 지역이랑 카테고리 맞춰서 bno뽑아오고
    //2. 그 M-seqno보고 사진 들고오기
    //3. 그 M-seqno보고 텍스트 들고오기

    // 다영이 누나꺼
    // 세션에서 로그인된 유저 아이디를 들고온다
    // 유저아디를 보내서 그 유저 아이디의 지역과 빅 카테고리 정보를 받아온다.(유저테이블에있는걸 아이디로 가서 들고오는 거임.)
    // 받아온 카테고리랑 지역정보를 미팅테이블에 보내서 그미팅 테이블을 검색하면 거기에 맞는 M_seqno 9개 들고오기.
    // 그 번호를 가지고 상세이미지 테이블에가서 이미지를 뽑아온다.
    // 그 번호를 가지고 상세텍스트 테이블에가서 텍스트를 봅아온다.

    //내꺼
    // 세션에서 로그인된 유저 아이디를 들고온다
    // 유저아디를 보내서 그 유저 아이디의 지역과 빅 카테고리 정보를 받아온다.(유저테이블에있는걸 아이디로 가서 들고오는 거임.)
    // 받아온 카테고리랑 지역정보를 미팅테이블에 보내서 그미팅 테이블을 검색하면 거기에 맞는 M_seqno 9개 들고오기.
    // 받아온 넘버가 리스트에 다담겨있는데(다안담을거면 Dto만드는고 고려)
    // 저장된 리스트에서 .getM_seqno를 뽑아와서
    // 어레이 리스트에 담는다 1,2,3,4,5,6,7,8,9
    // 그 번호를 가지고 상세이미지 테이블에가서 이미지를 뽑아온다.
    // 그번호를 포이치돌려서 한마디로 상세이미지 들고오는 서비스를 9번돌린다는소리임 그래서 9번저장하고 보내주는거임
    // 리스트에 저장해도됨
    // 그 번호를 가지고 상세텍스트 테이블에가서 텍스트를 봅아온다.
    // 위와 똑같이 해준다.

    public Map test3(String ddd, String eee,String id){
//        UserDto userDto = userDao.selectUser(id); //이거 컨트롤러에 있어서 지움

//        userDto.getFK_BC_cate(); //이거 컨트롤러에 있어서 지움
//        userDto.getHopeLocal(); //이거 컨트롤러에 있어서 지움
// 위에 id받아서 여기서 뽑을랬는데 콘트롤러에 그값이 있어서 바로 매겨변수로 받아옴


        Map map = new HashMap();
        map.put("FK_BC_cate",ddd);
        map.put("M_local",eee);

        List<Integer> fff = meetingDao.selectReview(map);



        //후기 글 받을거
        List<String> hhh= new ArrayList<>();



        List<MeetingDto> nnn= new ArrayList<>();

        String jjj;

        MeetingDto mmm = new MeetingDto();

        Map map3 = new HashMap();



        for (int num : fff) {
            jjj  = commentDao.commentLimitOne(num);
            hhh.add(jjj);
        }

        for (int num : fff) {
            map3.put("M_seqno",num);
            map3.put("H_writer",id);

            mmm  = meetingDao.selectDetailSide(map3);
            nnn.add(mmm);
        }



        Map map2 = new HashMap();
        map2.put("textList",hhh);
        map2.put("meeting",nnn);


        return map2;
    };


    public Map showMemeberList(String id) {
        /* 함수에서 유저 아이디 받아와서 그걸로 유저가 가입한 모임 번호를 map으로 받아옴*/
//        System.out.println("11111111" + id);
        List<Integer> meetingNo = meetingMemberDao.selectMemberCount(id);

        /*미팅멤버다오에서 */
//        System.out.println("aaaaaaaaaaaaaa: " + meetingNo);
        /*위에 주석에 관한것을 저장한게 이거야*/

        Map map4 = new HashMap();

        List<MeetingDto> aaa = new ArrayList<>();
        List<Meeting_detail_textDto> bbb = new ArrayList<>();

        MeetingDto meeting;
        Meeting_detail_textDto meetingText;


        for(Integer ttt : meetingNo) {
            map4.put("M_seqno",ttt);
            map4.put("H_writer",id);
            meeting = meetingDao.selectDetailSide(map4);
            aaa.add(meeting);
        }

        for(Integer ttt1 : meetingNo) {
            meetingText = meeting_detail_textDao.selectText(ttt1);
            bbb.add(meetingText);
        }




//        System.out.println("진짜 가고 싶다4 : " +bbb);

        Map map = new HashMap();
        map.put("meetingNO", aaa);
        map.put("meeingText", bbb);

        /*가입한 모임만큼 포이치 돌려야 하며 그리고 그걸 다시 리스트에 저장해야 하니까 포이치 돌린거야*/
//        System.out.println("진짜 가고 싶다5 : " + map);

        return map;
    }

    public Map showMyMakeList(String id) {
        /* 함수에서 유저 아이디 받아와서 그걸로 유저가 가입한 모임 번호를 map으로 받아옴*/
        System.out.println("11111111" + id);

        /*여기서 실수함
        * 내가 필요한거 위에서 받아온 아이디 값을 보내서 M_Writer값을 받아와서 밑에 makeMyMeeting에 M_Writer를 보내줘야한다.
        *
        * 따라서
        * select name from user
          where id = "user100";
        이거하면 이름 뽑아옴*/
        
        /*DB에 M_writer가 아이디로 들어가? 이름으로 들어가? 그 차이로 오류 발생*/

        String M_Writer = meetingDao.makeMyMeetingName(id);

        List<Integer> myMeetingNo = meetingDao.makeMyMeeting(M_Writer);
        /*  select FK_M_seqno from meeting
        where M_writer = #{id}
        이거 실행 따라서 myMeetingNo의 안에는 FK_M_seqno가 차례로 들어감
        */

        /*미팅멤버다오에서 */
        System.out.println("aaaaaaaaaaaaaa: " + myMeetingNo);
        /*위에 주석에 관한것을 저장한게 이거야*/

        Map map5 = new HashMap();


        List<MeetingDto> ccc = new ArrayList<>();
        List<Meeting_detail_textDto> ddd = new ArrayList<>();

        MeetingDto mymeeting;
        Meeting_detail_textDto mymeetingText;


        /*myMeetingNo에 저장된 배열의 값이 ttt에 차례대로 저장*/
        for(Integer ttt : myMeetingNo) {
            map5.put("M_seqno",ttt);
            map5.put("H_writer",id);
            /*ttt = 내가 만든 리밋의 고유번호*/
            System.out.println("진짜 가고 싶다1 : " + ttt);
            mymeeting = meetingDao.selectDetailSide(map5);
            System.out.println("진짜 가고 싶다2 : " +mymeeting);
            ccc.add(mymeeting);
        }
        System.out.println("진짜 가고 싶다3 : " +ccc);

        for(Integer ttt2 : myMeetingNo) {
            mymeetingText = meeting_detail_textDao.selectText(ttt2);
            ddd.add(mymeetingText);
        }

        System.out.println("진짜 가고 싶다4 : " +ddd);

        Map map = new HashMap();
        map.put("myMeetingNo", ccc);
        map.put("mymeetingText", ddd);

        /*가입한 모임만큼 포이치 돌려야 하며 그리고 그걸 다시 리스트에 저장해야 하니까 포이치 돌린거야*/
        System.out.println("진짜 가고 싶다5 : " + map);

        return map;
    }

    public int selectForImg(MeetingDto meetingDto) {
        int ttt = meetingDao.selectForImg(meetingDto);
//        System.out.println("tttttt" + ttt);
        return ttt;
    }



}
