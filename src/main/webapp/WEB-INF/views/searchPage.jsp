<%--
  Created by IntelliJ IDEA.
  User: 나상민
  Date: 2024-05-31
  Time: 오전 12:07
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
    <link rel="stylesheet" href="../css/searchPage.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script defer src="../js/searchPage.js"></script>
    <title>검색 페이지</title>
</head>
<body>
<header class="header">
    <div class="header_inner">
        <div class="header_content_box">
            <!-- 주소 넣어주세요========================== -->
            <a href="/" class="logo_center">
                <div class="logo"></div>
            </a>
            <div class="h_right_box">
                <a href="/myPage" class="icon_a">
                    <svg class="login_icon MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="AccountCircleOutlinedIcon" style="font-size: 1.75rem;"><path d="M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zM7.35 18.5C8.66 17.56 10.26 17 12 17s3.34.56 4.65 1.5c-1.31.94-2.91 1.5-4.65 1.5s-3.34-.56-4.65-1.5zm10.79-1.38C16.45 15.8 14.32 15 12 15s-4.45.8-6.14 2.12C4.7 15.73 4 13.95 4 12c0-4.42 3.58-8 8-8s8 3.58 8 8c0 1.95-.7 3.73-1.86 5.12z"></path><path d="M12 6c-1.93 0-3.5 1.57-3.5 3.5S10.07 13 12 13s3.5-1.57 3.5-3.5S13.93 6 12 6zm0 5c-.83 0-1.5-.67-1.5-1.5S11.17 8 12 8s1.5.67 1.5 1.5S12.83 11 12 11z"></path></svg>
                    <svg class="logout_icon MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-7wsri6" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="ExitToAppIcon"><path d="M10.09 15.59 11.5 17l5-5-5-5-1.41 1.41L12.67 11H3v2h9.67l-2.58 2.59zM19 3H5c-1.11 0-2 .9-2 2v4h2V5h14v14H5v-4H3v4c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"></path></svg>
                </a>
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
                <div class="pan_menu search_nav_btn">
                    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium jss97 css-vubbuv pan_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="SearchIcon">
                        <path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z">
                        </path>
                    </svg>
                    검색
                </div>
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
                        <input type="text" class="pan_search_bar" name="Keyword" value="${param.keyword}">
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
                            <!-- 스크립테에서 넣고 있어요 -->

                        </div>
                        <div class="option_bot_box">
                            <div class="search_btn_box">
                                <input type="reset" value="초기화" class="option_input slider_reset_btn">
                                <input type="submit" value="검색하기" class="option_input ">
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
    <div class="bot_nav">
    </div>
    <div class="content_box">
        <c:forEach var="searchList" items="${meetingList}">
            <a href="/ClassPage?M_seqno=${searchList.getM_seqno()}">
        <div class="search_content_outer">
            <div class="search_content_inner_box">
                <!-- 이미지 나오는곳 -->
                <div class="search_content_img_box">
                    <!-- 지역  -->
                    <div class="addr_box">
                        <span>${searchList.getM_local()}</span>
                    </div>
                    <!-- 하트버튼 유저가 로그인해야 토글이 먹는걸로.-->

                    <button class="like_box"   onclick="toggleHeart(this)">
                        <div class="M_seqno" style="display: none">${searchList.getM_seqno()}</div>
                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss94 css-1k33q06 heart_icon ${searchList.getH_writer()==null?"full_heart":"none_heart"}" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteRoundedIcon">
                            <path d="M13.35 20.13c-.76.69-1.93.69-2.69-.01l-.11-.1C5.3 15.27 1.87 12.16 2 8.28c.06-1.7.93-3.33 2.34-4.29 2.64-1.8 5.9-.96 7.66 1.1 1.76-2.06 5.02-2.91 7.66-1.1 1.41.96 2.28 2.59 2.34 4.29.14 3.88-3.3 6.99-8.55 11.76l-.1.09z"></path>
                        </svg>
                        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss95 css-1k33q06 heart_icon ${searchList.getH_writer()==null?"none_heart":"full_heart"}" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon">
                            <path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path>
                        </svg>
                    </button>
                    <img src="../img/remeet/${searchList.getM_titleImg()}" alt="" class="content_img">
                </div>
                <div class="search_content_text">
                    <div class="img_text_top">
                        <div class="img_cate_box">
                            <span class="img_cate_big">${searchList.getFK_BC_cate()}</span>
                            <span class="img_cate_small">${searchList.getFK_SC_cate()}</span>
                        </div>
                        <div class="img_review">
                            <div class="img_review_star">
                                <div class="star_img"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRoundedIcon" style="color: rgb(229, 152, 25); font-size: 20px;"><path d="m12 17.27 4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"></path></svg></div>
                                <span>${searchList.getM_starPoint()}점(${searchList.getM_starCount()})</span>
                            </div>
                            <div class="img_review_heart">
                                <div class="heart_img">
                                    <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon" style="color: rgb(242, 65, 71); font-size: 17px; opacity: 0.8;"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
                                </div>
                                <span>${searchList.getM_heart()}개</span>
                            </div>
                        </div>
                    </div>
                    <div class="img_text_bot">
                        <div class="img_text_title">
                        <span>
                                ${searchList.getM_name()}
                        </span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </a>
        </c:forEach>
    </div>

    <div class="page_btn_box">
        <c:if test="${ph.showPrevBtn}">
            <a href="<c:url value="/search?page=${ph.startPage - ph.navPage}&Keyword=${param.Keyword}&L_option=${param.L_option}&BC_option=${param.BC_option}&searchStar=${param.searchStar}&searchlastTime=${param.searchlastTime}&s_cate${param.s_cate}" />" class="prev_page_btn page_btn">&#10094;</a>
        </c:if>


        <c:forEach var="i" begin="${ph.startPage}" end="${ph.endPage}">
            <a href="<c:url value="/search?page=${i}&Keyword=${param.Keyword}&L_option=${param.L_option}&BC_option=${param.BC_option}&searchStar=${param.searchStar}&searchlastTime=${param.searchlastTime}&s_cate=${paramValues.s_cate[0]}&s_cate=${paramValues.s_cate[1]}&s_cate=${paramValues.s_cate[2]}&s_cate=${paramValues.s_cate[3]}&s_cate=${paramValues.s_cate[4]}"/>" class="page_num_box ${i==ph.page?"pageActive":""}"><div>${i}</div></a>
        </c:forEach>

        <c:if test="${ph.showNextbtn}">
            <a href="<c:url value="/search?page=${ph.startPage + ph.navPage}&Keyword=${param.Keyword}&L_option=${param.L_option}&BC_option=${param.BC_option}&searchStar=${param.searchStar}&searchlastTime=${param.searchlastTime}&s_cate${param.s_cate}" />" class="next_page_btn page_btn">&#10095;</a>
        </c:if>
    </div>

