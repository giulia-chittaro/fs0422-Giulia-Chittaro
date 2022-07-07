// punto 1

let conta = ['1', '2','3', '4', '5', '6']
console.log(conta)
let lista1 = [ 'ciao', 'hello', 'hola', 'salut']
console.log(lista1)
let lista2 = [ 'COME STAI', 'HOW ARE YOU','COMO ESTAS', 'COMMENT ALEZ-VOUS']
console.log(lista2)

let unione = lista1.concat(lista2)
console.log(unione)

/*
let maiuscolo = lista1.toUppercase()
console.log(maiuscolo)

let minuscolo = lista2.toLowercase()
console.log(minuscolo)
*/

// punto 2 , punto 3 ,punto 4 


let persone = [' Tiziano Ferro', 'Cesare Cremonini', 'Ligabue', 'Vasco Rossi', 'Gianna Nannini']
console.log(persone[2])

let cantante = "Albano"

persone.push(cantante)
console.log(persone)
console.log(persone.length)


//punto 5

function somma () {
let totale = ['1', '2','3', '4', '5', '6']
return totale[2] + totale[4]

}

somma()
console.log( somma())


// punto 6

let taglia = persone.pop()
console.log(persone)

let taglia1 = lista2.shift()
console.log(taglia1) //mi stampa il primo elemento


let aggiungi = lista1.push('shalom')
console.log(aggiungi)

let aggiungi1 = persone.unshift('ciao')
console.log(aggiungi1)