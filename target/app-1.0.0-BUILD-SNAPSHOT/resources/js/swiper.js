var swiper = new Swiper(".mySwiper", {
  effect: 'slide',
  slidesPerView: 1, // 한번에 보여줄 칸수
  spaceBetween: 0, // 칸 사이사이마다의 여백
  slidesPerGroup: 1, // 한번에 몇개씩 빠져 나가게
  pagination: {
      el: ".swiper-pagination",
      clickable: true,
      type: 'bullets' , //'progressbar' | 'bullets' | 'fraction' | 'custom'
  },
  autoplay: {
      delay: 1000 // setInterval 같은거
  },
  speed: 1000, // 들어올때까지 걸리는 시간
  loop: true,
  navigation: {
      nextEl: '.swiper-button-next',
      prevEl: '.swiper-button-prev',
  },
});

// $('.mySwiper').hover(function(){
//   console.log(111)
//   swiper.autoplay.stop()
// }, function(){
//   console.log(222)
//   swiper.autoplay.start()
// })

// 375 272

var swiper = new Swiper(".mySwiper2", {
  effect: 'slide',
  slidesPerView: 4, // 한번에 보여줄 칸수
  spaceBetween: 30, // 칸 사이사이마다의 여백
  slidesPerGroup: 1, // 한번에 몇개씩 빠져 나가게
  pagination: {
      el: ".swiper-pagination",
      clickable: true,
      type: 'bullets' , //'progressbar' | 'bullets' | 'fraction' | 'custom'
  },
  autoplay: {
      delay: 1000 // setInterval 같은거
  },
  speed: 1000, // 들어올때까지 걸리는 시간
  loop: true,
  navigation: {
      nextEl: '.swiper-button-next',
      prevEl: '.swiper-button-prev',
  },
});

var swiper = new Swiper(".mySwiper3", {
  dir:"rtl",
  effect: 'slide',
  slidesPerView: 3, // 한번에 보여줄 칸수
  spaceBetween: 30, // 칸 사이사이마다의 여백
  slidesPerGroup: 1, // 한번에 몇개씩 빠져 나가게
  pagination: {
      el: ".swiper-pagination",
      clickable: true,
      type: 'bullets' , //'progressbar' | 'bullets' | 'fraction' | 'custom'
  },
  autoplay: {
      delay: 1000, // setInterval 같은거
      reverseDirection: true,
  },
  speed: 1000, // 들어올때까지 걸리는 시간
  loop: true,
  navigation: {
    nextEl: '.swiper-button-next',
    prevEl: '.swiper-button-prev'
  },
});

var swiper = new Swiper(".mySwiper4", {
  effect: 'slide',
  slidesPerView: 5, // 한번에 보여줄 칸수
  spaceBetween: 30, // 칸 사이사이마다의 여백
  slidesPerGroup: 1, // 한번에 몇개씩 빠져 나가게
  pagination: {
      el: ".swiper-pagination",
      clickable: true,
      type: 'bullets' , //'progressbar' | 'bullets' | 'fraction' | 'custom'
  },
  autoplay: {
      delay: 1000 // setInterval 같은거
  },
  speed: 1000, // 들어올때까지 걸리는 시간
  loop: true,
  navigation: {
      nextEl: '.swiper-button-next',
      prevEl: '.swiper-button-prev',
  },
});


// for문으로 슬라이더 넣는거================================================

