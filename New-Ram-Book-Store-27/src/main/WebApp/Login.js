// script.js
document.getElementById('loginForm').addEventListener('submit', function(event) {
    var form = event.target;
    if (form.checkValidity() === false) {
        event.preventDefault();
        event.stopPropagation();
    }
    form.classList.add('was-validated');
}, false);
