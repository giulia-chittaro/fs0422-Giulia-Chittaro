const apiUrl = 'users.json';

const lista = document.querySelector('#lista');

fetch (apiUrl)
.then(res => res.json())
.then(res =>{

    console.log(res);


    for (let user of res){
    

        let card = document.querySelector('#card-container .card').cloneNode(true)


        let img = card.querySelector('.card-img-top')
        img.src = user.profileURL

        let nameBox = card.querySelector('.card-title')
        nameBox.innerText = user.username

        let descriptionFirstName = card.querySelector('#firstName')
        descriptionFirstName.innerText = 'Name : ' + user.firstName

        let descriptionLastName = card.querySelector('#lastName')
        descriptionLastName.innerText = 'Surname : ' + user.lastName

        let descriptionGender = card.querySelector('#gender')
        descriptionGender.innerText = 'Gender : ' + user.gender

        let contactName = card.querySelector('.card-link')
        contactName.innerText = user.email

        lista.append(card)
    }

})


