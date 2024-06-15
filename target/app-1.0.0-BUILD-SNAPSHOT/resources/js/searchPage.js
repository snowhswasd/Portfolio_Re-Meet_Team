

// for문으로 select값 넣어주기=============================================
// let addr_select = document.getElementById("addr_select");
// let category_select = document.getElementById("category_select");
//
// for(let i=0; i<25; i++){
//     addr_select.innerHTML += `<option  value="${i}">${i}</option>`
// }
//
// for(let i=0; i<8 ; i++){
//     category_select.innerHTML += `<option class="options" value="${i}">카테고리${i}</option>`
// }




// 소분류 선택 ===========================================
// let mini_category = document.getElementsByClassName("option_mid_box")[0];
// let input_label_box = document.getElementsByClassName("input_label_box");
//
// for(let i=0; i<64; i++){
//     mini_category.innerHTML += `
//     <div class="input_label_box type0 active_off">
//         <input type="checkbox" id="category${i}" value="category${i}">
//         <label for="category${i}">
//             소분류${i}번째
//         </label>
//     </div>`
// }
//
//
// function show_mini() {
//     let select_value = document.getElementById("category_select").value;
//
//     let checkboxes = document.querySelectorAll('.input_label_box input[type="checkbox"]');
// // 다른 소분류 선택시 기준 선택 했던거 해제 기능
//     for(let i=0; i<64; i++){
//         checkboxes[i].checked = false;
//     }
//
//     for(let i=0; i<64; i++){
//         input_label_box[i].classList.add("active_off")
//     }
//
//
//     for(let i=0; i<8; i++){
//         if(select_value == 0){
//             for(let i=0; i<8; i++){
//                 input_label_box[i].classList.remove("active_off")
//             }
//         }
//         else if(select_value == 1){
//             for(let i=8; i<16; i++){
//                 input_label_box[i].classList.remove("active_off")
//             }
//         }
//         else if(select_value == 2){
//             for(let i=16; i<24; i++){
//                 input_label_box[i].classList.remove("active_off")
//             }
//         }
//         else if(select_value == 3){
//             for(let i=24; i<32; i++){
//                 input_label_box[i].classList.remove("active_off")
//             }
//         }
//         else if(select_value == 4){
//             for(let i=32; i<40; i++){
//                 input_label_box[i].classList.remove("active_off")
//             }
//         }
//         else if(select_value == 5){
//             for(let i=40; i<48; i++){
//                 input_label_box[i].classList.remove("active_off")
//             }
//         }
//         else if(select_value == 6){
//             for(let i=48; i<56; i++){
//                 input_label_box[i].classList.remove("active_off")
//             }
//         }
//         else if(select_value == 7){
//             for(let i=56; i<64; i++){
//                 input_label_box[i].classList.remove("active_off")
//             }
//         }
//     }
//
//
//
// }
//
//
// // input슬라이더 값 출력하기===============================
// let star_slider = document.getElementById("myRange_star");
// let date_slider = document.getElementById("myRange_date");
// let output_star = document.getElementById("star_score");
// let output_date = document.getElementById("date_score");
// let reset_btn = document.getElementsByClassName("slider_reset_btn")[0]
// output_star.innerHTML = star_slider.value;
// output_date.innerHTML = date_slider.value;
//
// star_slider.oninput = function() {
//     output_star.innerHTML = this.value;
// }
//
// date_slider.oninput = function() {
//     output_date.innerHTML = this.value;
// }
// reset_btn.addEventListener("click", function(){
//     let value = 0;
//     output_star.innerHTML = value ;
//     output_date.innerHTML = value ;
//     // 소분류 초기화
//     for(let i=0; i<64; i++){
//         input_label_box[i].classList.add("active_off")
//     }
//
// })

// 햄버거 버튼 ==========================================================
$(document).ready(function(){
    let chk = false;
    $(".search_nav_btn").click(function(){
        $('.hem_pan').css({
            left: "100%",
            transition: "0.3s"
        })  
        // 버튼 원래대로 하기
        $('.line_top').removeClass('rotate45')
        setTimeout(function(){
            $('.line_top').removeClass('mid_setting')
        }, 150)
        
        $('.line_mid').delay(150).animate({
            opacity: 1
        }, 0)
        $('.line_bot').removeClass('rotate_45')
        setTimeout(function(){
            $('.line_bot').removeClass('mid_setting')
        }, 150)
        chk = !chk;
    })
    $('.Responsive_hem').click(function(){
        $(".blockpan").css({
            display:"none"
        })
        if(chk) {
            $('.hem_pan').css({
                left: "100%",
                transition: "0.3s"
            })  
            // 버튼 원래대로 하기
            $('.line_top').removeClass('rotate45')
            setTimeout(function(){
                $('.line_top').removeClass('mid_setting')
            }, 150)
            
            $('.line_mid').delay(150).animate({
                opacity: 1
            }, 0)
            $('.line_bot').removeClass('rotate_45')
            setTimeout(function(){
                $('.line_bot').removeClass('mid_setting')
            }, 150)
        }
        else {
            $(".blockpan").css({
                display:"block"
            })
            $('.hem_pan').css({
                left: "0",
                transition: "0.3s"
            })       
            $('.Responsive_pan').animate({
                left:0
            }, 500)     
            // 버튼 X로 하기
            $('.line_top').addClass('mid_setting')
            setTimeout(function(){
                $('.line_top').addClass('rotate45')
            }, 150)
            
            $('.line_mid').delay(150).animate({
                opacity: 0
            }, 0)

            $('.line_bot').addClass('mid_setting')
            setTimeout(function(){
                $('.line_bot').addClass('rotate_45')
            }, 150)

        }
        chk = !chk;
    })

})


