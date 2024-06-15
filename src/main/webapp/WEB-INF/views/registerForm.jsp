<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import = "java.net.URLDecoder"%> 

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<c:set var="logInOutLink" value="${ sessionScope.id==null ? '/login':'/logout' }" />
<c:set var="logInOutTxt" value="${ sessionScope.id==null ? 'login':'logout' }" />


<!-- WEB-INF > spring > appServlet > servlet-context.xml 에서 resoursec 관련 설정 변경해야함 -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/register.css">
    <script src="<c:url value='/js/register_chk.js'/>"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <title>회원가입 페이지</title>
</head>
<body>
<div class="form_box">
<c:if test="${not empty param.msg}">
    <div class="register_popup">

    </div>
    <div class="login_faile_alert login_alert">
        <div class="popup_box">
            <div class="pop_message">
                <div class="message_icon_cry"></div>
                <span>사용중인 아이디입니다.</span>
            </div>
            <!-- 주소 넣어주세요====================================== -->
            <a href="<c:url value='/register/join'/>">
                <div class="close_btn">
                    확인
                </div>
            </a>
        </div>
    </div>
</c:if>
    <form action="/register/save" method="POST" onsubmit="return register_check()">
        <div class="logo"></div>
        <span>아이디</span>
        <input type="text" id="id" name="id" placeholder="아이디를 입력하시오." class="register_bar">
        <div id="idError" class="error"></div>

        <span>비밀번호</span>
        <input type="password" id="pw" name="pw" placeholder="비밀번호를 입력하시오." class="register_bar" >
        <div id="pwError" class="error"></div>

        <span>비밀번호 확인</span>
        <input type="password" id="pw_chk" placeholder="비밀번호를 한번 더 입력하시오." class="register_bar" >
        <div id="pwChkError" class="error"></div>

        <span>이름</span>
        <input type="text" id="name" name="name" placeholder="이름을 입력하시오." class="register_bar">
        <div id="nameError" class="error"></div>

        <span>생년월일</span>
        <input type="text" id="birth" name="birth" placeholder="YYMMDD 형식으로 입력하시오." class="register_bar">
        <div id="birthError" class="error"></div>

        <span>성별</span>
        <div class="gender_box">
            <input type="radio" value="male" name="gender" class="gender_bar" id="gender1"> <label for="gender1">남자</label>
            <input type="radio" value="female" name="gender" class="gender_bar" id="gender2"> <label for="gender2">여자</label>
        </div>
        <div id="genderError" class="error"></div>

        <span>희망 지역</span>
        <select name="hopeLocal" id="addr">
            <option value="" disabled hidden selected>희망 지역을 선택하세요.</option>
            <!--여기에 js for문 들어갑니다================  -->
        </select>
        <div id="addrError" class="error"></div>

        <span>카테고리</span>
        <select name="FK_BC_cate" id="category">
            <%--여기 이름이랑 DTO 이름이랑 같아야되--%>
            <option value="" disabled hidden selected>희망 카테고리를 선택하세요.</option>
            <!--여기에 js for문 들어갑니다================  -->
        </select>
        <div id="categoryError" class="error"></div>

        <input type="submit" value="가입" class="submit_btn">
    </form>
</div>

<script>
    $.ajax({
        url: "/register/cate",
        type: "GET",
        success:function(result){
            // console.log(result);
// alert("성공")

            let categoryValue = document.getElementById("category")

// 8
            for(let i=0; i<8; i++){
                categoryValue.innerHTML += `<option value="${'${result[i].bc_name}'}">${'${result[i].bc_name}'}</option>`
            }
        },
        error:function(request, status, error){
            console.log(request.status);
            console.log(request.responseText);
            console.log(error);
            alert("실패")
        }
    })

    /*------------------ajax hopeLocal 영역 --------------------------*/

    $.ajax({
        url: "/register/local",
        dataType:"json",
        type: "GET",
        success:function(result) {
console.log(result);
// alert("성공")
console.log("hope : " + result)

            let addrValue = document.getElementById("addr")

            for (let i = 0; i < 10; i++) {
                addrValue.innerHTML += `<option value="${'${result[i].l_name}'}">${'${result[i].l_name}'}</option>`

            }
        },
        error: function (request, status, error){
            console.log(request.status);
            console.log(request.responseText);
            console.log(error);
            alert("실패")
        }
    })
</script>

</body>
</html>















