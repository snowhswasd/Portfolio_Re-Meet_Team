JDK 11 version
Tomcat 9.088 version

데이터 베이스 명은 team으로 사용했습니다.

1. 밑에 있는 코드로 테이블 생성 및 지역, 대분류, 소분류 생성
2. test에 insert문 돌리기
2-1) UserDaoImplTest
2-2) MeetingDaoImplTest(인설트문돌리고 위에 업데이트 문도 같이 돌리기)
2-3) Meeting_detail_textDaoImplTest
2-4) Meeting_detail_imgDaoImplTest
2-5) insertHeart
2-6) CommentDaoImplTest

3. 최초 실행때는  MainController에있는 아래주석들 지워주기(전체 업데이트).

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

4.  MyPageController에 있는 아래문구(업로드 된 이미지 다운받을 경로) 컴퓨터에 맞춰 설정 
    private static final String F_PATH = "C:/Users/나상민/OneDrive/바탕 화면/tp/team/src/main/webapp/resources/img/remeet"; 

5. 최초실행이 아니라면 3번내용 주석처리해주기


create table user(
u_seqno int auto_increment,
id varchar(255) not null unique,
pw varchar(255) not null,
gender varchar(255) not null,
FK_BC_cate varchar(255) not null,
name varchar(255) not null,
hopeLocal varchar(255) not null,
birth varchar(255) not null,

primary key(u_seqno)
);

create table meeting(
M_seqno int auto_increment,
M_local varchar(255) not null,
FK_BC_cate varchar(255) not null,
FK_SC_cate varchar(255) not null,
M_name varchar(255) not null,
M_limit int not null default 300,
M_writer varchar(255) not null,
M_starPoint DOUBLE not null default 0,
M_starCount int not null default 0,
M_heart int not null default 0,
M_reg_date datetime default CURRENT_TIMESTAMP null,
M_titleImg varchar(255) not null default "",

primary key(M_seqno)
);

create table big_cate(
BC_seqno int auto_increment,
BC_name varchar(255) not null unique,

primary key(BC_seqno)
);

create table small_cate(
SC_seqno int auto_increment,
FK_BC_cate int not null,
SC_name varchar(255) not null unique,

primary key(SC_seqno)
);


create table local (
L_seqno int not null auto_increment,
L_name varchar(255) not null,

primary key(L_seqno)
);


create table meeting_detail_text(
MDT_seqno int  auto_increment,
FK_M_seqno int not null,
MDT_content varchar(255) not null,
id varchar(50) not null,

primary key(MDT_seqno)
);

create table meeting_detail_img(
MDI_seqno int auto_increment,
FK_M_seqno int not null,
MDI_image varchar(255) not null,

primary key(MDI_seqno)
);



create table comment (
C_seqno int not null auto_increment,
FK_M_seqno int not null,
C_writer varchar(255) not null,
C_text varchar(255) not null ,
C_reg_date DATETIME null,

primary key(C_seqno)
);



create table heart (
H_seqno int not null auto_increment,
FK_M_seqno int not null,
H_writer varchar(255) not null,

primary key(H_seqno)
);



create table star (
S_seqno int not null auto_increment,
FK_M_seqno int not null,
S_writer varchar(255) not null,
S_point int not null,

primary key(S_seqno)
);



create table meeting_member (
MM_seqno int not null auto_increment,
FK_M_seqno int not null,
id varchar(255) not null,

primary key(MM_seqno)
);

select * from user;



insert into local values(null,"관악구");
insert into local values(null,"서초구");
insert into local values(null,"용산구");
insert into local values(null,"영등포구");
insert into local values(null,"강남구");
insert into local values(null,"성동구");
insert into local values(null,"마포구");
insert into local values(null,"양천구");
insert into local values(null,"광진구");
insert into local values(null,"동대문구");

insert into big_cate values (null,"음악");
insert into big_cate values (null,"스포츠");
insert into big_cate values (null,"쿠킹");
insert into big_cate values (null,"뷰티");
insert into big_cate values (null,"핸드메이드");
insert into big_cate values (null,"반려동물");
insert into big_cate values (null,"전자기기");
insert into big_cate values (null,"자기계발");


insert into small_cate values (null,1,"보컬");
insert into small_cate values (null,1,"피아노");
insert into small_cate values (null,1,"작사*작곡");
insert into small_cate values (null,1,"공연");
insert into small_cate values (null,1,"그외악기");


insert into small_cate values (null,2,"주짓수");
insert into small_cate values (null,2,"요가");
insert into small_cate values (null,2,"축구");
insert into small_cate values (null,2,"야구");
insert into small_cate values (null,2,"서핑");


insert into small_cate values (null,3,"한식");
insert into small_cate values (null,3,"중식");
insert into small_cate values (null,3,"일식");
insert into small_cate values (null,3,"양식");
insert into small_cate values (null,3,"디저트");


insert into small_cate values (null,4,"향수");
insert into small_cate values (null,4,"메이크업");
insert into small_cate values (null,4,"헤어");
insert into small_cate values (null,4,"네일");
insert into small_cate values (null,4,"타투");


insert into small_cate values (null,5,"꽃꽃이");
insert into small_cate values (null,5,"악세사리");
insert into small_cate values (null,5,"도자기");
insert into small_cate values (null,5,"캔들");
insert into small_cate values (null,5,"목공");


insert into small_cate values (null,6,"파충류");
insert into small_cate values (null,6,"강아지");
insert into small_cate values (null,6,"고양이");
insert into small_cate values (null,6,"새");
insert into small_cate values (null,6,"물고기");

insert into small_cate values (null,7,"카메라");
insert into small_cate values (null,7,"핸드폰");
insert into small_cate values (null,7,"컴퓨터");
insert into small_cate values (null,7,"게임기");
insert into small_cate values (null,7,"기타");


insert into small_cate values (null,8,"독서");
insert into small_cate values (null,8,"토론");
insert into small_cate values (null,8,"강의");
insert into small_cate values (null,8,"개발");
insert into small_cate values (null,8,"언어");
