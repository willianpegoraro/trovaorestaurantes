//Get the button
var mybutton = document.getElementById("myBtn");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}

const toggleButton = document.getElementsByClassName('toggle-button')[0]
const navbarLinks = document.getElementsByClassName('navbar-links')[0]

toggleButton.addEventListener('click', () => {
  navbarLinks.classList.toggle('active')
})

//galeria
let time = 5000,
    currentImageIndex = 0,
    images = document
        .querySelectorAll("#slider img")
    max = images.length;

function nextImage(){
    images[currentImageIndex]
        .classList.remove("selected")
    
    currentImageIndex++

    if(currentImageIndex >= max)
        currentImageIndex = 0
    
    images[currentImageIndex]
        .classList.add("selected")
}

function start(){
    setInterval(() =>{
        //troca de imagem
        nextImage()
    }, time)
}

window.addEventListener("load", start)

//galeria 2
  images = document
        .querySelectorAll("#slider2 img")
    max = images.length;

function nextImage(){
    images[currentImageIndex]
        .classList.remove("selected")
    
    currentImageIndex++

    if(currentImageIndex >= max)
        currentImageIndex = 0
    
    images[currentImageIndex]
        .classList.add("selected")
}

function start(){
    setInterval(() =>{
        //troca de imagem
        nextImage()
    }, time)
}

window.addEventListener("load", start)

