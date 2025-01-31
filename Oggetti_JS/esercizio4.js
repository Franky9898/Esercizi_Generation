class Libro {
    constructor(titolo, autore, anno) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }
    stampa() {
        console.log(ciclo(this));
    };
}

function ciclo(libro) {
    let testo = "";
    for (let x in libro) {
        if (typeof libro[x] == "function")
            continue;
        testo += libro[x] + " ";
    }
    return testo;
}

const libro1 = new Libro("erer","re",300)

document.getElementById("prova").innerHTML = libro1.stampa();