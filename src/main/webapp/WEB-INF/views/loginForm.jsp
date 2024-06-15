<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="java.net.URLDecoder" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="logInOutLink" value="${ sessionScope.id==null ? '/login':'/logout' }" />
<c:set var="logInOutTxt" value="${ sessionScope.id==null ? 'login':'logout' }" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/login.css">
    <script defer src="<c:url value='/js/login_chk.js'/>"></script>

    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <title>로그인페이지</title>
</head>

<body>

<c:if test="${not empty param.msg1}">
<div class="popup" style="display: block">
    <div class="login_succes_alert login_alert">
        <div class="popup_box">
            <div class="pop_message">
                <div class="message_icon_cry"></div>
                <span>${param.msg1}</span>
            </div>

            <!-- 주소 넣어주세요====================================== -->
            <a href="<c:url value='/login'/>">
                <div class="close_btn">
                    확인
                </div>
            </a>
        </div>
    </div>
</div>
</c:if>








<%--    <div class="login_succes_alert login_alert">--%>
<%--        <div class="popup_box">--%>
<%--            <div class="pop_message">--%>
<%--                <div class="message_icon_smile"></div>--%>
<%--                <span>${param.msg}</span>--%>
<%--            </div>--%>

<%--            <!-- 주소 넣어주세요====================================== -->--%>
<%--            <a href="<c:url value='/'/>">--%>
<%--                <div class="close_btn">--%>
<%--                    확인--%>
<%--                </div>--%>
<%--            </a>--%>
<%--        </div>--%>
<%--    </div>--%>





<%--    <div class="login_faile_alert login_alert" >--%>
<%--        <div class="popup_box">--%>
<%--            <div class="pop_message">--%>
<%--                <div class="message_icon_cry"></div>--%>
<%--                <span>${param.msg}</span>--%>
<%--            </div>--%>

<%--            <!-- 주소 넣어주세요====================================== -->--%>
<%--            <a href="<c:url value='login'/>">--%>
<%--                <div class="close_btn">--%>
<%--                    확인--%>
<%--                </div>--%>
<%--            </a>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<form action="" method="POST" onsubmit="return login_check()">
    <div class="logo"><a href="/"> </a> </div>
    <span>아이디</span>
    <input type="text" id="id" name="id" placeholder="아이디를 입력하시오." value="${ cookie.id.value }">
    <div id="idError" class="error"></div>

    <span>비밀번호</span>
    <input type="password" id="pw" name="pw" placeholder="비밀번호를 입력하시오." >
    <div id="pwError" class="error"></div>

    <div class="id_chk_box">
        <div class="id_remember">
            <input type="checkbox" id="id_remember_btn" name="rememberID" ${empty cookie.id.value?"":"checked" }>
            <label for="id_remember_btn">아이디 저장</label>
        </div>
        <div class="auto_login">
            <input type="checkbox" id="auto_login_btn" name="storeID">
            <label for="auto_login_btn">자동 로그인</label>
        </div>
    </div>
    <input type="submit" value="로그인" class="submit_btn">

    <div class="register_box">

        <!-- 주소 넣어주세요====================================== -->
        <span>로그인 아이디가 없으신가요? </span>
        <a href="/register/join">
            <span class="register_btn">회원가입</span>
        </a>
    </div>

</form>
<script>
    if ( ${not empty URLDecoder.decode(param.msg)}){
        alert(${URLDecoder.decode(param.msg)})
    };

</script>
</body>
</html>