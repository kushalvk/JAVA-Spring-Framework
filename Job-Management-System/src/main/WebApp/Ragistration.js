
document.getElementById('Ragistrationfm').addEventListener('submit', function (matchpsw) {
    let password = document.querySelector('.password').value;
    let confarmpassword = document.querySelector('.confarmpassword').value;

    if (password !== confarmpassword) {
        matchpsw.preventDefault();
        matchpsw.stopPropagation(); // to stop redirect to the login page
        alert("password dose not match");
    } else {
        alert("You are Ragistered...! login with your Email and password");
    }


})