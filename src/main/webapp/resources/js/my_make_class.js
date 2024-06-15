// 배열 스와이퍼 하트토글 me_register.js에 있는거 같이 씁니다.


let my_make_swiper = document.getElementsByClassName("my_make_class_content")[0];
for (let i = 0; i < 9; i++) {
    my_make_swiper.innerHTML += `
    
    `
}


// 창닫기
let m_make_close_btn = document.getElementsByClassName("close_btn")[1];
let menu3 = document.getElementsByClassName("menu3")[0];
let my_make_class_controll = document.getElementsByClassName("my_make_class_controll")[0];



m_make_close_btn.addEventListener("click", function(){
    my_make_class_controll.style.display="none";
    create_block_pan.style.display="none"
})


// 갯수 찍어주기 위한거

let my_make_class_num = document.getElementsByClassName("my_make_class_num")[0];
let my_make_swiper_count = document.getElementsByClassName("my_make_swiper_count")

menu3.addEventListener("click", function(){
    let w_first_height = window.innerHeight
    let w_width = window.innerWidth

    // 가입 몇개인지 찍어 주는거
    my_make_class_num.textContent = my_make_swiper_count.length    

    my_make_class_controll.style.display="block";
    create_block_pan.style.display="block"
    create_block_pan.style.height=`${w_first_height}px`

    if(w_width <= 1200){
        my_make_class_controll.style.width=`${w_width - 60}px`
    }
    if(w_width <=480){
        my_make_class_controll.style.width=`${w_width}px`
    }

})
