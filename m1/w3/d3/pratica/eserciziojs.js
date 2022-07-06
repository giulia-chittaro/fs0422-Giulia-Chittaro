
let bottone = document.querySelector("#bottone")
console.log(bottone)
let titolo = document.querySelector("#titolo")
console.log(titolo)

bottone.onclick = () => {
    const data = prompt('In che anno sei nato?');
    console.log(data);

    function calcolaAnni (){
   
   const eta = alert( 2022 - data)

    if(eta < 18){
        document.write(' Sei minorenne')
     }else{
        document.write(' Sei maggiorenne')
     }
          
}
calcolaAnni();
}





