function Libro(titolo, autore, anno) {
    this.titolo = titolo;
    this.autore = autore;
    this.anno = anno;
}
 const libro1 = new Libro ("Ciao" , "FR", 2000);

 function ciclo(libro) {
    let testo = "";
    for (let x in libro) {
        testo += libro[x] + " ";
    }
    return testo;
 }

 function logConsole(libro) {
    console.log(ciclo(libro));
 }

 document.getElementById("titolo").innerHTML = libro1.titolo;

 document.getElementById("prova").innerHTML = logConsole(libro1);