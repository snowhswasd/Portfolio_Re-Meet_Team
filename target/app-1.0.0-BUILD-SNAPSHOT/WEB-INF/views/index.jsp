<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="logInOutLink" value="${ sessionScope.id==null ? '/login':'/logout' }" />
<c:set var="logInOutTxt" value="${ sessionScope.id==null ? 'login':'logout' }" />
<c:set var="userId" value="${sessionScope.id==null?'':sessionScope.id}" />

<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="stylesheet" href="../css/common.css">
   <link rel="stylesheet" href="../css/mainPage.css">
   <link rel="stylesheet" href="../css/swiper.css">
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.css"/>
   <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
   <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
   <title>메인페이지</title>
</head>
<body>
<header class="header">
   <div class="header_inner">
      <div class="header_content_box">
         <!-- 주소 넣어주세요========================== -->
         <a href="#">
            <div class="logo"></div>
         </a>
         <div class="search_bar">
            <div class="search_icon"></div>
         </div>
         <div class="h_right_box">
            <div class="addclub">동아리 만들기</div>
            <!-- 주소 넣어주세요========================== -->
            <a href="#" class="icon_a">
               <svg class="MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-7wsri6" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="SentimentSatisfiedRoundedIcon" ><circle cx="15.5" cy="9.5" r="1.5"></circle><circle cx="8.5" cy="9.5" r="1.5"></circle><path d="M11.99 2C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8zm4.41-6.11c-.35-.22-.82-.11-1.03.24-.74 1.17-2 1.87-3.38 1.87s-2.64-.7-3.38-1.88c-.22-.35-.68-.46-1.03-.24-.35.22-.46.68-.24 1.03C8.37 16.54 10.1 17.5 12 17.5s3.63-.97 4.65-2.58c.22-.35.11-.81-.24-1.03z"></path></svg>
            </a>
            <!-- 주소 넣어주세요========================== -->
            <a href="#" class="icon_a">
               <svg class="MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-7wsri6" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="ExitToAppIcon"><path d="M10.09 15.59 11.5 17l5-5-5-5-1.41 1.41L12.67 11H3v2h9.67l-2.58 2.59zM19 3H5c-1.11 0-2 .9-2 2v4h2V5h14v14H5v-4H3v4c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"></path></svg>
            </a>
         </div>
         <div class="Responsive_hem">
            <div class="line line_top"></div>
            <div class="line line_mid"></div>
            <div class="line line_bot"></div>
         </div>
      </div>
      <!-- 주소 넣어주세요========================== -->
      <div class="blockpan">

      </div>
      <div class="hem_pan">
         <div class="hem_nav_pan">
            <a href="#">
               <div class="pan_menu">
                  <div>
                     <svg class="MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-7wsri6 pan_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="HomeOutlinedIcon"><path d="m12 5.69 5 4.5V18h-2v-6H9v6H7v-7.81l5-4.5M12 3 2 12h3v8h6v-6h2v6h6v-8h3L12 3z"></path>
                     </svg>
                  </div>
                  홈
               </div>
            </a>
            <a href="#">
               <div class="pan_menu">
                  <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss97 css-vubbuv pan_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="SearchIcon">
                     <path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z">
                     </path>
                  </svg>
                  검색
               </div>
            </a>
            <a href="#">
               <div class="pan_menu">
                  <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv pan_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="AccountCircleOutlinedIcon" style="font-size: 1.75rem;">
                     <path d="M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zM7.35 18.5C8.66 17.56 10.26 17 12 17s3.34.56 4.65 1.5c-1.31.94-2.91 1.5-4.65 1.5s-3.34-.56-4.65-1.5zm10.79-1.38C16.45 15.8 14.32 15 12 15s-4.45.8-6.14 2.12C4.7 15.73 4 13.95 4 12c0-4.42 3.58-8 8-8s8 3.58 8 8c0 1.95-.7 3.73-1.86 5.12z"></path><path d="M12 6c-1.93 0-3.5 1.57-3.5 3.5S10.07 13 12 13s3.5-1.57 3.5-3.5S13.93 6 12 6zm0 5c-.83 0-1.5-.67-1.5-1.5S11.17 8 12 8s1.5.67 1.5 1.5S12.83 11 12 11z"></path>
                  </svg>
                  프로필
               </div>
            </a>
            <a href="#">
               <div class="pan_menu">
                  <svg class="MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-7wsri6 pan_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="ExitToAppIcon">
                     <path d="M10.09 15.59 11.5 17l5-5-5-5-1.41 1.41L12.67 11H3v2h9.67l-2.58 2.59zM19 3H5c-1.11 0-2 .9-2 2v4h2V5h14v14H5v-4H3v4c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z">
                     </path>
                  </svg>
                  로그아웃
               </div>
            </a>
         </div>
      </div>
      <div class="search_pan_box">
         <div class="search_pan_outer">
            <!-- 여기 폼태그 있어요=================================== -->
            <form action="" method="post" class="search_pan_form">
               <div class="pan_search_box">
                  <svg class="MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-7wsri6 search_pan_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="SearchIcon"><path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z"></path></svg>
                  <!--인풋 태그 있어요============================== -->
                  <input type="text" class="pan_search_bar">
               </div>
               <!-- 여기 name 어떻게 -->
               <!--인풋 태그 있어요============================== -->
               <div class="option_box">
                  <div class="option_top_box">
                     <div class="top_box_left">
                        <div class="option_bar">
                           <div class="text_box">지역</div>
                           <select name="addr" id="addr_select">
                              <option value="" disabled hidden selected>지역 </option>
                           </select>
                        </div>
                        <div class="option_bar">
                           <div class="text_box">관심사</div>
                           <select name="category" id="category_select" onchange="show_mini()">
                              <option value="" disabled hidden selected>관심사</option>

                           </select>
                        </div>
                     </div>
                     <div class="top_box_right" id="top_box_right">
                        <div class="option_bar">
                           <div class="score_box">
                              <div class="text_box">평점</div>
                              <span id="star_score" class=" score"></span>
                           </div>
                           <input type="range" min="0" max="5" step="1" value="0" class="slider" id="myRange_star">
                        </div>
                        <div class="option_bar">
                           <div class="score_box">
                              <div class="text_box">개설일</div>
                              <span id="date_score" class=" score"></span>
                           </div>
                           <input type="range" min="0" max="365" step="1" value="0" class="slider" id="myRange_date">
                        </div>
                     </div>
                  </div>
                  <div class="option_mid_box">
                     <!-- 스크립테에서 넣고 있어요 -->

                  </div>
                  <div class="option_bot_box">
                     <div class="search_btn_box">
                        <input type="reset" value="초기화" class="option_input slider_reset_btn">
                        <input type="submit" value="검색하기" class="option_input">
                     </div>
                     <div class="close_btn_box">
                        <div class="search_pan_close_btn">
                           닫기
                        </div>
                     </div>
                  </div>
               </div>
            </form>
         </div>
      </div>
   </div>
