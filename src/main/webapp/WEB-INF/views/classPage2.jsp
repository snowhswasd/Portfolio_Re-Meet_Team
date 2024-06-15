<%--
  Created by IntelliJ IDEA.
  User: 나상민
  Date: 2024-05-30
  Time: 오전 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="logInOutLink" value="${ sessionScope.id==null ? '/login':'/logout' }" />
<c:set var="logInOutTxt" value="${ sessionScope.id==null ? '로그인':'로그아웃' }" />
<c:set var="userId" value="${sessionScope.id==null?'':sessionScope.id}" />
<c:set var="inOut" value="${MMD_result==0?'가입하기':'탈퇴하기'}" />


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<c:url value='/css/common.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/classPage.css'/>">

    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css" />
    <script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>

    <script defer src="<c:url value='/js/common.js'/>"></script>
    <script defer src="<c:url value='/js/classPage2.js'/>"></script>

    <title>동아리 상세 페이지</title>
</head>
<body>
<header class="header">
    <div class="header_inner">
        <div class="header_content_box">
            <!-- 주소 넣어주세요========================== -->
            <a href="/">
                <div class="logo"></div>
            </a>
            <div class="search_bar">
                <div class="search_icon"></div>
            </div>
            <div class="h_right_box">
                <!-- 주소 넣어주세요========================== -->
                <a href="/myPage" class="icon_a">
                    <svg class="login_icon MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="AccountCircleOutlinedIcon" style="font-size: 1.75rem;"><path d="M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zM7.35 18.5C8.66 17.56 10.26 17 12 17s3.34.56 4.65 1.5c-1.31.94-2.91 1.5-4.65 1.5s-3.34-.56-4.65-1.5zm10.79-1.38C16.45 15.8 14.32 15 12 15s-4.45.8-6.14 2.12C4.7 15.73 4 13.95 4 12c0-4.42 3.58-8 8-8s8 3.58 8 8c0 1.95-.7 3.73-1.86 5.12z"></path><path d="M12 6c-1.93 0-3.5 1.57-3.5 3.5S10.07 13 12 13s3.5-1.57 3.5-3.5S13.93 6 12 6zm0 5c-.83 0-1.5-.67-1.5-1.5S11.17 8 12 8s1.5.67 1.5 1.5S12.83 11 12 11z"></path></svg>
                    <svg class="logout_icon MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-7wsri6" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="ExitToAppIcon"><path d="M10.09 15.59 11.5 17l5-5-5-5-1.41 1.41L12.67 11H3v2h9.67l-2.58 2.59zM19 3H5c-1.11 0-2 .9-2 2v4h2V5h14v14H5v-4H3v4c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"></path></svg>
                </a>
                <!-- 주소 넣어주세요========================== -->
                <a href="${logInOutLink}" class="icon_a">
                    <svg class="MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-7wsri6" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="ExitToAppIcon"><path d="M10.09 15.59 11.5 17l5-5-5-5-1.41 1.41L12.67 11H3v2h9.67l-2.58 2.59zM19 3H5c-1.11 0-2 .9-2 2v4h2V5h14v14H5v-4H3v4c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"></path></svg>
                </a>
                <span>${logInOutTxt}</span>
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
                    <div class="pan_menu search_nav_btn">
                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss97 css-vubbuv pan_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="SearchIcon">
                            <path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z">
                            </path>
                        </svg>
                        검색
                    </div>
                </a>
                <a href="/myPage">
                    <div class="pan_menu">
                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv pan_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="AccountCircleOutlinedIcon" style="font-size: 1.75rem;">
                            <path d="M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zM7.35 18.5C8.66 17.56 10.26 17 12 17s3.34.56 4.65 1.5c-1.31.94-2.91 1.5-4.65 1.5s-3.34-.56-4.65-1.5zm10.79-1.38C16.45 15.8 14.32 15 12 15s-4.45.8-6.14 2.12C4.7 15.73 4 13.95 4 12c0-4.42 3.58-8 8-8s8 3.58 8 8c0 1.95-.7 3.73-1.86 5.12z"></path><path d="M12 6c-1.93 0-3.5 1.57-3.5 3.5S10.07 13 12 13s3.5-1.57 3.5-3.5S13.93 6 12 6zm0 5c-.83 0-1.5-.67-1.5-1.5S11.17 8 12 8s1.5.67 1.5 1.5S12.83 11 12 11z"></path>
                        </svg>
                        프로필
                    </div>
                </a>
                <a href="${logInOutLink}">
                    <div class="pan_menu">
                        <svg class="MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-7wsri6 pan_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="ExitToAppIcon">
                            <path d="M10.09 15.59 11.5 17l5-5-5-5-1.41 1.41L12.67 11H3v2h9.67l-2.58 2.59zM19 3H5c-1.11 0-2 .9-2 2v4h2V5h14v14H5v-4H3v4c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z">
                            </path>
                        </svg>
                        ${logInOutTxt}
                    </div>
                </a>
            </div>
        </div>
        <div class="search_pan_box">
            <div class="search_pan_outer">
                <!-- 여기 폼태그 있어요=================================== -->
                <form action="/search" method="get" class="search_pan_form">
                    <div class="pan_search_box">
                        <svg class="MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-7wsri6 search_pan_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="SearchIcon"><path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z"></path></svg>
                        <!--인풋 태그 있어요============================== -->
                        <input type="text" class="pan_search_bar" name="Keyword">
                    </div>
                    <!-- 여기 name 어떻게 -->
                    <!--인풋 태그 있어요============================== -->
                    <div class="option_box">
                        <div class="option_top_box">
                            <div class="top_box_left">
                                <div class="option_bar option_bar_cate">
                                    <div class="text_box">지역</div>
                                    <select name="L_option" id="addr_select">
                                        <option value="" disabled hidden selected>지역 </option>
                                    </select>
                                </div>
                                <div class="option_bar option_bar_cate">
                                    <div class="text_box">관심사</div>
                                    <select name="BC_option" id="category_select" onchange="show_mini()">
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
                                    <input type="range" min="0" max="5" step="1" value="0" class="slider" id="myRange_star" name="searchStar">
                                </div>
                                <div class="option_bar">
                                    <div class="score_box">
                                        <div class="text_box">개설일</div>
                                        <span id="date_score" class=" score"></span>
                                    </div>
                                    <input type="range" min="0" max="365" step="1" value="0" class="slider" id="myRange_date" name="searchlastTime">
                                </div>
                            </div>
                        </div>
                        <div class="option_mid_box">

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
<main class="main">
    <div class="star_box_pos" id="star_box_pos">
        <h3>별점 주기</h3>
        <div class="star">
            ★★★★★
            <span>★★★★★</span>
            <input type="range" oninput="drawStar(this)" value="0" step="1" min="0" max="5" class="starPoint">
        </div>
        <button class="close_reivew_box">확인</button>
    </div>
    <div class="info_box_outer">
        <div class="class_info">
            <div class="class_info_top">
                <div class="class_img_box">
                    <div class="class_main_img" id="main_img">
                    </div>
                    <div class="swiper mySwiper">
                        <div class="swiper-wrapper">
                            <div class="swiper-slide">
                                <img src="../img/remeet/${imgList.get(0).getMDI_image()}" alt="">
                            </div>
                            <div class="swiper-slide">
                                <img src="../img/remeet/${imgList.get(1).getMDI_image()}" alt="">
                            </div>
                            <div class="swiper-slide">
                                <img src="../img/remeet/${imgList.get(2).getMDI_image()}" alt="">
                            </div>
                            <div class="swiper-slide">
                                <img src="../img/remeet/${imgList.get(3).getMDI_image()}" alt="">
                            </div>
                            <div class="swiper-slide">
                                <img src="../img/remeet/${imgList.get(4).getMDI_image()}" alt="">
                            </div>
                        </div>
                        <div class="swiper-pagination"></div>
                        <!-- If we need navigation buttons -->
                        <div class="swiper-button-prev"></div>
                        <div class="swiper-button-next"></div>
                    </div>
                </div>
            </div>
            <div class="class_info_title">
                <div class="class_info_box_outer width800_block">
                    <div class="class_info_box">
                        <div class="textarea_score">
                            <div class="input_title_box">
                                <span class="input_title">${detail.getM_name()}</span>
                            </div>
                            <div class="total_score">
                                <div class="total_box">
                                    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss346 css-vubbuv total_heart" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
                                    <span>${detail.getM_heart()}개 </span>
                                </div>
                                <div class="total_box">
                                    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss335 css-vubbuv total_star" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRateRoundedIcon"><path d="m14.43 10-1.47-4.84c-.29-.95-1.63-.95-1.91 0L9.57 10H5.12c-.97 0-1.37 1.25-.58 1.81l3.64 2.6-1.43 4.61c-.29.93.79 1.68 1.56 1.09l3.69-2.8 3.69 2.81c.77.59 1.85-.16 1.56-1.09l-1.43-4.61 3.64-2.6c.79-.57.39-1.81-.58-1.81h-4.45z"></path></svg>
                                    <span>${detail.getM_starPoint()}점(${detail.getM_starCount()})</span>
                                </div>
                            </div>
                        </div>
                        <div class="class_master">
                            <div class="master_name"> <span>동아리장: </span><span>${detail.getM_writer()}</span></div>
                        </div>
                        <div class="class_cate">
                            <div class="class_cate_big">${detail.getFK_BC_cate()}</div>
                            <div class="class_cate_small">${detail.getFK_SC_cate()}</div>
                        </div>
                        <textarea class="textarea_text textarea" rows="7" readonly>${meetingText.getMDT_content()}
                            </textarea>
                        <div class="review_score_box">
                            <div class="wish_list">
                                <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss256 css-vubbuv ${detail.getH_writer()==null?"none_heart":"full_heart"}" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon"><path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg>
                                <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss346 css-vubbuv ${detail.getH_writer()==null?"full_heart":"none_heart"}" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
                                <span>위시 리스트</span>
                            </div>
                            <div class="start_score_give">
                                <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss335 css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRateRoundedIcon"><path d="m14.43 10-1.47-4.84c-.29-.95-1.63-.95-1.91 0L9.57 10H5.12c-.97 0-1.37 1.25-.58 1.81l3.64 2.6-1.43 4.61c-.29.93.79 1.68 1.56 1.09l3.69-2.8 3.69 2.81c.77.59 1.85-.16 1.56-1.09l-1.43-4.61 3.64-2.6c.79-.57.39-1.81-.58-1.81h-4.45z"></path></svg>
                                <div class="star_score">별점주기</div>
                            </div>
                        </div>
                        <div class="register_btn">
                            ${inOut}
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="review">
            <h2>후기</h2>
            <div class="review_inner" >
                <input type="text" class="comment_text_box">
                <button class="submit_comment">등록</button>
            </div>
            <div class="all_comment_box">
                <div class="comment_box_outer">
                    <%-- 여기서 포이치 돌릴예정 --%>
