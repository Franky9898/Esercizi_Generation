let click = parseInt(document.getElementById("target").innerHTML) + 1;
function incrementa() {
    document.getElementById("target").innerHTML = click;
    click++;
}