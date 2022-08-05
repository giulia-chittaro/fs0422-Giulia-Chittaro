const apiUrl = 'lista.json';

const blocco = document.querySelector('#blocco');

fetch (apiUrl)
.then(res => res.json())
.then(res =>{

    console.log(res);

    for (let user of res){
    
     let card = document.createElement('div');
     card.classList.add('card-container')

        let img = document.createElement('img')
        img.src = user.profileURL
        img.classList.add('img-card')

        let h2 = document.createElement('h2')
         h2.innerHTML = user.username
         h2.classList.add('header')

         

       

        card.append(img,h2)
        blocco.append(card)
    }

})