<%--                    <div class="comment_box">--%>
<%--                        <div class="comment_box_inner">--%>
<%--                            <span class="review_comment_owner">김철수</span>--%>
<%--                            <span class="review_date">2024-02-19</span>--%>
<%--                        </div>--%>
<%--                    <div>--%>
<%--                    </div>--%>
<%--                        <span class="review_comment">클래스 별로에요 비추합니다 ㅜㅜ</span>--%>
<%--                        <div class="comment_controll_box">--%>
<%--                            <span class="update_btn">수정</span>--%>
<%--                            <span class="delete_btn">삭제</span>--%>
<%--                        </div>--%>
<%--                    </div>--%>
                </div>
                    <%--네비 삭제--%>
            </div>
        </div>
    </div>
    <div class="class_info_box_outer none">
        <div class="class_info_box">
            <div class="textarea_score">
                <div class="input_title_box">
                    <span class="input_title">${detail.getM_name()}</span>
                </div>
                <div class="total_score">
                    <div class="total_box">
                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss346 css-vubbuv total_heart" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
                        <span>${detail.getM_heart()}개 </span>
                    </div>
                    <div class="total_box">
                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss335 css-vubbuv total_star" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRateRoundedIcon"><path d="m14.43 10-1.47-4.84c-.29-.95-1.63-.95-1.91 0L9.57 10H5.12c-.97 0-1.37 1.25-.58 1.81l3.64 2.6-1.43 4.61c-.29.93.79 1.68 1.56 1.09l3.69-2.8 3.69 2.81c.77.59 1.85-.16 1.56-1.09l-1.43-4.61 3.64-2.6c.79-.57.39-1.81-.58-1.81h-4.45z"></path></svg>
                        <span>${detail.getM_starPoint()}점(${detail.getM_starCount()})</span>
                    </div>
                </div>
            </div>
            <div class="class_master">
                <div class="master_name"> <span>동아리장: </span><span>${detail.getM_writer()}</span></div>
            </div>
            <div class="class_cate">
                <div class="class_cate_big">${detail.getFK_BC_cate()}</div>
                <div class="class_cate_small">${detail.getFK_SC_cate()}</div>
            </div>
            <textarea class="textarea_text textarea" rows="8" readonly>${meetingText.getMDT_content()}
                </textarea>
            <div class="review_score_box">
                <div class="wish_list">
                    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss256 css-vubbuv ${detail.getH_writer()==null?"none_heart":"full_heart"}" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon"><path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg>
                    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss346 css-vubbuv ${detail.getH_writer()==null?"full_heart":"none_heart"} " focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
                    <span>위시 리스트</span>
                </div>
                <div class="start_score_give">
                    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss335 css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRateRoundedIcon"><path d="m14.43 10-1.47-4.84c-.29-.95-1.63-.95-1.91 0L9.57 10H5.12c-.97 0-1.37 1.25-.58 1.81l3.64 2.6-1.43 4.61c-.29.93.79 1.68 1.56 1.09l3.69-2.8 3.69 2.81c.77.59 1.85-.16 1.56-1.09l-1.43-4.61 3.64-2.6c.79-.57.39-1.81-.58-1.81h-4.45z"></path></svg>
                    <div class="star_score">별점주기</div>
                </div>
            </div>
            <div class="register_btn">
                ${inOut}
            </div>
        </div>




    </div>
