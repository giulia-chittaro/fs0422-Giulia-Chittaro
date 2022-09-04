var FirstUser = /** @class */ (function () {
    function FirstUser(carica, numeroChiamate, costoMinuto) {
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.costoMinuto = costoMinuto;
    }
    FirstUser.prototype.ricarica = function (unaRicarica) {
        this.carica += unaRicarica;
    };
    FirstUser.prototype.chiamata = function (minutiDurata) {
        var costoChiamata = minutiDurata * this.costoMinuto;
        this.carica = this.carica - costoChiamata;
        this.numeroChiamate++;
    };
    FirstUser.prototype.numero404 = function () {
        return this.carica;
    };
    FirstUser.prototype.getNumeroChiamate = function () {
        return this.numeroChiamate;
    };
    FirstUser.prototype.azzeraChiamate = function () {
        this.numeroChiamate = 0;
    };
    return FirstUser;
}());
var user1 = new FirstUser(20, 3, 0.20);
console.log(user1);
user1.ricarica(50);
user1.chiamata(15);
console.log(user1.numero404());
console.log(user1.getNumeroChiamate());
console.log("Il saldo residuo è :" + user1.carica);
console.log("Le chiamate effettuate sono :" + user1.numeroChiamate);
var SecondUser = /** @class */ (function () {
    function SecondUser(carica, numeroChiamate, costoMinuto) {
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.costoMinuto = costoMinuto;
    }
    SecondUser.prototype.ricarica = function (unaRicarica) {
        this.carica += unaRicarica;
    };
    SecondUser.prototype.chiamata = function (minutiDurata) {
        var costoChiamata = minutiDurata * this.costoMinuto;
        this.carica = this.carica - costoChiamata;
        this.numeroChiamate++;
    };
    SecondUser.prototype.numero404 = function () {
        return this.carica;
    };
    SecondUser.prototype.getNumeroChiamate = function () {
        return this.numeroChiamate;
    };
    SecondUser.prototype.azzeraChiamate = function () {
        this.numeroChiamate = 0;
    };
    return SecondUser;
}());
var user2 = new SecondUser(50, 5, 0.20);
console.log(user2);
user1.ricarica(45);
user1.chiamata(10);
console.log(user2.numero404());
console.log(user2.getNumeroChiamate());
console.log("Il saldo residuo è :" + user2.carica);
console.log("Le chiamate effettuate sono :" + user2.numeroChiamate);
var ThirdUser = /** @class */ (function () {
    function ThirdUser(carica, numeroChiamate, costoMinuto) {
        this.carica = carica;
        this.numeroChiamate = numeroChiamate;
        this.costoMinuto = costoMinuto;
    }
    ThirdUser.prototype.ricarica = function (unaRicarica) {
        this.carica += unaRicarica;
    };
    ThirdUser.prototype.chiamata = function (minutiDurata) {
        var costoChiamata = minutiDurata * this.costoMinuto;
        this.carica = this.carica - costoChiamata;
        this.numeroChiamate++;
    };
    ThirdUser.prototype.numero404 = function () {
        return this.carica;
    };
    ThirdUser.prototype.getNumeroChiamate = function () {
        return this.numeroChiamate;
    };
    ThirdUser.prototype.azzeraChiamate = function () {
        this.numeroChiamate = 0;
    };
    return ThirdUser;
}());
var user3 = new FirstUser(10, 10, 0.20);
console.log(user3);
user1.ricarica(100);
user1.chiamata(50);
console.log(user3.numero404());
console.log(user3.getNumeroChiamate());
console.log("Il saldo residuo è :" + user3.carica);
console.log("Le chiamate effettuate sono :" + user3.numeroChiamate);
