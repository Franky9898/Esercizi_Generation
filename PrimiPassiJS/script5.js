function logConsole() {
    let element = document.getElementById("target").value;
    console.log(element.charAt(element.length -1 ));
}

function logConsole(event) {
    console.log(event.key);
}
