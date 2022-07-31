
var countDownDate = new Date("February 18, 2023 20:30:00").getTime();

var x = setInterval(function() {

  var now = new Date().getTime();

  var contoRovescia = countDownDate - now;

  var days = Math.floor(contoRovescia / (1000 * 60 * 60 * 24));
  var hours = Math.floor((contoRovescia % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
  var minutes = Math.floor((contoRovescia % (1000 * 60 * 60)) / (1000 * 60));
  var seconds = Math.floor((contoRovescia % (1000 * 60)) / 1000);

  
  document.getElementById("days").innerHTML = days + "d " ;

  document.getElementById("hours").innerHTML =  hours + "h";

  document.getElementById("minutes").innerHTML = minutes + "m" ;

  document.getElementById("seconds").innerHTML = seconds + "s";




  if (contoRovescia < 0) {
    clearInterval(x);
    document.getElementById("clockDiv").innerHTML = "We are waiting for you!";
  }
}, 1000);