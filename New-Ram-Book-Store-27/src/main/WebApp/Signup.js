// script.js
document.getElementById('signupForm').addEventListener('submit', function(event) {
    var form = event.target;
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var confirmPassword = document.getElementById('confirmPassword').value;

    if (password !== confirmPassword) {
        event.preventDefault();
        event.stopPropagation();
        document.getElementById('confirmPassword').setCustomValidity("Passwords do not match");
    } else {
        document.getElementById('confirmPassword').setCustomValidity("");
    }

    if (form.checkValidity() === false) {
        event.preventDefault();
        event.stopPropagation();
    }

    form.classList.add('was-validated');
    alert(`Sign Up Successful!\nName: ${name}\nEmail: ${email}\nUsername: ${username}`);
}, false);