<%--    <div class="page_btn_box">--%>
<%--        <div class="prev_page_btn page_btn">&#10094;</div>--%>
<%--        <div class="page_num_box">--%>
<%--            <div>1</div>--%>
<%--            <div>2</div>--%>
<%--            <div>3</div>--%>
<%--            <div>4</div>--%>
<%--            <div>5</div>--%>
<%--        </div>--%>
<%--        <div class="next_page_btn page_btn">&#10095;</div>--%>
<%--    </div>--%>








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

    function toggleHeart(button) {
        var heartIcons = button.querySelectorAll('.heart_icon');
        heartIcons.forEach(function(icon) {

            if (<%= session.getAttribute("id")!=null %>){
                icon.classList.toggle('full_heart');
                icon.classList.toggle('none_heart');
                event.preventDefault();
            }
            else{
                event.preventDefault();
            }
        });
    }






    let addr_select = document.getElementById("addr_select");
    let category_select = document.getElementById("category_select");

    <c:forEach var="local" items="${localList3}">
    addr_select.innerHTML += `<option  value="${local.getL_name()}">${local.getL_name()}</option>`
    </c:forEach>

    <c:forEach var="b_cate" items="${bigCateList3}">
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

    <c:forEach var="s_cate" items="${smallCateList3}" varStatus="index">
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
        if (select_value == "${bigCateList3.get(0).getBC_name()}") {
            for (let i = 0; i < 5; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList3.get(1).getBC_name()}") {
            for (let i = 5; i < 10; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList3.get(2).getBC_name()}") {
            for (let i = 10; i < 15; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList3.get(3).getBC_name()}") {
            for (let i = 15; i < 20; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList3.get(4).getBC_name()}") {
            for (let i = 20; i < 25; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList3.get(5).getBC_name()}") {
            for (let i = 25; i < 30; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList3.get(6).getBC_name()}") {
            for (let i = 30; i < 35; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        } else if (select_value == "${bigCateList3.get(7).getBC_name()}") {
            for (let i = 35; i < 40; i++) {
                input_label_box[i].classList.remove("active_off")
            }
        }
    }


    $(document).ready(function () {
        $(document).on('click', '.bot_nav_menu', function () {
            $('.pan_search_bar').val($(this).find('span').text())


        })








        $(document).on('click', '.like_box', function () {
            let M_seqno =  $(this).parent().find('.M_seqno').text();
            $.ajax({
                type: 'PUT',       // 요청 메서드
                url: '/heart/modify/' + M_seqno,  // 요청 URI - Ex17_CommentController 의 맵핑 "/comments/{cno}"가 받음
                // dataType : 'json', // 전송받을 데이터의 타입
                success: function (body) {
                    alert(body)
                },
                error: function () {

                    alert("로그인 후 이용가능합니다.")
                }
            });
        })
    });



</script>

</body>
</html>
