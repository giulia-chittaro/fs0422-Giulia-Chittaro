
function aggiungiSimbolo(tasto){
    let display = document.getElementById("display");
    display.value += tasto.getAttribute('data-simbolo')
}

function calcola() {
    let display = document.getElementById("display");
    let totale = eval(display.value)
    display.value = totale
}

function cancella(){
display.value = ""
}

aggiungiSimbolo()
calcola()
cancella()