</header>
<main>
   <div class="swiper mySwiper banner">
      <div class="swiper-wrapper">
         <div class="swiper-slide banner_back">
            <img src="https://mochaclass.com/static/media/group_banner_web.fabc9134.jpg" alt="" class="banner_img">
         </div>
         <div class="swiper-slide banner_back">
            <img src="https://mochaclass.com/static/media/group_banner_web.fabc9134.jpg" alt="" class="banner_img">
         </div>
         <div class="swiper-slide banner_back">
            <img src="https://mochaclass.com/static/media/group_banner_web.fabc9134.jpg" alt="" class="banner_img">
         </div>
         <div class="swiper-slide banner_back">
            <img src="https://mochaclass.com/static/media/group_banner_web.fabc9134.jpg" alt="" class="banner_img">
         </div>
      </div>
      <div class="swiper-pagination"></div>


      <!-- If we need navigation buttons -->
      <div class="swiper-button-prev banner_L banner_btn"></div>
      <div class="swiper-button-next banner_R banner_btn"></div>

   </div>
   <div class="nav_outer">
      <div class="top_nav">
         <div class="top_nav_menu">
            <div class="top_nav_icon top_nav_icon1">

            </div>
            <div class='top_nav_text'>
               <h1>주변 리밋</h1>
               <span>주변에 있는 모임</span>
            </div>
         </div>
         <div class="top_nav_menu">
            <div class="top_nav_icon top_nav_icon2">

            </div>
            <div class='top_nav_text'>
               <h1>지역</h1>
               <span>지역별 모임</span>
            </div>
         </div>
         <div class="top_nav_menu">
            <div class="top_nav_icon top_nav_icon3">

            </div>
            <div class='top_nav_text'>
               <h1>카테고리</h1>
               <span>모임 카테고리</span>
            </div>
         </div>
         <div class="top_nav_menu">
            <div class="top_nav_icon top_nav_icon4">

            </div>
            <div class='top_nav_text'>
               <h1>문의사항</h1>
               <span>궁금한점 문의하기</span>
            </div>
         </div>
      </div>
      <div class="bot_nav">
         <!-- <div class="bot_nav_menu">
             <div class="bot_nav_icon bot_nav_icon_1"> </div>
             <span>축구</span>
         </div>
         <div class="bot_nav_menu">
             <div class="bot_nav_icon bot_nav_icon_2"> </div>
             <span>베이킹</span>
         </div>
         <div class="bot_nav_menu">
             <div class="bot_nav_icon bot_nav_icon_3"> </div>
             <span>그림 그리기</span>
         </div>
         <div class="bot_nav_menu">
             <div class="bot_nav_icon bot_nav_icon_4"> </div>
             <span>농구</span>
         </div>
         <div class="bot_nav_menu">
             <div class="bot_nav_icon bot_nav_icon_5"> </div>
             <span>베이커리</span>
         </div>
         <div class="bot_nav_menu">
             <div class="bot_nav_icon bot_nav_icon_6"> </div>
             <span>마술</span>
         </div>
         <div class="bot_nav_menu">
             <div class="bot_nav_icon bot_nav_icon_7"> </div>
             <span>보드게임</span>
         </div>
         <div class="bot_nav_menu">
             <div class="bot_nav_icon bot_nav_icon_8"> </div>
             <span>반려동물</span>
         </div> -->
      </div>
   </div>
   <div class="content_box">
      <div class="content">
         <div class="content_title_box">
            <h2 class="content_title">이름 넣어주세요</h2>
            <div class="rabbit_icon rabbit_1"></div>
         </div>
         <div class="swiper mySwiper2 swiper_btn_pos">
            <div class="swiper-wrapper content_wrapper_1">

            </div>
         </div>
         <div class="swiper_btn_pos_box">
            <div class="swiper-button-prev custom custom1_L"></div>
            <div class="swiper-button-next custom custom1_R"></div>
         </div>
      </div>
      <div class="content">
         <div class="content_title_box">
            <h2 class="content_title">이름 넣어주세요</h2>
            <div class="rabbit_icon rabbit_2"></div>
         </div>
         <div class="swiper mySwiper3 swiper_btn_pos">
            <div class="swiper-wrapper content_wrapper_2">

            </div>
         </div>
         <div class="swiper_btn_pos_box">
            <div class="swiper-button-prev custom custom2_L"></div>
            <div class="swiper-button-next custom custom2_R"></div>
         </div>
      </div>
      <div class="content">
         <div class="content_title_box">
            <h2 class="content_title">이름 넣어주세요</h2>
            <div class="rabbit_icon rabbit_3"></div>
         </div>
         <div class="swiper mySwiper4 swiper_btn_pos">
            <div class="swiper-wrapper content_wrapper_3">

            </div>
         </div>
         <div class="swiper_btn_pos_box">
            <div class="swiper-button-prev custom custom3_L"></div>
            <div class="swiper-button-next custom custom3_R"></div>
         </div>
      </div>
      <div class="content">
         <div class="content_title_box">
            <h2 class="content_title">이름 넣어주세요</h2>
            <div class="rabbit_icon rabbit_4"></div>
         </div>
         <div class="swiper mySwiper5 swiper_btn_pos">
            <div class="swiper-wrapper content_wrapper_4">

            </div>
         </div>
         <div class="swiper_btn_pos_box">
            <div class="swiper-button-prev custom custom4_L"></div>
            <div class="swiper-button-next custom custom4_R"></div>
         </div>
      </div>
      <!-- 후기 컨텐츠--------------------- -->
      <div class="content">
         <h2 class="content_title">후기</h2>
         <div class="swiper mySwiper6">
            <div class="swiper-wrapper swiper-wrapper3">

            </div>
         </div>
      </div>
   </div>

</main>

<footer class="footer">
   <div class="footer_content">
      <div class="footer_top">
         <h3>© Redikins | Mocha Class</h3>
         <ul class="foot_top_ul">
            <li><img src="../img/facebook.png" alt=""></li>
            <li><img src="../img/instagram.png" alt=""></li>
            <li><img src="../img/youtube.png" alt=""></li>
         </ul>
      </div>
      <div class="footer_bot">
         <ul class="foot_bot_ul">
            <li>이용약관</li>
            <li>개인정보처리방침</li>
            <li>문의</li>
         </ul>
      </div>
   </div>
</footer>

<script src="../js/common.js"></script>
<script src="../js/swiper.js"></script>
</body>
</html>