
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
//
//
// // 소분류 선택 ===========================================
// let mini_category = document.getElementsByClassName("option_mid_box")[0];
// let input_label_box = document.getElementsByClassName("input_label_box");
//
// for(let i=0; i<64; i++){
//     mini_category.innerHTML += `
//     <div class="input_label_box type0 active_off">
//         <input type="checkbox" id="category${i}" value="category${i}" name="s_cate">
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
// /*
// 1 = 8
// 2 = 16
// 3 = 24
// */
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
// 검색창 닫기 버튼 ==========================================================

let close_btn = document.getElementsByClassName("search_pan_close_btn")[0];
let pan_menu = document.getElementsByClassName("pan_menu")[1];
let move_pan = document.getElementsByClassName("search_pan_box")[0];
let blockpan = document.getElementsByClassName("blockpan")[0]
let hem_pan = document.getElementsByClassName("hem_pan")[0]

pan_menu.addEventListener('click', function(){
    move_pan.style.display="block"
    blockpan.style.display="none"
    hem_pan.style.left="100%"
})
close_btn.addEventListener('click', function(){
    move_pan.style.display="none"
})

// 햄버거 버튼 ==========================================================
$(document).ready(function(){
    $(".search_bar").click(function(){
        $(".search_pan_box").css({
            display: "block"
        })
        
    })
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