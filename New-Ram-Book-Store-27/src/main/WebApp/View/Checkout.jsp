<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ram Book Store - Checkout</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="Checkout.css" rel="stylesheet">
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
            <h1 class="display-4">Checkout</h1>
            <p class="lead">Complete your purchase by providing your shipping and payment details.</p>
        </div>
    </header>

    <!-- Checkout Section -->
    <div class="checkout-section py-5">
        <div class="container">
            <form id="checkout-form">
                <div class="row">
                    <div class="col-md-6">
                        <h4 class="mb-4">Shipping Information</h4>
                        <div class="form-group">
                            <label for="name">Full Name</label>
                            <input type="text" class="form-control" id="name" name="name" required>
                        </div>
                        <div class="form-group">
                            <label for="address">Address</label>
                            <input type="text" class="form-control" id="address" name="address" required>
                        </div>
                        <div class="form-group">
                            <label for="city">City</label>
                            <input type="text" class="form-control" id="city" name="city" required>
                        </div>
                        <div class="form-group">
                            <label for="state">State</label>
                            <input type="text" class="form-control" id="state" name="state" required>
                        </div>
                        <div class="form-group">
                            <label for="zip">Zip Code</label>
                            <input type="text" class="form-control" id="zip" name="zip" required>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <h4 class="mb-4">Payment Information</h4>
                        <div class="form-group">
                            <label for="card-name">Name on Card</label>
                            <input type="text" class="form-control" id="card-name" name="card-name" required>
                        </div>
                        <div class="form-group">
                            <label for="card-number">Card Number</label>
                            <input type="text" class="form-control" id="card-number" name="card-number" required>
                        </div>
                        <div class="form-group">
                            <label for="expiry-date">Expiry Date</label>
                            <input type="text" class="form-control" id="expiry-date" name="expiry-date" required>
                        </div>
                        <div class="form-group">
                            <label for="cvv">CVV</label>
                            <input type="text" class="form-control" id="cvv" name="cvv" required>
                        </div>
                    </div>
                </div>
                <div class="text-right mt-4">
                    <button type="submit" class="btn btn-primary">Complete Purchase</button>
                </div>
            </form>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script type="module" src="Cart.js"></script>
    <script type="module" src="Checkout.js"></script>
</body>
</html>
