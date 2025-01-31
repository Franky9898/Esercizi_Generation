function Libro(titolo, autore, anno) {
    this.titolo = titolo;
    this.autore = autore;
    this.anno = anno;
    this.stampa = function() {
        console.log(ciclo(this));
     };
}
 const libro1 = new Libro ("Ciao" , "FR", 2000);

 function ciclo(libro) {
    let testo = "";
    for (let x in libro) {
        if(x =="stampa")
            continue;
        testo += libro[x] + " ";
    }
    return testo;
 }

 document.getElementById("prova").innerHTML = libro1.stampa();