"use strict";
class FirstUser {
    constructor(carica, numeroChiamate, costoMinuto) {
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.costoMinuto = costoMinuto;
    }
    ricarica(unaRicarica) {
        this.carica += unaRicarica;
    }
    chiamata(minutiDurata) {
        let costoChiamata = minutiDurata * this.costoMinuto;
        this.carica = this.carica - costoChiamata;
        this.numeroChiamate++;
    }
    numero404() {
        return this.carica;
    }
    getNumeroChiamate() {
        return this.numeroChiamate;
    }
    azzeraChiamate() {
        this.numeroChiamate = 0;
    }
}
let user1 = new FirstUser(20, 3, 0.20);
console.log(user1);
user1.ricarica(50);
user1.chiamata(15);
user1.chiamata(25);
console.log("Il saldo residuo è :" + user1.numero404());
console.log("Le chiamate effettuate sono :" + user1.getNumeroChiamate());
class SecondUser {
    constructor(carica, numeroChiamate, costoMinuto) {
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.costoMinuto = costoMinuto;
    }
    ricarica(unaRicarica) {
        this.carica += unaRicarica;
    }
    chiamata(minutiDurata) {
        let costoChiamata = minutiDurata * this.costoMinuto;
        this.carica = this.carica - costoChiamata;
        this.numeroChiamate++;
    }
    numero404() {
        return this.carica;
    }
    getNumeroChiamate() {
        return this.numeroChiamate;
    }
    azzeraChiamate() {
        this.numeroChiamate = 0;
    }
}
let user2 = new SecondUser(50, 5, 0.20);
console.log(user2);
user2.ricarica(45);
user2.chiamata(10);
user2.chiamata(50);
console.log("Il saldo residuo è :" + user2.numero404());
console.log("Le chiamate effettuate sono :" + user2.getNumeroChiamate());
class ThirdUser {
    constructor(carica, numeroChiamate, costoMinuto) {
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.costoMinuto = costoMinuto;
    }
    ricarica(unaRicarica) {
        this.carica += unaRicarica;
    }
    chiamata(minutiDurata) {
        let costoChiamata = minutiDurata * this.costoMinuto;
        this.carica = this.carica - costoChiamata;
        this.numeroChiamate++;
    }
    numero404() {
        return this.carica;
    }
    getNumeroChiamate() {
        return this.numeroChiamate;
    }
    azzeraChiamate() {
        this.numeroChiamate = 0;
    }
}
let user3 = new FirstUser(10, 10, 0.20);
console.log(user3);
user3.ricarica(100);
user3.chiamata(50);
user3.chiamata(35);
console.log("Il saldo residuo è :" + user3.numero404());
console.log("Le chiamate effettuate sono :" + user3.getNumeroChiamate());
//# sourceMappingURL=script.js.map