// 추천카테고리
let bot_nav = document.getElementsByClassName("bot_nav")[0];
let bot_nav_icon =document.getElementsByClassName("bot_nav_icon");
let mini_cate_title =
["축구","베이킹","그림",
"반려동물","글램핑","마술",
"보드게임","농구","영화"
]
let mini_cate_img =
["soccer","baking","drawing","animal",
"camping","magic","game","basketball","cinema"
]

    for(let i=0; i<9; i++){
        bot_nav.innerHTML +=`
        <a href="#">
            <div class="bot_nav_menu">
                <div class="bot_nav_icon"></div>
                <span>${mini_cate_title[i]}</span>
            </div>
        </a>
        `
        bot_nav_icon[i].style.background = `url(../img/cate/${mini_cate_img[i]}.png) no-repeat center center /cover`;
    }

    // function toggleHeart(button) {
    //     var heartIcons = button.querySelectorAll('.heart_icon');
    //     heartIcons.forEach(function(icon) {
    //         icon.classList.toggle('full_heart');
    //         icon.classList.toggle('none_heart');
    //     });
    //
    //     event.preventDefault();
    // }



// 검색창 닫기
// let search_bar = document.getElementsByClassName("search_bar")[0];
let close_btn = document.getElementsByClassName("search_pan_close_btn")[0];
let pan_menu = document.getElementsByClassName("pan_menu")[1];
let move_pan = document.getElementsByClassName("search_pan_box")[0];
let blockpan = document.getElementsByClassName("blockpan")[0]
let hem_pan = document.getElementsByClassName("hem_pan")[0]

pan_menu.addEventListener('click', function(){
    move_pan.style.display="block"
    hem_pan.style.left="100%"
})
close_btn.addEventListener('click', function(){
    move_pan.style.display="none"
    blockpan.style.display="none"
})

// 추천페이지 내용 넣어주기
// let content_box = document.getElementsByClassName("content_box")[0]
//
// for(let i=0; i<12; i++){
//     content_box.innerHTML +=`
//     <div class="search_content_outer">
//         <div class="search_content_inner_box">
//             <!-- 이미지 나오는곳 -->
//             <div class="search_content_img_box">
//                 <!-- 지역  -->
//                 <div class="addr_box">
//                     <span>강남</span>
//                 </div>
//                 <!-- 하트버튼 -->
//                 <button class="like_box" onclick="toggleHeart(this)">
//                     <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss94 css-1k33q06 heart_icon full_heart" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteRoundedIcon">
//                         <path d="M13.35 20.13c-.76.69-1.93.69-2.69-.01l-.11-.1C5.3 15.27 1.87 12.16 2 8.28c.06-1.7.93-3.33 2.34-4.29 2.64-1.8 5.9-.96 7.66 1.1 1.76-2.06 5.02-2.91 7.66-1.1 1.41.96 2.28 2.59 2.34 4.29.14 3.88-3.3 6.99-8.55 11.76l-.1.09z"></path>
//                     </svg>
//                     <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss95 css-1k33q06 heart_icon none_heart" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon">
//                         <path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path>
//                     </svg>
//                 </button>
//                 <img src="../img/test_img1.jpg" alt="" class="content_img">
//             </div>
//             <div class="search_content_text">
//                 <div class="img_text_top">
//                     <div class="img_cate_box">
//                         <span class="img_cate_big">대분류</span>
//                         <span class="img_cate_small">소분류</span>
//                     </div>
//                     <div class="img_review">
//                         <div class="img_review_star">
//                             <div class="star_img"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRoundedIcon" style="color: rgb(229, 152, 25); font-size: 20px;"><path d="m12 17.27 4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"></path></svg></div>
//                             <span>0점</span>
//                         </div>
//                         <div class="img_review_heart">
//                             <div class="heart_img">
//                                 <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon" style="color: rgb(242, 65, 71); font-size: 17px; opacity: 0.8;"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
//                             </div>
//                             <span>0점</span>
//                         </div>
//                     </div>
//                 </div>
//                 <div class="img_text_bot">
//                     <div class="img_text_title">
//                         <span>
//                             건강한 두피와 모발을 위환 샴푸바 만들기
//                         </span>
//                     </div>
//                 </div>
//             </div>
//         </div>
//     </div>
//     `
// }

window.addEventListener('resize', function(){
    if(window.innerWidth > 800){
        blockpan.style.display="none";
        move_pan.style.display="block";
    }
    else{
        move_pan.style.display="none";
    }
});
window.addEventListener('onload', function(){
    if(window.innerWidth > 800){
        blockpan.style.display="none";
        move_pan.style.display="block";
    }
    else{
        move_pan.style.display="none";
    }
});

