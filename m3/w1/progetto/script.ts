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

let user1 = new FirstUser(20 , 3 , 0.20)
console.log (user1)


user1.ricarica(50)
user1.chiamata(15)

console.log(user1.numero404());
console.log(user1.getNumeroChiamate());

console.log ( "Il saldo residuo è :" + user1.carica );

console.log ("Le chiamate effettuate sono :" + user1.numeroChiamate );


class SecondUser implements ISmartphone{

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

let user2 = new SecondUser(50 , 5 , 0.20)
console.log (user2)


user1.ricarica(45)
user1.chiamata(10)

console.log(user2.numero404());
console.log(user2.getNumeroChiamate());

console.log ( "Il saldo residuo è :" + user2.carica );

console.log ("Le chiamate effettuate sono :" + user2.numeroChiamate );

class ThirdUser implements ISmartphone{

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

let user3 = new FirstUser(10 , 10 , 0.20)
console.log (user3)


user1.ricarica(100)
user1.chiamata(50)

console.log(user3.numero404());
console.log(user3.getNumeroChiamate());

console.log ( "Il saldo residuo è :" + user3.carica );

console.log ("Le chiamate effettuate sono :" + user3.numeroChiamate );