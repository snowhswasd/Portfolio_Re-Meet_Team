let update_addr = document.getElementById("update_addr");
let update_cate = document.getElementById("update_cate");

// for(let i=0; i<25; i++){
//     update_addr.innerHTML += `<option  value="${i}">지역${i}</option>`
// }
// // 대분류
// for(let i=0; i<8; i++){
//     update_cate.innerHTML += `<option class="create_big_cate_opt" value="${i}">${i}</option>`
// }

let update_close_btn = document.getElementsByClassName("update_close_btn")[0]
let update_User_Info = document.getElementsByClassName("update_User_Info")[0];
let update_create_block_pan = document.getElementsByClassName("create_block_pan")[0];
let menu5 = document.getElementsByClassName("menu5")[0];



menu5.addEventListener('click', function(){
    let window_height = window.innerHeight
    update_User_Info.style.display="block";
    update_create_block_pan.style.display="block";
    update_create_block_pan.style.height=`${window_height}px`
})
let update_null = document.getElementsByClassName("update_null")[0];
update_close_btn.addEventListener('click', function(){
    update_User_Info.style.display="none";
    update_create_block_pan.style.display="none";
})


// 유효성검사 비밀번호 확인
let update_submit_btn = document.getElementsByClassName("update_submit_btn")[0]



update_submit_btn.addEventListener('click',function(event){
    
    let pw = document.getElementsByClassName("pw")[0];
    let pw_chk = document.getElementsByClassName("pw_chk")[0];

    let addr_chk = document.getElementsByClassName("update_opt")[3];
    let cate_chk = document.getElementsByClassName("update_opt")[4];



    if(pw.value == "" || pw_chk.value == "" || addr_chk.value == ""|| cate_chk.value ==""){
        update_null.style.display="block"
        update_null.textContent ="빈 항목이 있습니다"
        event.preventDefault()
    }
    if(pw.value.length < 7 && pw.value.length > 0){
        update_null.style.display="block"
        update_null.textContent ="비밀번호가 짧습니다."
        event.preventDefault()
    }
    if(pw.value.length > 17){
        update_null.style.display="block"
        update_null.textContent ="비밀번호가 깁니다."
        event.preventDefault()
    }
    if(pw.value !== pw_chk.value){
        update_null.style.display="block"
        update_null.textContent ="비밀번호가 다릅니다."
        event.preventDefault()
    }
})