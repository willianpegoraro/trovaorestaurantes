var swiper = new Swiper(".mySwiper", {
  freeMode: true,
  slidesPerView: "5",
  spaceBetween: 5,
  loop: true,
  speed: 3000,
  autoplay: {

    //reverseDirection: true,
    delay: 2000,
    disableOnInteraction: false,
    pauseOnMouseEnter: true,
  },
  pagination: {
    el: ".swiper-pagination",
    clickable: true,
  },
});

var swiper = new Swiper(".mySwiperReverse", {
  freeMode: true,
  slidesPerView: "5",
  spaceBetween: 5,
  loop: true,
  speed: 3000,
  autoplay: {

    reverseDirection: true,
    delay: 2000,
    disableOnInteraction: false,
    pauseOnMouseEnter: true,
  },
  pagination: {
    el: ".swiper-pagination",
    clickable: true,
  },
});