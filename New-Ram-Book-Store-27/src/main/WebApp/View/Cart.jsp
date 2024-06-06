<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ram Book Store - My Books (Cart)</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="Cart.css" rel="stylesheet">
</head>
<body>

    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Ram Book Store</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="Home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Books">Books</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Ebooks">E-Books</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Abooks">Audio Books</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="Cart">My Cart</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="About">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Contact">Contact</a>
                </li>
            </ul>
        </div>
    </nav>

    <!-- Header Section -->
    <header class="header-section text-center">
        <div class="container">
            <h1 class="display-4">My Cart</h1>
            <p class="lead">Review and manage the books you wish to purchase.</p>
        </div>
    </header>

    <!-- Cart Section -->
    <div class="cart-section py-5">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <h4 class="mb-4">My Cart</h4>
                    <c:forEach var="item" items="${Cart}">
                    <ul class="list-group mb-4">
                        <li class="list-group-item d-flex justify-content-between align-items-center">
                            <div>
                                <h5>${item.book.bookname}</h5>
                            </div>
                            <div class="text-right">
                                <span class="text-muted item-price">$${item.book.price}</span>
                                <a href="removeFromCart/${item.id}" class="btn btn-sm btn-danger ml-2 remove-item">Remove</a>
                            </div>
                        </li>
                    </ul>
                    </c:forEach>
                    <div class="text-right">
                        <a href="Checkout" class="btn btn-primary">Proceed to Checkout</a>
                    </div>
                </div>
                <div class="col-md-4">
                    <h4 class="mb-4">Order Summary</h4>
                    <ul class="list-group">
                        <li class="list-group-item d-flex justify-content-between align-items-center">
                            <span>Subtotal</span>
                            <strong id="subtotal">$0.00</strong>
                        </li>
                        <li class="list-group-item d-flex justify-content-between align-items-center">
                            <span>Tax</span>
                            <strong id="tax">$0.00</strong>
                        </li>
                        <li class="list-group-item d-flex justify-content-between align-items-center">
                            <span>Total</span>
                            <strong id="total">$0.00</strong>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script type="module" src="Cart.js"></script>
    <script type="module" src="Checkout.js"></script>
</body>
</html>
