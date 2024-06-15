
function login_check() {
    let id = document.getElementById("id");
    let pw = document.getElementById("pw");

    let idError = document.getElementById("idError");
    let pwError = document.getElementById("pwError");


    idError.textContent = "";
    pwError.textContent = "";


    if (id.value == "") {
        idError.textContent = "아이디를 입력하세요.";
        id.focus();
        return false;
    }
    if (pw.value == "") {
        pwError.textContent = "비밀번호를 입력하세요.";
        pw.focus();
        return false;
    }
    return true; 
}

const checkboxes = document.querySelectorAll('.id_chk_box input[type="checkbox"]');
        for (let i = 0; i < checkboxes.length; i++) {
            checkboxes[i].addEventListener('change', function() {
                if (this.checked) {
                    for (let j = 0; j < checkboxes.length; j++) {
                        if (checkboxes[j] !== this) {
                            checkboxes[j].checked = false;
                        }
                    }
                }
            });
        }

// 닫기 ============================================