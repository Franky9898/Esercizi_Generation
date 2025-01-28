function cambiaColore(TextColor, backgroundColor) {
    document.getElementById("colore").style.color = TextColor;
    document.getElementById("colore").style.backgroundColor = backgroundColor;
}
function nascondi() {
    if (document.getElementById("colore").style.display != "none") {
        document.getElementById("colore").style.display = "none";
    } else {
        document.getElementById("colore").style.display = "block"
    }
} 
