//var 1 pet_preferito = 'gatto';
//console.log(1 pet_preferito);

/*var pet = 'gatto';
var Pet = 'cane';*/
var petPreferito = 'criceto';
var PetPreferito = 'coniglio';

var $pet = 'giraffa';
console.log($pet);
var _pet = 'leone';
console.log(_pet);
var _pet2 = 'pantera';
document.write(_pet2);

//prova bottone con allert//
var button = document.querySelector('#button');
console.log(button);
var heading = document.querySelector('#heading');
console.log(heading);

button.onclick = () => {
    const name = prompt('Qual è il tuo animale preferito?');
    alert(`Ciao Lidia , nice to see you!`);
    heading.textContent = `Qual è il tuo animale preferito?`;
  }



//var 12 = 'numero';

var numero = '12';
console.log(12);


//prove//

var blocco1 = document.querySelectorAll('blocco1');
console.log('blocco1');

var blocco2 = document.querySelectorAll('blocco2');
 blocco1.style.backgroundcolor= 'red';
 blocco2.style.backgroundcolor= 'yellow';

 var change = document.getElementById('change');
 function change(){
    alert('Guarda come cambio colore');
    change.style.backgroundcolor= 'red';
}