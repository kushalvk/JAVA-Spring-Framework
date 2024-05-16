let num = 1;
    function save() {
        let input = document.querySelector("#in").value;
        let output = document.querySelector("#out");
        output.innerHTML += `<tr> <td onclick="update()">${num}</td> <td><a href="${input}" target="_blank" id="link${num}"> ${input} </a></td> </tr>`;
        num++;
    }
    function remove() {
        let output = document.querySelector("#out");
        output.innerHTML = "";
    }
    let table = document.querySelector("#out");
    let rIndex;
    function update() {
        let input = document.querySelector("#in");
        for (let i = 0; i < table.rows.length; i++) {
            table.rows[i].onclick = function (){
                rIndex = this.rowIndex;
                let link = document.querySelector(`#link${rIndex}`);
                input.value = link.href;
            }
        }
    }
    function up() {
        let input = document.querySelector("#in");
        table.rows[rIndex].cells[1].innerHTML = `<a href="${input.value}" target="_blank">${input.value}</a>`;
    }