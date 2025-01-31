const settoreIT = {
    dipendente1:
    {
        nome: "Mario",
        eta: 30,
        ruolo: "sviluppatore"
    },
    dipendente2:
    {
        nome: "Luca",
        eta: 40,
        ruolo: "manager"
    },
    dipendente3:
    {
        nome: "Alessia",
        eta: 25,
        ruolo: "sistemista"
    }
};

function creaCard(settore) {
    let divPrincipale = document.getElementById("contenitore")
    for (let dipendente in settore) {
        //div iniziale
        let divCard = document.createElement("div"); 
        divCard.classList.add("card");
        divCard.style = "width: 18rem;"
        divPrincipale.appendChild(divCard);
        //img
        let img = document.createElement("img");
        img.src = "https://placehold.co/600x400";
        img.classList.add("card-img-top");
        img.alt = "placeholder";
        divCard.appendChild(img);
        //div interno
        let divInterno = document.createElement("div");
        divInterno.classList.add("card-body");
        divCard.appendChild(divInterno);
        //h5
        let h5 = document.createElement("h5")
        h5.classList.add("card-title");
        h5.innerHTML = settore[dipendente].nome;
        divInterno.appendChild(h5);
        //p
        let p = document.createElement("p")
        p.classList.add("card-text");
        p.innerHTML = settore[dipendente].eta + " " + settore[dipendente].ruolo;
        divInterno.appendChild(p);
    }
}

document.addEventListener("DOMContentLoaded", () => {
    creaCard(settoreIT);
});