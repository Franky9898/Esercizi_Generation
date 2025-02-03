document.getElementById("aggiungi").addEventListener("click", function (e)
{
    e.preventDefault(); // Previene refresh form
    aggiungiTask();
});

function aggiungiTask()
{
    let lista = document.getElementById("lista");
    let elementoLista = creaElementoLista();
    let bottone = creaBottoneRimuovi(elementoLista);
    elementoLista.appendChild(bottone);
    lista.appendChild(elementoLista);
}

function creaElementoLista()
{
    let elemento = document.createElement("li");
    let dentroElemento = document.createTextNode(testoNota());
    elemento.appendChild(dentroElemento);
    elemento.classList.add("list-group-item");
    return elemento;
}

function creaBottoneRimuovi(elementoLista)
{
    let button = document.createElement("button");
    let dentro = document.createTextNode("Rimuovi");
    button.appendChild(dentro);
    button.classList.add("btn", "btn-dark");
    button.style.cssFloat = "right";
    button.type = "button";
    button.addEventListener("click", function ()
    {
        elementoLista.remove();
    });
    return button;
}

function testoNota()
{
    let nota = document.getElementById("nota");
    return nota.value.trim()
}
//<li class="list-group-item">An item <button type="button" class="btn btn-dark" style="float: right;">Rimuovi</button></li>