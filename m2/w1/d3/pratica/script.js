let cubo = document.querySelector('.cubo')
let inizia = document.querySelector('#play')
let fine = document.querySelector('#stop')

inizia.addEventListener('click', function carosello(){
    cubo.classList.add('.cuboAnimation')
}
)


fine.addEventListener('click',function stopCarosello(){
    cubo.classList.remove('.cuboAnimation')
}
 )





