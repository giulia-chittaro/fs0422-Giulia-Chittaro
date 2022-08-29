let addbtn = document.querySelector('#add')
let lista = document.querySelector('#list-group')
let nome = document.querySelector('#name')
let comment = document.querySelector('#comment')



addbtn.addEventListener('click', function(e) { 

    e.preventDefault()


    let utente = document.createElement('div')
    utente.classList.add('utente')
    let nomeutente = document.createElement('p')
    nomeutente.classList.add('nomeutente')
    nomeutente.innerHTML =  nome.value
    let commentutente = document.createElement('p') 
    commentutente.classList.add('commentutente')
    commentutente.innerHTML = comment.value
    utente.append(nomeutente, commentutente)
    lista.append(utente)

})