// let review_content = document.getElementsByClassName("swiper-wrapper3")[0];
// let content_wrapper_1 = document.getElementsByClassName("content_wrapper_1")[0];
// let content_wrapper_2 = document.getElementsByClassName("content_wrapper_2")[0];
// let content_wrapper_3 = document.getElementsByClassName("content_wrapper_3")[0];
// let content_wrapper_4 = document.getElementsByClassName("content_wrapper_4")[0];
//
// // 메인 부분 넣어주는거====================================================
//
//
// for(let i=0; i<9; i++){
//   content_wrapper_1.innerHTML += `
//   <div class="swiper-slide">
//   <div class="swiper_inner_box">
//       <div class="swiper_img_box">
//           <div class="addr_box">
//               <span>강남</span>
//           </div>
//           <button class="like_box">
//               <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss94 css-1k33q06 heart_icon active_none" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteRoundedIcon"><path d="M13.35 20.13c-.76.69-1.93.69-2.69-.01l-.11-.1C5.3 15.27 1.87 12.16 2 8.28c.06-1.7.93-3.33 2.34-4.29 2.64-1.8 5.9-.96 7.66 1.1 1.76-2.06 5.02-2.91 7.66-1.1 1.41.96 2.28 2.59 2.34 4.29.14 3.88-3.3 6.99-8.55 11.76l-.1.09z"></path></svg>
//               <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss95 css-1k33q06 heart_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon"><path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg>
//           </button>
//           <img src="https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FR3ekMWTldwpieGgW_626a36fb2140cf7c76d9b1da_400x400?alt=media" alt="" class="content_img">
//       </div>
//       <div class="swiper_img_text">
//           <div class="img_text_top">
//               <div class="img_cate_box">
//                   <div class="img_cate_big">대분류</div>
//                   <div class="img_cate_small">소분류</div>
//               </div>
//               <div class="img_review">
//                   <div class="img_review_star">
//                       <div class="star_img"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRoundedIcon" style="color: rgb(229, 152, 25); font-size: 20px;"><path d="m12 17.27 4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"></path></svg></div>
//                       <span>0점</span>
//                   </div>
//                   <div class="img_review_heart">
//                       <div class="heart_img">
//                           <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon" style="color: rgb(242, 65, 71); font-size: 17px; opacity: 0.8;"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
//                       </div>
//                       <span>0개</span>
//                   </div>
//               </div>
//           </div>
//           <div class="img_text_bot">
//               <div class="img_text_title">
//                   <span>
//                       건강한 두피와 모발을 위환 샴푸바 만들기
//                   </span>
//               </div>
//           </div>
//       </div>
//   </div>
// </div>
//   `
// }
//
// for(let i=0; i<9; i++){
//   content_wrapper_2.innerHTML += `
//   <div class="swiper-slide">
//   <div class="swiper_inner_box">
//       <div class="swiper_img_box">
//           <div class="addr_box">
//               <span>강남</span>
//           </div>
//           <button class="like_box">
//               <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss94 css-1k33q06 heart_icon active_none" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteRoundedIcon"><path d="M13.35 20.13c-.76.69-1.93.69-2.69-.01l-.11-.1C5.3 15.27 1.87 12.16 2 8.28c.06-1.7.93-3.33 2.34-4.29 2.64-1.8 5.9-.96 7.66 1.1 1.76-2.06 5.02-2.91 7.66-1.1 1.41.96 2.28 2.59 2.34 4.29.14 3.88-3.3 6.99-8.55 11.76l-.1.09z"></path></svg>
//               <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss95 css-1k33q06 heart_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon"><path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg>
//           </button>
//           <img src="https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FR3ekMWTldwpieGgW_626a36fb2140cf7c76d9b1da_400x400?alt=media" alt="" class="content_img">
//       </div>
//       <div class="swiper_img_text">
//           <div class="img_text_top">
//               <div class="img_cate_box">
//                   <div class="img_cate_big">대분류</div>
//                   <div class="img_cate_small">소분류</div>
//               </div>
//               <div class="img_review">
//                   <div class="img_review_star">
//                       <div class="star_img"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRoundedIcon" style="color: rgb(229, 152, 25); font-size: 20px;"><path d="m12 17.27 4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"></path></svg></div>
//                       <span>0점</span>
//                   </div>
//                   <div class="img_review_heart">
//                       <div class="heart_img">
//                           <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon" style="color: rgb(242, 65, 71); font-size: 17px; opacity: 0.8;"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
//                       </div>
//                       <span>0점</span>
//                   </div>
//               </div>
//           </div>
//           <div class="img_text_bot">
//               <div class="img_text_title">
//                   <span>
//                       건강한 두피와 모발을 위환 샴푸바 만들기
//                   </span>
//               </div>
//           </div>
//       </div>
//   </div>
// </div>
//   `
// }
//
// for(let i=0; i<9; i++){
//   content_wrapper_3.innerHTML += `
//   <div class="swiper-slide">
//   <div class="swiper_inner_box">
//       <div class="swiper_img_box">
//           <div class="addr_box">
//               <span>강남</span>
//           </div>
//           <button class="like_box">
//               <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss94 css-1k33q06 heart_icon active_none" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteRoundedIcon"><path d="M13.35 20.13c-.76.69-1.93.69-2.69-.01l-.11-.1C5.3 15.27 1.87 12.16 2 8.28c.06-1.7.93-3.33 2.34-4.29 2.64-1.8 5.9-.96 7.66 1.1 1.76-2.06 5.02-2.91 7.66-1.1 1.41.96 2.28 2.59 2.34 4.29.14 3.88-3.3 6.99-8.55 11.76l-.1.09z"></path></svg>
//               <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss95 css-1k33q06 heart_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon"><path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg>
//           </button>
//           <img src="https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FR3ekMWTldwpieGgW_626a36fb2140cf7c76d9b1da_400x400?alt=media" alt="" class="content_img">
//       </div>
//       <div class="swiper_img_text">
//           <div class="img_text_top">
//               <div class="img_cate_box">
//                   <div class="img_cate_big">대분류</div>
//                   <div class="img_cate_small">소분류</div>
//               </div>
//               <div class="img_review">
//                   <div class="img_review_star">
//                       <div class="star_img"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRoundedIcon" style="color: rgb(229, 152, 25); font-size: 20px;"><path d="m12 17.27 4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"></path></svg></div>
//                       <span>0점</span>
//                   </div>
//                   <div class="img_review_heart">
//                       <div class="heart_img">
//                           <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon" style="color: rgb(242, 65, 71); font-size: 17px; opacity: 0.8;"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
//                       </div>
//                       <span>0점</span>
//                   </div>
//               </div>
//           </div>
//           <div class="img_text_bot">
//               <div class="img_text_title">
//                   <span>
//                       건강한 두피와 모발을 위환 샴푸바 만들기
//                   </span>
//               </div>
//           </div>
//       </div>
//   </div>
// </div>
//   `
// }
//
// for(let i=0; i<9; i++){
//   content_wrapper_4.innerHTML += `
//   <div class="swiper-slide">
//   <div class="swiper_inner_box">
//       <div class="swiper_img_box">
//           <div class="addr_box">
//               <span>강남</span>
//           </div>
//           <button class="like_box">
//               <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss94 css-1k33q06 heart_icon active_none" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteRoundedIcon"><path d="M13.35 20.13c-.76.69-1.93.69-2.69-.01l-.11-.1C5.3 15.27 1.87 12.16 2 8.28c.06-1.7.93-3.33 2.34-4.29 2.64-1.8 5.9-.96 7.66 1.1 1.76-2.06 5.02-2.91 7.66-1.1 1.41.96 2.28 2.59 2.34 4.29.14 3.88-3.3 6.99-8.55 11.76l-.1.09z"></path></svg>
//               <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeSmall jss95 css-1k33q06 heart_icon" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteBorderRoundedIcon"><path d="M19.66 3.99c-2.64-1.8-5.9-.96-7.66 1.1-1.76-2.06-5.02-2.91-7.66-1.1-1.4.96-2.28 2.58-2.34 4.29-.14 3.88 3.3 6.99 8.55 11.76l.1.09c.76.69 1.93.69 2.69-.01l.11-.1c5.25-4.76 8.68-7.87 8.55-11.75-.06-1.7-.94-3.32-2.34-4.28zM12.1 18.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg>
//           </button>
//           <img src="https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FR3ekMWTldwpieGgW_626a36fb2140cf7c76d9b1da_400x400?alt=media" alt="" class="content_img">
//       </div>
//       <div class="swiper_img_text">
//           <div class="img_text_top">
//               <div class="img_cate_box">
//                   <div class="img_cate_big">대분류</div>
//                   <div class="img_cate_small">소분류</div>
//               </div>
//               <div class="img_review">
//                   <div class="img_review_star">
//                       <div class="star_img"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="StarRoundedIcon" style="color: rgb(229, 152, 25); font-size: 20px;"><path d="m12 17.27 4.15 2.51c.76.46 1.69-.22 1.49-1.08l-1.1-4.72 3.67-3.18c.67-.58.31-1.68-.57-1.75l-4.83-.41-1.89-4.46c-.34-.81-1.5-.81-1.84 0L9.19 8.63l-4.83.41c-.88.07-1.24 1.17-.57 1.75l3.67 3.18-1.1 4.72c-.2.86.73 1.54 1.49 1.08l4.15-2.5z"></path></svg></div>
//                       <span>0점</span>
//                   </div>
//                   <div class="img_review_heart">
//                       <div class="heart_img">
//                           <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="FavoriteIcon" style="color: rgb(242, 65, 71); font-size: 17px; opacity: 0.8;"><path d="m12 21.35-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"></path></svg>
//                       </div>
//                       <span>0점</span>
//                   </div>
//               </div>
//           </div>
//           <div class="img_text_bot">
//               <div class="img_text_title">
//                   <span>
//                       건강한 두피와 모발을 위환 샴푸바 만들기
//                   </span>
//               </div>
//           </div>
//       </div>
//   </div>
// </div>
//   `
// }
//
//
// // 후기부분 넣어주는거============================
// for(let i=0; i<10; i++){
//   review_content.innerHTML +=`
//   <div class="swiper-slide">
//     <a href="#">
//       <div class="swiper_inner_box review_content_box">
//         <div class="swiper_img_box review_box">
//             <img src="https://firebasestorage.googleapis.com/v0/b/mochaclass-intro-web-4e0c0.appspot.com/o/FCMImages%2FR3ekMWTldwpieGgW_626a36fb2140cf7c76d9b1da_400x400?alt=media" alt="" class="content_img">
//         </div>
//         <div class="swiper_img_text review_text_box">
//             <span class="review_text_title">클래스 이름</span>
//             <span class="review_text_content">
//                 너무 좋습니다!! 너무 좋습니다!! 너무 좋습니다!! 너무 좋습니다!! 너무 좋습니다!!
//             </span>
//         </div>
//       </div>
//     </a>
//   </div>`
// }