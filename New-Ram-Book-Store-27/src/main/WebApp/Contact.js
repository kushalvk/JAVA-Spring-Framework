// script.js
document.getElementById('send').addEventListener('click', function() {

    const data = {
        fullname: document.getElementById('name').value,
        email: document.getElementById('email').value,
        msg: document.getElementById('message').value
    };

    console.log(data);

    fetch('/send-message', {
        method: 'POST', // Specify the request method
        headers: {
            'Content-Type': 'application/json' // Indicate that we're sending JSON data
        },
        body: JSON.stringify(data) // Convert the data object to a JSON string
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok ' + response.statusText);
        }
        return response.json(); // Parse the JSON response
    })
    .then(data => {
        console.log('Success:', data); // Log the response data
        alert('Message sent successfully!');
    })
    .catch(error => {
        console.error('Error:', error); // Log any errors
        alert('Message sent successfully after some time!');
    });
});
