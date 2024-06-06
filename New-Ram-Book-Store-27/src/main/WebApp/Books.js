// // Books.js

// document.addEventListener('DOMContentLoaded', function() {
//     const cartButtons = document.querySelectorAll('.btn-primary');

//     cartButtons.forEach(button => {
//         button.addEventListener('click', function() {
//             const card = button.closest('.card');
//             const title = card.querySelector('.card-title').textContent;
//             const price = parseFloat(card.querySelector('.text-muted').textContent.replace('$', ''));

//             const book = {
//                 title: title,
//                 price: price
//             };

//             fetch('/api/cart', {
//                 method: 'POST',
//                 headers: {
//                     'Content-Type': 'application/json'
//                 },
//                 body: JSON.stringify(book)
//             })
//             .then(response => response.json())
//             .then(data => {
//                 console.log('Success:', data);
//             })
//             .catch(error => {
//                 console.error('Error:', error);
//             });
//         });
//     });
// });
