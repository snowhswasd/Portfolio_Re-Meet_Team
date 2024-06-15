package com.bitstudy.app.dao;

import com.bitstudy.app.domain.MeetingDto;
import com.bitstudy.app.domain.SearchDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MeetingDaoImplTest {
    @Autowired
    MeetingDao MeetingDao;

    @Test
    public void selectMeeting_seperate() {

        SearchDto searchDto = new SearchDto("곰돌이","강남","게임", "코딩",null,null,null,null,0,0);

        System.out.println("여기에요: "+searchDto);

        List<MeetingDto> rowCount= MeetingDao.selectMeeting_seperate(searchDto);
        System.out.println(rowCount);
    }

    @Test
    public void searchCount() {

        System.out.println("나상민입니다.");

        SearchDto searchDto = new SearchDto("곰돌이","강남","게임", "코딩",null,null,null,null,0,0);

        System.out.println("여기에요: "+searchDto);

        int rowCount= MeetingDao.SearchCount(searchDto);
        System.out.println(rowCount);

    }

    @Test
    public void selectStarPoint() {
        List<MeetingDto> rowCount= MeetingDao.selectStarPoint("user2");
        System.out.println(rowCount);

    }

    @Test
    public void selectHeartPoint() {
        List<MeetingDto> rowCount= MeetingDao.selectHeartPoint("user2");
        System.out.println(rowCount);

    }

    @Test
    public void selectNewDate() {
        List<MeetingDto> rowCount= MeetingDao.selectNewDate("user2");
        System.out.println(rowCount);
    }

    @Test
    public void selectReview() {
        Map map= new HashMap();
        map.put("FK_BC_cate","게임");
        map.put("M_local","강남");

        List<Integer> rowCount= MeetingDao.selectReview(map);
        System.out.println(rowCount);

    }

    @Test
    public void selectCate() {

    }

    @Test
    public void selectDetailSide() {

    }

    @Test
    public void heartCountUpdate() {
        Map map= new HashMap();
        map.put("count",80);
        map.put("M_seqno",5);
        MeetingDao.heartCountUpdate(map);
    }

    @Test
    public void starCountUpdate() {
        Map map= new HashMap();
        map.put("M_starPoint",4);
        map.put("M_seqno",5);
        map.put("M_starCount",50);

        MeetingDao.starCountUpdate(map);
    }

    @Test
    public void testUpdate(){
        ArrayList<String> name = new ArrayList<>();
        name.add("보컬짱");
        name.add("피아노짱");
        name.add("작사작곡짱*작곡");
        name.add("공연짱");
        name.add("악기짱");
        name.add("주짓수짱");
        name.add("요가짱");
        name.add("축구짱");
        name.add("야구짱");
        name.add("서핑짱");
        name.add("한식짱");
        name.add("중식짱");
        name.add("초밥짱");
        name.add("양식짱");
        name.add("디저트짱");
        name.add("향수짱");
        name.add("메이크업짱");
        name.add("헤어짱");
        name.add("네일짱");
        name.add("타투짱");
        name.add("꽃꽂이짱");
        name.add("악세사리짱");
        name.add("도자기짱 ");
        name.add("캔들짱");
        name.add("목공짱");
        name.add("파충류짱");
        name.add("강아지짱");
        name.add("고양이짱");
        name.add("새짱");
        name.add("물고기짱");
        name.add("카메라짱");
        name.add("핸드폰짱");
        name.add("컴퓨터짱");
        name.add("게임기짱");
        name.add("스마트티비짱");
        name.add("독서짱");
        name.add("토론짱");
        name.add("강의짱");
        name.add("개발짱");
        name.add("영어짱");
        name.add("마포가수들");
        name.add("용산피아노짱들");
        name.add("강남작곡모여라*작곡");
        name.add("관악공연덕후");
        name.add("서초악기따봉");
        name.add("용산블루모여라");
        name.add("서초요가초보");
        name.add("미래의박지성");
        name.add("1루수가누구야");
        name.add("동해바다서핑모임");
        name.add("마포한식맛집탐험대");
        name.add("동대문구맛집탐험대");
        name.add("서초구맛집탐험대");
        name.add("용산구양식탐험대");
        name.add("양천구디저트맛집");
        name.add("향기나는리밋");
        name.add("꾸며꾸며");
        name.add("양천머리카락");
        name.add("마포네일모레");
        name.add("타투입문정보");
        name.add("서초힐링꽃꽂이");
        name.add("귀걸이덕후");
        name.add("접시좋아 ");
        name.add("양초만들기");
        name.add("용산목수들");
        name.add("도마뱀사랑꾼");
        name.add("관악멍멍이");
        name.add("영등포냥냥이");
        name.add("버드버드해피");
        name.add("너만의물꼬기");
        name.add("강남쏘니");
        name.add("핸드폰조아");
        name.add("컴퓨터조아");
        name.add("플스최고");
        name.add("스마트티비정보공유");
        name.add("독모독모");
        name.add("77분토론");
        name.add("강의배워요");
        name.add("c언어");
        name.add("동대문 중국어모임");
        name.add("관악보컬짱들");
        name.add("피아노중급");
        name.add("작사위주모임*작곡");
        name.add("성동구뮤덕모여라");
        name.add("드럼조와");
        name.add("주짓수조와");
        name.add("요가조와");
        name.add("축구조와");
        name.add("야구조와");
        name.add("서핑조와");
        name.add("한식조와");
        name.add("중식조와");
        name.add("일식조와");
        name.add("양식조와");
        name.add("디저트조와");
        name.add("향수조와");
        name.add("메이크업조와");
        name.add("헤어정보공유");
        name.add("네일조와");
        name.add("타투조와");
        name.add("꽃꽂이조와");
        name.add("목걸이정보공유");
        name.add("화분조와 ");
        name.add("캔들조와");
        name.add("목공조와");
        name.add("뱀덕후");
        name.add("강아지조와");
        name.add("고양이조와");
        name.add("버드맨");
        name.add("물고기맨");
        name.add("카메라맨");
        name.add("핸드폰정보");
        name.add("컴퓨터맨");
        name.add("플스맨");
        name.add("로봇청소기맨");
        name.add("양천안경잡이들");
        name.add("117분토론");
        name.add("강의중급");
        name.add("양천코딩모임");
        name.add("용산러시아어모임");
        name.add("서초꾀꼬리");
        name.add("영등포피아노");
        name.add("영등포작곡*작곡");
        name.add("용산콘서트");
        name.add("영등포기타");
        name.add("마포화이트");
        name.add("광진요가중급");
        name.add("서초쏘니");
        name.add("박준순짱");
        name.add("동해서핑");
        name.add("김치찌개짱");
        name.add("마라탕짱");
        name.add("돈부리짱");
        name.add("파슷하짱");
        name.add("팥버터짱");
        name.add("조말론최고");
        name.add("파우더정보공유");
        name.add("마포구파마전문");
        name.add("오늘네일");
        name.add("영등포타투");
        name.add("서초플로리스트");
        name.add("반지만들기");
        name.add("화병만들기 ");
        name.add("시트러스캔들");
        name.add("뚝딱뚝딱");
        name.add("악어떼");
        name.add("슈나우저둥둥이");
        name.add("아비시니안");
        name.add("날아라");
        name.add("헤엄쳐라");
        name.add("강남니콘");
        name.add("동대문앱등이");
        name.add("관악it");
        name.add("서초동물의숲");
        name.add("용산냉장고");
        name.add("영등포독모");
        name.add("157분토론");
        name.add("심리강의");
        name.add("자바스크립트");
        name.add("관악영어");
        name.add("서초보컬");
        name.add("서초피아노");
        name.add("영등포작곡*작곡");
        name.add("동대문소공연");
        name.add("용산베이스");
        name.add("주짓수퍼플");
        name.add("서초요가");
        name.add("동대문기성용");
        name.add("2루수가누구야");
        name.add("인터넷서핑아닙니다");
        name.add("김치찜사랑꾼");
        name.add("짬뽕맛집");
        name.add("돈가츠존맛");
        name.add("스테이크맛집");
        name.add("두유라이크쿠키?");
        name.add("이솝향수");
        name.add("립스틱정보");
        name.add("매직정보");
        name.add("손톱관리최고");
        name.add("서초타투이스트");
        name.add("서초플로리스트");
        name.add("발찌정보");
        name.add("서초접시만들기 ");
        name.add("광진캔들모임");
        name.add("광진뚝딱이들");
        name.add("동대문파충류");
        name.add("동대문슈나우저");
        name.add("광진뱅갈");
        name.add("영등포버드팀");
        name.add("용산어항");
        name.add("동대문쏘니");
        name.add("관악갤럭시");
        name.add("양천컴퓨터");
        name.add("성동동물의숲");
        name.add("강남갤럭시워치");
        name.add("서초독독이들");
        name.add("마포197분토론");
        name.add("마포해피바이러스");
        name.add("파이썬초보");
        name.add("중국어중급");
        name.add("성동구꾀꼬리들");
        name.add("피아노최고");
        name.add("서초작사최고*작곡");
        name.add("강남뮤덕");
        name.add("용산통기타");
        name.add("용산블루");
        name.add("동대문요가고급");
        name.add("메시형");
        name.add("덕수고박준순");
        name.add("관악서핑중급");
        name.add("부대찌개맛집");
        name.add("마라샹궈맛집");
        name.add("일본가정식정보공유");
        name.add("동대문파스타");
        name.add("두라쿠");
        name.add("조말론정보공유");
        name.add("치크정보");
        name.add("강남구파마정보");
        name.add("광진구네일정보");
        name.add("동대문네일정보");
        name.add("성동구플로리스트");
        name.add("관악팔찌정보");
        name.add("광진접시만들기 ");
        name.add("광진구캔들");
        name.add("마포뚝딱");
        name.add("광진투슬리스");
        name.add("재롱이짱");
        name.add("마포아메리칸숏헤어");
        name.add("버드버드");
        name.add("관악물고기");
        name.add("용산카메라정보");
        name.add("용산앱등이");
        name.add("성동 노트북");
        name.add("용산 동물의숲");
        name.add("서초 공기청정기");
        name.add("서초 똑똑이들");
        name.add("강남 똑똑이들");
        name.add("양천 강의 중급");
        name.add("파이썬 중급");
        name.add("강남 태국어 초보");


        Map map = new HashMap();
        for (int i=0; i<240; i++){
            map.put("M_name",name.get(i));
            map.put("M_seqno",i+1);

            MeetingDao.testUpdate(map);
        }
    };

    @Test
    public void insertMeeting() {


        ArrayList<String> M_local = new ArrayList<>();
        M_local.add("관악구");
        M_local.add("서초구");
        M_local.add("용산구");
        M_local.add("영등포구");
        M_local.add("강남구");
        M_local.add("성동구");
        M_local.add("마포구");
        M_local.add("양천구");
        M_local.add("광진구");
        M_local.add("동대문구");


        ArrayList<String> big_cate = new ArrayList<>();
        big_cate.add("음악");
        big_cate.add("스포츠");
        big_cate.add("쿠킹");
        big_cate.add("뷰티");
        big_cate.add("핸드메이드");
        big_cate.add("반려동물");
        big_cate.add("전자기기");
        big_cate.add("자기계발");


        ArrayList<String> FK_SC_cate = new ArrayList<>();
        FK_SC_cate.add("보컬");
        FK_SC_cate.add("피아노");
        FK_SC_cate.add("작사*작곡");
        FK_SC_cate.add("공연");
        FK_SC_cate.add("그외악기");
        FK_SC_cate.add("주짓수");
        FK_SC_cate.add("요가");
        FK_SC_cate.add("축구");
        FK_SC_cate.add("야구");
        FK_SC_cate.add("서핑");
        FK_SC_cate.add("한식");
        FK_SC_cate.add("중식");
        FK_SC_cate.add("일식");
        FK_SC_cate.add("양식");
        FK_SC_cate.add("디저트");
        FK_SC_cate.add("향수");
        FK_SC_cate.add("메이크업");
        FK_SC_cate.add("헤어");
        FK_SC_cate.add("네일");
        FK_SC_cate.add("타투");
        FK_SC_cate.add("꽃꽂이");
        FK_SC_cate.add("악세사리");
        FK_SC_cate.add("도자기 ");
        FK_SC_cate.add("캔들");
        FK_SC_cate.add("목공");
        FK_SC_cate.add("파충류");
        FK_SC_cate.add("강아지");
        FK_SC_cate.add("고양이");
        FK_SC_cate.add("새");
        FK_SC_cate.add("물고기");
        FK_SC_cate.add("카메라");
        FK_SC_cate.add("핸드폰");
        FK_SC_cate.add("컴퓨터");
        FK_SC_cate.add("게임기");
        FK_SC_cate.add("기타");
        FK_SC_cate.add("독서");
        FK_SC_cate.add("토론");
        FK_SC_cate.add("강의");
        FK_SC_cate.add("개발");
        FK_SC_cate.add("언어");


        for(int i=0; i< big_cate.size(); i++) {

            System.out.println(M_local.get(i));
        }


        System.out.println(M_local.size() +", " + big_cate.size() +", " +  FK_SC_cate.size());
        for(int k=0; k<6; k++) {
            int idx=0;
            for(int i=0; i< big_cate.size(); i++) {
                for(int j=0; j< 5; j++) {
                    MeetingDto meetingDto = new MeetingDto(M_local.get((int)(Math.random()*10)),
                            big_cate.get(i),
                            FK_SC_cate.get(idx++),"", 300, ("user" + i));
                    MeetingDao.insertMeeting(meetingDto);
                }
            }
        }

    }
}