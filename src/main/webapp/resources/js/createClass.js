// 마이페이지 개설하기
let menu1 = document.getElementsByClassName("menu1")[0]
// 닫기 버튼
let create_close_btn = document.getElementsByClassName("create_close_btn")[0]

// 다음화면 넘어가기 버튼
let next_btn = document.getElementsByClassName("next_btn")[0]
// 클래스 만들기 창
let create_class = document.getElementsByClassName("create_class")[0]
// 화면 가려줄 창
let create_block_pan = document.getElementsByClassName("create_block_pan")[0]
// 왼쪽 폼 태그
let create_class_L = document.getElementsByClassName("create_class_L")[0]
// 오른쪽 폼 태그
let create_class_R = document.getElementsByClassName("create_class_R")[0]
// 마지막 form 화면에서 이전으로 돌아가는 버튼
let prev_btn = document.getElementsByClassName("prev_btn")[0]

// 개설하기 form
let create_class_btn = document.getElementsByClassName("create_class_btn")[0];
// 텍스트 에어리어
let class_info = document.getElementById("class_info");
// 입력항목 비면 못넘어가
let create_option = document.getElementsByClassName("create_option");
let alert_comment = document.getElementsByClassName("alert_comment")[0];

let bodyTag = document.getElementsByTagName("body")[0];

let addclub = document.getElementsByClassName("addclub")[0];

addclub.addEventListener("click", function (){
    create_block_pan.style.display="block"
})
window.addEventListener("resize",function(){
    let window_height = this.window.innerHeight
    create_block_pan.style.height=`${window_height}px`
})
window.addEventListener("onload",function(){
    let window_height = this.window.innerHeight
    create_block_pan.style.height=`${window_height}px`
}) 


// 이거 누르면 개설 화면 나와요
menu1.addEventListener("click", function(event){
    let w_first_height = window.innerHeight
    create_block_pan.style.display="block"
    create_block_pan.style.height=`${w_first_height}px`
    create_class.style.display="block"
})
// 이거 누르면 개설 화면 닫혀요
create_close_btn.addEventListener("click",function(){
    create_block_pan.style.display="none"
    create_class.style.display="none"
    alert_comment.style.display="none"
})

// 다 입력 안하면 못넘어가게 해주기
next_btn.addEventListener("click", function(event){
    let allFilled = true; 
    for(let i=0; i<create_option.length; i++){
        if(create_option[i].value.trim() == ""){
            allFilled = false; 
            break; 
        }
    }
    if (!allFilled) {
        alert_comment.style.display = "block";
    } else {
        create_class_L.style.left = "100%";
        create_class_R.style.left = "0%";
        alert_comment.style.display = "none";
    }
})

create_class_btn.addEventListener("click", function(event){
    if(class_info.value.trim() == ""){
        console.log(5564)
        event.preventDefault();
    }

})
prev_btn.addEventListener("click",function(){
    create_class_L.style.left="0%"
    create_class_R.style.left="100%"
})



// 회원가입 select 값들=====================================

let class_addr = document.getElementById("class_addr")
let class_big_cate = document.getElementById("class_big_cate")
let class_small_cate = document.getElementById("class_small_cate")
// let category_select = document.getElementById("category_select");

// for(let i=0; i<25; i++){
//     class_addr.innerHTML += `<option  value="${i}">지역${i}</option>`
// }
// 대분류
// for(let i=0; i<8; i++){
//     class_big_cate.innerHTML += `<option class="create_big_cate_opt" value="${i}">${i}</option>`
// }
// // 소분류
// for(let i=0; i<64 ; i++){
//     class_small_cate.innerHTML += `<option class="create_small_cate_opt" value="${i}">카테고리${i}</option>`
// }


    // 0일때 0~7
    // 1일때 8~15
    // 0일때 16~23
    // 0일때 24~31
    // 0일때 32~40


// 소분류 카테고리 종류
let create_small_cate_opt = document.getElementsByClassName("create_small_cate_opt");
//  대분류 골랐을 때 소분류 나오게 해주기
let mini_cate_none = document.getElementsByClassName("mini_cate_none")[0];

// select에서 다른 값을 골랐을 때
function option_none() {
    // 길이 문제 없음
    mini_cate_none.style.position="static"

    // 고른값의 값을 가져 온다 ex)1 2 3 4 5 6
    let select_value = document.getElementById("class_big_cate").value;


    // 값을 고를 떄 마다 64개의 모든 옵션에 none를 준다
/*    for(let i=0; i<64; i++){
        create_small_cate_opt[i].classList.add("create_cate_none")
    }*/
    
    // 내가 고른 값이 1이면 0~7
    // 내가 고른 값이 2이면 8~15
    for(let i=select_value*8; i<select_value+8; i++){
        create_small_cate_opt[i].classList.remove("create_cate_none")
    }
    
}



