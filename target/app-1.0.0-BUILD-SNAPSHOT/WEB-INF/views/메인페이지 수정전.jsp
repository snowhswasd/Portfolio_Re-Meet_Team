<%--
  Created by IntelliJ IDEA.
  User: 나상민
  Date: 2024-05-27
  Time: 오전 9:48
  To change this template use File | Settings | File Templates.
--%>
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
    <link rel="stylesheet" href="<c:url value='/css/common.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/mainPage.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/swiper.css'/>">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.css"/>

    <script defer src="<c:url value='/js/common.js'/>"></script>
    <script defer src="<c:url value='/js/swiper.js'/>"></script>
<%--    <script defer src="../js/common.js"></script>--%>
<%--    <script defer src="../js/swiper.js"></script>--%>

    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <title>Document</title>
</head>
<body>
<header class="header">
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
    <div class="hem_pan">
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
    <div class="search_pan_box">
        <div class="search_pan_outer">
            <!-- 여기 폼태그 있어요=================================== -->
            <%-- 네임 받아오는애들 검색페이지 만든거랑 맞춰서 설정          --%>
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
</header>
<main>
    <div class="swiper mySwiper">
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
        <div class="swiper-button-prev"></div>
        <div class="swiper-button-next"></div>

    </div>
    <div class="nav_outer">
        <div class="top_nav">
            <div class="top_nav_menu">
                <div class="top_nav_position">
                    <div class="top_nav_icon top_nav_icon1"></div>
                    <div class='top_nav_text'>
                        <p>추천 리밋</p>
                        <span>내가 좋아할만한 리밋</span>
                    </div>
                </div>
            </div>
            <div class="top_nav_menu">
                <div class="top_nav_position">
                    <div class="top_nav_icon top_nav_icon2"></div>
                    <div class='top_nav_text'>
                        <p>리밋 구역</p>
                        <span>리밋이 있는 지역</span>
                    </div>
                </div>
            </div>
            <div class="top_nav_menu">
                <div class="top_nav_position">
                    <div class="top_nav_icon top_nav_icon3"></div>
                    <div class='top_nav_text'>
                        <p>리밋 카테고리</p>
                        <span>다양한 리밋종류</span>
                    </div>
                </div>
            </div>
            <div class="top_nav_menu">
                <div class="top_nav_position">
                    <div class="top_nav_icon top_nav_icon4"></div>
                    <div class='top_nav_text'>
                        <p>리밋 메세지 보내기</p>
                        <span>같은 리밋원끼리 소통해요</span>
                    </div>
                </div>
            </div>
        </div>
        <div class="bot_nav">
            <div class="bot_nav_menu">
                축구야구농구
            </div>
            <div class="bot_nav_menu">
                축구야구농구
            </div>
            <div class="bot_nav_menu">
                축구야구농구
            </div>
            <div class="bot_nav_menu">
                축구야구농구
            </div>
            <div class="bot_nav_menu">
                축구야구농구
            </div>
            <div class="bot_nav_menu">
                축구야구농구
            </div>
            <div class="bot_nav_menu">
                축구야구농구
            </div>
            <div class="bot_nav_menu">
                축구야구농구
            </div>
        </div>
    </div>
    <div class="content_box" >
        <div class="content" style="display:'${sessionScope.id==null?"none":""}'">
            <h2 class="content_title">${userDto.getFK_BC_cate()} 좋아하는 ${userDto.getGender()}들의 리밋</h2>
            <div class="swiper mySwiper2">
                <div class="swiper-wrapper content_wrapper_1">

                </div>
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>
        <div class="content">
            <h2 class="content_title">가장 빛나는 리밋</h2>
            <div class="swiper mySwiper3">
                <div class="swiper-wrapper content_wrapper_2">

                </div>
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>
        <div class="content">
            <h2 class="content_title">가장 사랑받는 리밋</h2>
            <div class="swiper mySwiper2">
                <div class="swiper-wrapper content_wrapper_3">

                </div>
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>
        <div class="content">
            <h2 class="content_title">새로 태어난 리밋</h2>
            <div class="swiper mySwiper3">
                <div class="swiper-wrapper content_wrapper_4">

                </div>
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>
        <!-- 후기 컨텐츠--------------------- -->
        <div class="content">
            <h2 class="content_title" style="display:'${sessionScope.id==null?"none":""}'">${userDto.hopeLocal}에 있는 ${userDto.getFK_BC_cate()}하는 리밋들의 후기</h2>
            <div class="swiper mySwiper4">
                <div class="swiper-wrapper swiper-wrapper3">
                </div>
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
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


