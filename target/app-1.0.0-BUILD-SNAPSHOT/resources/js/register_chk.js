/* 회원가입 유효성 검사 ==================================================== */
function register_check() {
    let id = document.getElementById("id");
    let pw = document.getElementById("pw");
    let pw_chk = document.getElementById("pw_chk");
    let name = document.getElementById("name");
    let birth = document.getElementById("birth");
    let gender = document.querySelector('input[name="gender"]:checked');
    let addr = document.querySelector('select[name="addr_select"]');
    let category = document.querySelector('select[name="category_select"]');

    let idError = document.getElementById("idError");
    let pwError = document.getElementById("pwError");
    let pwChkError = document.getElementById("pwChkError");
    let nameError = document.getElementById("nameError");
    let birthError = document.getElementById("birthError");
    let genderError = document.getElementById("genderError");
    let addrError = document.getElementById("addrError");
    let categoryError = document.getElementById("categoryError");

    idError.textContent = "";
    pwError.textContent = "";
    pwChkError.textContent = "";
    nameError.textContent = "";
    birthError.textContent = "";
    genderError.textContent = "";
    addrError.textContent = "";
    categoryError.textContent = "";

    if (id.value == "") {
        idError.textContent = "아이디를 입력하세요.";
        id.focus();
        return false;
    } else if (id.value.length < 8 || id.value.length > 16) {
        idError.textContent = "아이디는 8자리 이상 16자리 이하여야 합니다.";
        id.focus();
        return false;
    } else if (!/^[a-zA-Z0-9]+$/.test(id.value)) {
        idError.textContent = "영문자와 숫자만 사용 가능합니다.";
        id.focus();
        return false;
    }

    var pwdCheck = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,20}$/;

    if (pw.value == "") {
        pwError.textContent = "비밀번호를 입력하세요.";
        pw.focus();
        return false;
    } else if (!pwdCheck.test(pw.value)) {
        pwError.textContent = "비밀번호는 영문자+숫자+특수문자 조합으로 8~20자리 사용해야 합니다.";
        pw.focus();
        return false;
    }

    if (pw_chk.value !== pw.value) {
        pwChkError.textContent = "비밀번호가 일치하지 않습니다.";
        pw_chk.focus();
        return false;
    }

    if (name.value == "") {
        nameError.textContent = "이름을 입력하세요.";
        name.focus();
        return false;
    }

    var birthCheck = /^\d{2}\d{2}\d{2}$/;
    
    if (birth.value == "") {
        birthError.textContent = "생년월일을 입력하세요.";
        birth.focus();
        return false;
    } else if (!birthCheck.test(birth.value)) {
        birthError.textContent = "생년월일은 YYMMDD 형식으로 입력하세요.";
        birth.focus();
        return false;
    }

    if (!gender) {
        genderError.textContent = "성별을 선택하세요.";
        return false;
    }

    if (addr.value == "") {
        addrError.textContent = "희망 지역을 선택하세요.";
        addr.focus();
        return false;
    }

    if (category.value == "") {
        categoryError.textContent = "희망 카테고리를 선택하세요.";
        category.focus();
        return false;
    }

    return true;
}

/* 지역 for문 ==================================================== */
let addrValue = document.getElementById("addr")
    for(let i=0; i<25; i++){
        addrValue.innerHTML += `<option value="값">지역이름</option>`
    }

/*  카테고리 for문 ==================================================== */
let categoryValue = document.getElementById("category")

    for(let i=0; i<8; i++){
        categoryValue.innerHTML += `<option value="값">카테고리</option>`
    }