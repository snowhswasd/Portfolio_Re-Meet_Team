var swiper = new Swiper(".mySwiper", {
    effect: 'slide',
    slidesPerView: 3, // 한번에 보여줄 칸수
    spaceBetween: 20, // 칸 사이사이마다의 여백
    slidesPerGroup: 1, // 한번에 몇개씩 빠져 나가게
    observer: true,
    observeParents: true,
    speed: 1000, // 들어올때까지 걸리는 시간
    breakpoints: {
        0: {
            slidesPerView: 1,  //브라우저가 768보다 클 때
            spaceBetween: 10,
        },
        750: {
            slidesPerView: 2,  //브라우저가 768보다 클 때
            spaceBetween: 10,
        },
        1200: {
            slidesPerView: 3,  //브라우저가 1024보다 클 때
            spaceBetween: 20,
        },
    }



});
let mypage_swiper = document.getElementsByClassName("register_class_controll_content")[0];
// 값 넣어주기
let arr=[
    "https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2Fl1sXrlkQn0IJGTte_6178f2d8a6f0394e051b45f2_400x400?alt=media",
    "https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FKjDqt2l0i3H77Skw_5f5097bb65c28a0d18e73545_400x400?alt=media",
    "https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FUlEDgqptA6HwRYKT_63e4b1d78f78f60388f31af9_400x400?alt=media",
    "https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FaohrPfBzQirBezcl_6316ce224d6bc723eb27ecc4_400x400?alt=media"]



// 여기에 원래 있었어 백팁 안에
for (let i = 0; i < 9; i++) {
    mypage_swiper.innerHTML += ``
}



// function toggleHeart(button) {
//     var heartIcons = button.querySelectorAll('.heart_icon');
//
//     heartIcons.forEach(function(icon) {
//         icon.classList.toggle('full_heart');
//         icon.classList.toggle('none_heart');
//     });
// }


// 창닫기
let regi_close_btn = document.getElementsByClassName("close_btn")[0];
let menu2 = document.getElementsByClassName("menu2")[0];
let register_class_controll = document.getElementsByClassName("register_class_controll")[0];



regi_close_btn.addEventListener("click", function(){
    register_class_controll.style.display="none";
    create_block_pan.style.display="none"

    
})

// 갯수 찍어주기 위한거
let my_register_swiper = document.getElementsByClassName("my_register_swiper");
let register_class_num = document.getElementsByClassName("register_class_num")[0];


// 메뉴 클릭했을 때
menu2.addEventListener("click", function(){
    
    // 가입 몇개인지 찍어 주는거
    register_class_num.textContent = my_register_swiper.length

    let w_first_height = window.innerHeight
    let w_width = window.innerWidth

    register_class_controll.style.display="block";
    create_block_pan.style.display="block"
    create_block_pan.style.height=`${w_first_height}px`    
    if(w_width <= 1200){
        register_class_controll.style.width=`${w_width - 60}px`
    }
    if(w_width <=480){
        register_class_controll.style.width=`${w_width}px`
    }

})


window.addEventListener("resize", function(){
    let w_width = this.window.innerWidth
    if(w_width <= 1200){
        register_class_controll.style.width=`${w_width - 60}px`
        my_make_class_controll.style.width=`${w_width - 60}px`
    }
    if(w_width <=480){
        register_class_controll.style.width=`${w_width -10}px`
        my_make_class_controll.style.width=`${w_width - 10}px`
    }
    if(w_width > 1200){
        register_class_controll.style.width="1000px"
        my_make_class_controll.style.width="1000px"
    }
    
})

window.addEventListener("onload", function(){
    let w_width = this.window.innerWidth
    if(w_width <= 1200){
        register_class_controll.style.width=`${w_width - 60}px`
        // 이거는  내가 만든 클래스거 
        my_make_class_controll.style.width=`${w_width - 60}px`
    }
    if(w_width <=480){
        register_class_controll.style.width=`${w_width - 10}px`
        // 이거는  내가 만든 클래스거 
        my_make_class_controll.style.width=`${w_width - 10}px`
    }
    
})



// 내가 만든 클래스 js ==============================================================================================================

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
