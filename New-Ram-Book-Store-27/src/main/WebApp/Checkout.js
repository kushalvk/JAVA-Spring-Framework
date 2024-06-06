// script.js

import { OrderItems } from './Cart.js';
console.log(OrderItems);

document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('checkout-form').addEventListener('submit', async function (e) {
        e.preventDefault();

        const order = {
            fullName: document.getElementById('name').value,
            address: document.getElementById('address').value,
            city: document.getElementById('city').value,
            state: document.getElementById('state').value,
            zip: document.getElementById('zip').value,
            cardName: document.getElementById('card-name').value,
            cardNumber: document.getElementById('card-number').value,
            expiryDate: document.getElementById('expiry-date').value,
            cvv: document.getElementById('cvv').value,
            orderItems: OrderItems
        };

        try {
            const response = fetch('/purchace', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(order)
            });

            if (response.ok) {
                const result = response.json();
                localStorage.removeItem('Cart');
                alert('Order placed successfully!');
                // Redirect or clear form as needed
            } else {
                alert('Failed to place order');
            }
        } catch (error) {
            console.error('Error:', error);
            alert('An error occurred while placing the order');
        }
    });
});