</main>
<footer class="footer">
    <div class="footer_content">
        <div class="f_text_info_L">
            <h1>Re-meet</h1>
            <div class="f_logo">

            </div>
        </div>
        <div class="f_text_info_center">
            <div class="span_box_top">
                <span>회사소개</span>
                <span>이용약관</span>
                <span>개인정보처리방침</span>
                <span>자주 묻는 질문</span>
                <span>공지사항</span>
            </div>
            <div class="span_box_bot">
                <div class="span_pos_box">
                    <span>KH정보교육원</span>
                    <span>사업자번호: 000-00-00000</span>
                    <span>주소:  서울특별시 강남구 테헤란로14길</span>
                    <span>운영시간: 09:00 ~ 18:00</span>
                </div>
            </div>
        </div>
        <div class="sns_box">
            <div class="sns1 sns_img"></div>
            <div class="sns2 sns_img"></div>
            <div class="sns3 sns_img"></div>
        </div>
    </div>
</footer>

<script>

    let wish_list = document.getElementsByClassName("wish_list")
    let none_heart = document.getElementsByClassName("none_heart")
    let full_heart = document.getElementsByClassName("full_heart")
    let wish_count = 0;


    for(let i=0; i<2; i++){
        wish_list[i].addEventListener('click', function(){

            if (<%= session.getAttribute("id") !=null %>){
                for(let i=0; i<2; i++){
                    if( (wish_count%2) == 1){
                        none_heart[i].style.display="block"
                        full_heart[i].style.display="none"
                    }
                    else{
                        none_heart[i].style.display="none"
                        full_heart[i].style.display="block"
                    }
            }
            }
            wish_count++
        })
    }





    let addr_select = document.getElementById("addr_select");
    let category_select = document.getElementById("category_select");

    <c:forEach var="local" items="${localList2}">
    addr_select.innerHTML += `<option  value="${local.getL_name()}">${local.getL_name()}</option>`
    </c:forEach>


    <c:forEach var="b_cate" items="${bigCateList2}">
    category_select.innerHTML += `<option class="options" value="${b_cate.getBC_name()}">${b_cate.getBC_name()}</option>`
    </c:forEach>


    let star_slider = document.getElementById("myRange_star");
    let date_slider = document.getElementById("myRange_date");
    let output_star = document.getElementById("star_score");
    let output_date = document.getElementById("date_score");
    let reset_btn = document.getElementsByClassName("slider_reset_btn")[0]
    output_star.innerHTML = star_slider.value;
    output_date.innerHTML = date_slider.value;

    star_slider.oninput = function () {
        output_star.innerHTML = this.value;
    }

    date_slider.oninput = function () {
        output_date.innerHTML = this.value;
    }
    reset_btn.addEventListener("click", function () {
        let value = 0;
        output_star.innerHTML = value;
        output_date.innerHTML = value;
        // 소분류 초기화
        for (let i = 0; i < 40; i++) {
            input_label_box[i].classList.add("active_off")
        }
    })


    // 소분류 선택 ===========================================
    let mini_category = document.getElementsByClassName("option_mid_box")[0];
    let input_label_box = document.getElementsByClassName("input_label_box");

    <c:forEach var="s_cate" items="${smallCateList2}" varStatus="index">
    mini_category.innerHTML += `
    <div class="input_label_box type0 active_off">
        <input type="checkbox" id="category${index.count}" value="${s_cate.getSC_name()}" name="s_cate">
        <label for="category${index.count}">
            ${s_cate.getSC_name()}
        </label>
    </div>`
    </c:forEach>

    function show_mini() {
        let select_value = document.getElementById("category_select").value;
        let checkboxes = document.querySelectorAll('.input_label_box input[type="checkbox"]');
// 다른 소분류 선택시 기준 선택 했던거 해제 기능
        for (let i = 0; i < 40; i++) {
            checkboxes[i].checked = false;
        }
        for (let i = 0; i < 40; i++) {
            input_label_box[i].classList.add("active_off")
        }
        if (select_value == "${bigCateList2.get(0).getBC_name()}") {
            for (let i = 0; i < 5; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList2.get(1).getBC_name()}") {
            for (let i = 5; i < 10; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList2.get(2).getBC_name()}") {
            for (let i = 10; i < 15; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList2.get(3).getBC_name()}") {
            for (let i = 15; i < 20; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList2.get(4).getBC_name()}") {
            for (let i = 20; i < 25; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList2.get(5).getBC_name()}") {
            for (let i = 25; i < 30; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList2.get(6).getBC_name()}") {
            for (let i = 30; i < 35; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList2.get(7).getBC_name()}") {
            for (let i = 35; i < 40; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        }
    }


    $(document).ready(function () {
        let M_seqno = ${param.M_seqno};

        $(document).on('click', '.wish_list', function () {
            $.ajax({
                type: 'PUT',       // 요청 메서드
                url: '/heart/modify/' + M_seqno,  // 요청 URI - Ex17_CommentController 의 맵핑 "/comments/{cno}"가 받음
                // dataType : 'json', // 전송받을 데이터의 타입
                success: function (body) {
                    alert(body)
                },
                error: function () {

                    alert("로그인 후 이용가능합니다.")
                } // 에러가 발생했을 때, 호출될 함수
            });

        })

        $(document).on('click','.close_reivew_box',function(){
            let  M_seqno = ${param.M_seqno};
            let  S_point = $('.starPoint').val();
            console.log(M_seqno,S_point);
                $.ajax({
                    type:'PATCH',       // 요청 메서드
                    url: '/ClassPage/star/'+M_seqno+"?S_point="+S_point,
                    // headers : { "content-type": "application/json" },
                    // data : JSON.stringify({M_seqno:M_seqno, S_point:S_point}),

                    success : function(body){
                        alert(body);
                    },
                    error  : function(){
                        alert("가입한 모임이 아닙니다.") } // 에러가 발생했을 때, 호출될 함수
                });
        });


        $(document).on('click', '.register_btn', function () {
            $.ajax({
                type: 'PUT',       // 요청 메서드
                url: '/ClassPage/member/' + M_seqno,

                success: function (body) {
                    $('.register_btn').text(($('.register_btn').eq(0).text()== "탈퇴하기"?"가입하기" : "탈퇴하기"))
                    alert(body);
                },
                error: function () {
                    alert("로그인 후 이용가능합니다.")
                } // 에러가 발생했을 때, 호출될 함수
            });
        });

        // 제로 함수
        function zero(num) {
            if (num < 10) {
                return "0" + num;
            }
            return num;
        }

        /* 댓글 다 불러오기 */
        let showList = function () {

            $.ajax({
                url: '/comments?M_seqno=' + M_seqno,
                type: 'GET',
                // dataType: "json" // 아예 안쓰면 기본값 json 으로 적용됨.
                // data: JSON.stringify(??)

                success: function (result) {
                    let userId = "<%= session.getAttribute("id") %>";
                    let tmp = "";

                    result.forEach(function (rowResult) {


                        let dt = new Date(rowResult.c_reg_date
                        );
                        let year = dt.getFullYear();
                        let month = dt.getMonth() + 1;
                        let date = dt.getDate();
                        let hour = dt.getHours();
                        let min = dt.getMinutes();
                        let sec = dt.getSeconds();


                        tmp +=
                            `<div class="comment_box">
                                <div class="comment_box_inner">
                                    <span class="review_comment_owner">${'${rowResult.c_writer}'}</span>
                                    <span>${'${year}'}-${'${zero(month)}'}-${'${zero(date)}'} ${'${zero(hour)}'}:${'${zero(min)}'}:${'${zero(sec)}'}</span>
                                </div>
                            <div>
                            </div>
                        <span class="review_comment">${'${rowResult.c_text}'}</span>`

                        if (userId == rowResult.c_writer) {
                            tmp += `<div class="comment_controll_box" data-cno="${'${rowResult.c_seqno}'}">
                            <span class="update_btn">수정</span>
                            <span class="delete_btn">삭제</span>
                            </div>`
                        }
                        tmp += `</div>`
                    })

                    $('.comment_box_outer').html(tmp);

                },
                error: function () {
                    alert("실패")
                }
            });

        }
        showList();

        $(document).on('click','.submit_comment', function(){
            let C_text = $('.comment_text_box').val().trim();
            if(C_text=="") {
                alert("댓글을 입력해주세요");
                $('.comment_text_box').focus();
                return;
            }
            $.ajax({
                type:'POST',
                url:"/comments?M_seqno="+M_seqno,
                headers: {"content-type":"application/json"},
                data:JSON.stringify(C_text),
                // data: {"comment":comment},
                // dataType: 'json',
                success:function(body){
                    alert(body)
                    $('.comment_text_box').val(""); // 댓글 쓴 부분 빈칸으로 초기화 하기
                    showList();
                },
                error:function(){
                    alert("등록 실패 - 관리자에게 문의하세요")
                }
            });
        });

        $(document).on('click', '.delete_btn', function(){
            let cno = $(this).parent().attr("data-cno");
            console.log("/comments/"+cno+"?M_seqno="+M_seqno);
            $.ajax({
                type:"DELETE",
                url: "/comments/"+cno,
                success:function(body) {
                    alert(body)
                    showList()
                },
                error:function(){
                    alert("삭제 실패했습니다.")
                }
            });
        });

    });
</script>


</body>
</html>