package com.bitstudy.app;


/**

 /**
 1. MVN Repo 에서 mybatis 검색 해서 'mybatis'랑 'mybaris spring(2버전대꺼)' 두개 가져와서 pom.xml 에 넣고 reload
 2. root-context.xml 에서
     <bean id="sqlSessionFactory" 랑
     <bean id="sqlSession" 이거 넣기
 3. Mapper 만들기
    main > resources > mapper 폴더 생성 > boardMapper.xml 생성 (이 파일에 모든 sql 저장할거임)
 4. mybatis-config.xml 생성
    main > resources > mybatis-config.xml 생성


 5. java > com.bitstudy.app > 패키지 생성(controller, dao, domain)
 6. css, views 생성(이전 ch2에서 복사해오기)
 7. ch2에서 loginController, registerController 복사해서 controller 패키지에 넣기
 8. ch2에서 User, UserDaoImple 복사해서 dao 패키지에 넣기
 9. ch2에서 User, UserLogin 복사해서 domain 에 넣기 (각각 이름 뒤에 Dto 넣기)
 10. 게시판용 테이블(DB) 만들기
     create table board (
         bno int auto_increment primary key ,
         title varchar(255) not null ,
         content text not null ,
         writer  varchar(255) not null ,
         view_count int default 0 null,
         comment_count int default 0 null,
         reg_date datetime default CURRENT_TIMESTAMP null
     );

     insert into board values (null, '제목1', '내용1', 'asdf', 0, 0, now());
     insert into board values (null, '제목2', '내용2', 'asdf', 0, 0, now());
     insert into board values (null, '제목3', '내용3', 'asdf', 0, 0, now());
     insert into board values (null, '제목4', '내용4', 'asdf', 0, 0, now());
     insert into board values (null, '제목5', '내용5', 'asdf', 0, 0, now());
     insert into board values (null, '제목6', '내용6', 'asdf', 0, 0, now());
     insert into board values (null, '제목7', '내용7', 'asdf', 0, 0, now());
     insert into board values (null, '제목8', '내용8', 'asdf', 0, 0, now());
     insert into board values (null, '제목9', '내용9', 'asdf', 0, 0, now());
     insert into board values (null, '제목10', '내용10', 'asdf', 0, 0, now());
     insert into board values (null, '제목11', '내용11', 'asdf', 0, 0, now());

     * 정리
     controller 패키지 > LoginController, RegisterController 있으면 되고
     dao 패키지 > UserDao, UserDaoImpl 있으면 되고
     domain 패키지 > UserDto, UserLoginDto 있으면 됨

 11. DB에 가짜 데이터들 몇개 넣어놓기

 12. 댓글 테이블 넣기
    create table comment (
         cno int auto_increment primary key ,
         bno int not null comment '게시물 번호',
         comment varchar(4000) not null ,
         commenter varchar(255) not null ,
         reg_date datetime default CURRENT_TIMESTAMP null
     );
 */

// 설정 다 끝나면 dao > Ex01_BoardDao 만들고 > interface화 시키기
public class Ex00_설정 {
}













