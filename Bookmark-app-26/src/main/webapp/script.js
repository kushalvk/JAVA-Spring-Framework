function save() {
   let input = document.querySelector("#in").value;
   let output = document.querySelector("#out");
   output.innerHTML += `<a href="#"> ${input} </a><br>`;
}
function remove() {
   let output = document.querySelector("#out");
   output.innerHTML = "";
}