<script>

let review_content = document.getElementsByClassName("swiper-wrapper3")[0];
let content_wrapper_1 = document.getElementsByClassName("content_wrapper_1")[0];
let content_wrapper_2 = document.getElementsByClassName("content_wrapper_2")[0];
let content_wrapper_3 = document.getElementsByClassName("content_wrapper_3")[0];
let content_wrapper_4 = document.getElementsByClassName("content_wrapper_4")[0];

// 메인 부분 넣어주는거====================================================


<c:forEach var="cate" items="${cateMeeting}">
    content_wrapper_1.innerHTML += `
    <div class="swiper-slide">
    <div class="swiper_inner_box">
    <div class="swiper_img_box">
    <div class="addr_box">
    <span>
    ${cate.getM_local()}
    </span>

    </div>
    <button class="like_box">
    <div class="M_seqno" style="display: none">${cate.getM_seqno()}</div>
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss94 css-1k33q06 heart_icon active_none" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteRoundedIcon"><path d="M13.35 20.13c-.76.69-1.93.69-2.69-.01l-.11-.1C5.3 15.27 1.87 12.16 2 8.28c.06-1.7.93-3.33 2.34-4.29 2.64-1.8 5.9-.96 7.66 1.1 1.76-2.06 5.02-2.91 7.66-1.1 1.41.96 2.28 2.59 2.34 4.29.14 3.88-3.3 6.99-8.55 11.76l-.1.09z"></path></svg>
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss95 css-1k33q06 heart_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon"><path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg>
    </button>
    <img src="https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FR3ekMWTldwpieGgW_626a36fb2140cf7c76d9b1da_400x400?alt=media" alt="" class="content_img">
    </div>
    <div class="swiper_img_text">
    <div class="img_text_top">
    <div class="img_cate_box">
    <div class="img_cate_big">${cate.getFK_BC_cate()}</div>
    <div class="img_cate_small">${cate.getFK_SC_cate()}</div>
    </div>
    <div class="img_review">
    <div class="img_review_star">
    <div class="star_img"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRoundedIcon" style="color: rgb(229, 152, 25); font-size: 20px;"><path d="m12 17.27 4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"></path></svg></div>
    <span>${cate.getM_starPoint()}점(${cate.getM_starCount()})</span>
    </div>
    <div class="img_review_heart">
    <div class="heart_img">
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon" style="color: rgb(242, 65, 71); font-size: 17px; opacity: 0.8;"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
    </div>
    <span>${cate.getM_heart()}개</span>
    </div>
    </div>
    </div>
    <div class="img_text_bot">
    <div class="img_text_title">
    <span>
    ${cate.getM_name()}
    </span>
    </div>
    </div>
    </div>
    </div>
    </div>
    `
</c:forEach>

