var swiper = new Swiper(".mySwiper", {
    slidesPerView: 4, // 한번에 보여줄 칸수
    spaceBetween: 10, // 칸 사이사이마다의 여백
    slidesPerGroup: 1, // 한번에 몇개씩 빠져 나가게
    speed: 1000, // 들어올때까지 걸리는 시간
    loop: true,
    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    },
    breakpoints: {
        0: {
            spaceBetween: 5,
        },
        480: {
            slidesPerView: 3,  //브라우저가 768보다 클 때
            spaceBetween: 10,
        },
        800: {
            slidesPerView: 4,  //브라우저가 1024보다 클 때
            spaceBetween: 10,
        },
    }
    
});



let sub_img = document.querySelectorAll('.swiper-wrapper img');
let select_img = document.getElementById('main_img');

select_img.style.display = 'block';
select_img.innerHTML = '<img src="' + sub_img[0].src + '" alt="' + sub_img[0].alt + '">';


for (var i = 0; i < sub_img.length; i++) {
    sub_img[i].onclick = function() {
        // 이미지가 보이지 않는 상태인 경우 보이도록 설정하고, 이미지 경로를 설정함
        select_img.style.display = 'block';
        select_img.innerHTML = '<img src="' + this.src + '" alt="' + this.alt + '">';

        // 모든 서브 이미지의 보더 제거
        for (var j = 0; j < sub_img.length; j++) {
            sub_img[j].style.border = 'none';
        }
    };
}

let fixed_height = document.getElementsByClassName("class_info_box_outer")[0];
let orgin_height = document.body.offsetHeight;

window.addEventListener('resize', function(){
    fixed_height.style.height= `${orgin_height - 300}px`;
})
window.addEventListener('scroll', function(){
    fixed_height.style.height= `${orgin_height - 300}px`;
})





let wish_list = document.getElementsByClassName("wish_list")
let none_heart = document.getElementsByClassName("none_heart")
let full_heart = document.getElementsByClassName("full_heart")
let wish_count = 0;


for(let i=0; i<2; i++){
    wish_list[i].addEventListener('click', function(){
        for(let i=0; i<2; i++){
            if( (wish_count%2) == 1){
                none_heart[i].style.display="block"
                full_heart[i].style.display="none"
            }
            else{
                none_heart[i].style.display="none"
                full_heart[i].style.display="block"
            }
        }
        wish_count++
    })
}
