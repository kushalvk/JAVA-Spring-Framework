// script.js

var OrderItems = [];
document.querySelectorAll(".list-group-item").forEach((item) => {
    const bookNameElement = item.querySelector("h5");
    const priceElement = item.querySelector(".item-price");

    if (bookNameElement && priceElement) {
        const bookName = bookNameElement.textContent;
        const price = priceElement.textContent.replace("$", "");

        OrderItems.push({
            bookName: bookName,
            price: parseFloat(price),
        });
    }
});
console.log(OrderItems);
export { OrderItems };

document.addEventListener('DOMContentLoaded', function() {
    // Calculate and display the cart totals
    calculateCartTotals();

    // remove
    document.querySelectorAll('.remove-item').forEach(button => {
        button.addEventListener('click', function() {
            const item = button.closest('.list-group-item');
            item.remove();
            calculateCartTotals();
        });
    });
});

function calculateCartTotals() {
    // Select the price elements
    const priceElements = document.querySelectorAll('.item-price');
    
    // subtotal
    let subtotal = 0;
    priceElements.forEach(priceElement => {
        const price = parseFloat(priceElement.textContent.replace('$', ''));
        subtotal += price;
    });

    // tax and total
    const taxRate = 0.13;
    const tax = subtotal * taxRate;
    const total = subtotal + tax;

    document.getElementById('subtotal').textContent = `$${subtotal.toFixed(2)}`;
    document.getElementById('tax').textContent = `$${tax.toFixed(2)}`;
    document.getElementById('total').textContent = `$${total.toFixed(2)}`;
}