<c:forEach var="star" items="${starMeeting}">
    content_wrapper_2.innerHTML += `
    <div class="swiper-slide">
    <div class="swiper_inner_box">
    <div class="swiper_img_box">
    <div class="addr_box">
    <span>${star.getM_local()}</span>
    </div>
    <button class="like_box">
    <div class="M_seqno" style="display: none">${star.getM_seqno()}</div>
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss94 css-1k33q06 heart_icon active_none" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteRoundedIcon"><path d="M13.35 20.13c-.76.69-1.93.69-2.69-.01l-.11-.1C5.3 15.27 1.87 12.16 2 8.28c.06-1.7.93-3.33 2.34-4.29 2.64-1.8 5.9-.96 7.66 1.1 1.76-2.06 5.02-2.91 7.66-1.1 1.41.96 2.28 2.59 2.34 4.29.14 3.88-3.3 6.99-8.55 11.76l-.1.09z"></path></svg>
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss95 css-1k33q06 heart_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon"><path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg>
    </button>
    <img src="https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FR3ekMWTldwpieGgW_626a36fb2140cf7c76d9b1da_400x400?alt=media" alt="" class="content_img">
    </div>
    <div class="swiper_img_text">
    <div class="img_text_top">
    <div class="img_cate_box">
    <div class="img_cate_big">${star.getFK_BC_cate()}</div>
    <div class="img_cate_small">${star.getFK_SC_cate()}</div>
    </div>
    <div class="img_review">
    <div class="img_review_star">
    <div class="star_img"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRoundedIcon" style="color: rgb(229, 152, 25); font-size: 20px;"><path d="m12 17.27 4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"></path></svg></div>
    <span>${star.getM_starPoint()}점(${star.getM_starCount()})</span>
    </div>
    <div class="img_review_heart">
    <div class="heart_img">
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon" style="color: rgb(242, 65, 71); font-size: 17px; opacity: 0.8;"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
    </div>
    <span>${star.getM_heart()}개</span>
    </div>
    </div>
    </div>
    <div class="img_text_bot">
    <div class="img_text_title">
    <span>
    ${star.getM_name()}
    </span>
    </div>
    </div>
    </div>
    </div>
    </div>
    `
</c:forEach>

<c:forEach var="heart" items="${heartMeeting}">
    content_wrapper_3.innerHTML += `
    <div class="swiper-slide">
    <div class="swiper_inner_box">
    <div class="swiper_img_box">
    <div class="addr_box">
    <span>${heart.getM_local()}</span>
    </div>
    <button class="like_box">
    <div class="M_seqno" style="display: none">${heart.getM_seqno()}</div>
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss94 css-1k33q06 heart_icon active_none" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteRoundedIcon"><path d="M13.35 20.13c-.76.69-1.93.69-2.69-.01l-.11-.1C5.3 15.27 1.87 12.16 2 8.28c.06-1.7.93-3.33 2.34-4.29 2.64-1.8 5.9-.96 7.66 1.1 1.76-2.06 5.02-2.91 7.66-1.1 1.41.96 2.28 2.59 2.34 4.29.14 3.88-3.3 6.99-8.55 11.76l-.1.09z"></path></svg>
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss95 css-1k33q06 heart_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon"><path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg>
    </button>
    <img src="https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FR3ekMWTldwpieGgW_626a36fb2140cf7c76d9b1da_400x400?alt=media" alt="" class="content_img">
    </div>
    <div class="swiper_img_text">
    <div class="img_text_top">
    <div class="img_cate_box">
    <div class="img_cate_big">${heart.getFK_BC_cate()}</div>
    <div class="img_cate_small">${heart.getFK_SC_cate()}</div>
    </div>
    <div class="img_review">
    <div class="img_review_star">
    <div class="star_img"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRoundedIcon" style="color: rgb(229, 152, 25); font-size: 20px;"><path d="m12 17.27 4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"></path></svg></div>
    <span>${heart.getM_starPoint()}점(${heart.getM_starCount()})</span>
    </div>
    <div class="img_review_heart">
    <div class="heart_img">
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon" style="color: rgb(242, 65, 71); font-size: 17px; opacity: 0.8;"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
    </div>
    <span>${heart.getM_heart()}개</span>
    </div>
    </div>
    </div>
    <div class="img_text_bot">
    <div class="img_text_title">
    <span>
    ${heart.getM_name()}
    </span>
    </div>
    </div>
    </div>
    </div>
    </div>
    `
</c:forEach>

