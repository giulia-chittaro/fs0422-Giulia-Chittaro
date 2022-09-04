interface ISmartphone{

    carica : number ;
    numeroChiamate : number;
    costoMinuto : number;
    
    ricarica(unaRicarica : number) : void;

    chiamata(minutiDurata : number) : void;

    numero404() : number;
     
    getNumeroChiamate() : number;

    azzeraChiamate() : void;


}


class FirstUser implements ISmartphone{

    carica : number ;
    numeroChiamate : number;
    costoMinuto : number;
    

    constructor(carica : number, numeroChiamate : number, costoMinuto : number){
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.costoMinuto = costoMinuto;
       
    }
    
    ricarica(unaRicarica : number) : void {

        this.carica += unaRicarica

    }

    chiamata(minutiDurata : number) : void {
           
        let costoChiamata : number = minutiDurata * this.costoMinuto 
        this.carica = this.carica - costoChiamata
        this.numeroChiamate ++;

    }

    numero404() : number {

        return this.carica

}

getNumeroChiamate(): number {

    return this.numeroChiamate
}

azzeraChiamate(): void {
 
    this.numeroChiamate = 0
}

}

let Mario = new FirstUser(20 , 3 , 0.20)


Mario.ricarica(50)
Mario.chiamata(15)
Mario.chiamata(25)


console.log ( "Il saldo residuo è :" + Mario.numero404());
console.log ("Le chiamate effettuate sono :" + Mario.getNumeroChiamate() );


// function Orologio()
// {
//     var data = new Date();
//     var hh = data.getHours();
//     var mm = data.getMinutes();
//     var ss = data.getSeconds();
//     var ora = hh + ":" + mm + ":" + ss;
//     var clock = document.querySelector("#clock");
//     document.querySelector("#clock").innerText = ora;
//     window.setTimeout("Orologio()", 1000);
// }

// Orologio(); 