<c:forEach var="newMeeting" items="${newMeeting}">
    content_wrapper_4.innerHTML += `
    <div class="swiper-slide">
    <div class="swiper_inner_box">
    <div class="swiper_img_box">
    <div class="addr_box">

    <span>${newMeeting.getM_local()}</span>
    </div>
    <button class="like_box">
    <div class="M_seqno" style="display: none">${newMeeting.getM_seqno()}</div>
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss94 css-1k33q06 heart_icon active_none" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteRoundedIcon"><path d="M13.35 20.13c-.76.69-1.93.69-2.69-.01l-.11-.1C5.3 15.27 1.87 12.16 2 8.28c.06-1.7.93-3.33 2.34-4.29 2.64-1.8 5.9-.96 7.66 1.1 1.76-2.06 5.02-2.91 7.66-1.1 1.41.96 2.28 2.59 2.34 4.29.14 3.88-3.3 6.99-8.55 11.76l-.1.09z"></path></svg>
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss95 css-1k33q06 heart_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon"><path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg>
    </button>
    <img src="https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FR3ekMWTldwpieGgW_626a36fb2140cf7c76d9b1da_400x400?alt=media" alt="" class="content_img">
    </div>
    <div class="swiper_img_text">
    <div class="img_text_top">
    <div class="img_cate_box">
    <div class="img_cate_big">${newMeeting.getFK_BC_cate()}</div>
    <div class="img_cate_small">${newMeeting.getFK_SC_cate()}</div>
    </div>
    <div class="img_review">
    <div class="img_review_star">
    <div class="star_img"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRoundedIcon" style="color: rgb(229, 152, 25); font-size: 20px;"><path d="m12 17.27 4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"></path></svg></div>
    <span>${newMeeting.getM_starPoint()}점(${newMeeting.getM_starCount()})</span>
    </div>
    <div class="img_review_heart">
    <div class="heart_img">
    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon" style="color: rgb(242, 65, 71); font-size: 17px; opacity: 0.8;"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
    </div>
    <span>${newMeeting.getM_heart()}개</span>
    </div>
    </div>
    </div>
    <div class="img_text_bot">
    <div class="img_text_title">
    <span>
    ${newMeeting.getM_name()}
    </span>
    </div>
    </div>
    </div>
    </div>
    </div>
    `
</c:forEach>

<%--
        이게 맵안에 든거임
        map2.put("imgList",ggg);   img는 나중에 연결 시켜주자 다들
        map2.put("textList",hhh);
        map2.put("meeting",nnn);
 --%>

// 후기부분 넣어주는거============================

<c:forEach var="meeting" items="${reviewMap.meeting}" varStatus="index">
    review_content.innerHTML +=`
    <div class="swiper-slide">
    <a href="#">
    <div class="M_seqno" style="display: none">${meeting.getM_seqno()}</div>
    <div class="swiper_inner_box review_content_box">
    <div class="swiper_img_box review_box">
    <img src="https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FR3ekMWTldwpieGgW_626a36fb2140cf7c76d9b1da_400x400?alt=media" alt="" class="content_img">
    </div>
    <div class="swiper_img_text review_text_box">
    <span class="review_text_title">  ${meeting.getM_name()}</span>
    <span class="review_text_content">
    값이 없어서 안찍혀요 ....ㅠㅠ
    ${reviewMap.textList.get(index.count -1)}
    </span>
    </div>
    </div>
    </a>
    </div>`
</c:forEach>


    </script>

<script defer >
    $(document).ready(function (){

        $(document).on('click','.heart_icon',function() {
            let M_seqno = $(this).parent().find('.M_seqno').text();
            console.log(M_seqno);

            $.ajax({
                type:'GET',       // 요청 메서드
                url: '/heart/'+M_seqno,  // 요청 URI - Ex17_CommentController 의 맵핑 "/comments/{cno}"가 받음
                // dataType : 'json', // 전송받을 데이터의 타입
                success : function(body){
                    alert(body)
                },
                error  : function(request, status){
                    console.log(request);
                    console.log(status)

                    alert("로그인후 이용해주세요") } // 에러가 발생했을 때, 호출될 함수
            });
        });
    })


</script>
    </body>
    </html>
