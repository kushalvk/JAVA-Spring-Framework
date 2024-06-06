<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="Cartport" content="width=device-width, initial-scale=1.0">
    <title>Ram Book Store - Physical Books</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="Books.css" rel="stylesheet">
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
                <li class="nav-item active">
                    <a class="nav-link" href="Books">Books</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Ebooks">E-Books</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Abooks">Audio Books</a>
                </li>
                <li class="nav-item">
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
            <h1 class="display-4">Physical Books</h1>
            <p class="lead">Explore our extensive collection of physical books.</p>
        </div>
    </header>

    <!-- Books Section -->
    <div class="books-section py-5">
        <div class="container">
            <div class="row">
            <c:forEach var="book" items="${Books}">
                <div class="col-md-4">
                    <div class="card mb-4 shadow-sm">
                        <img src="${book.image}" class="card-img-top" alt="Book 1">
                        <div class="card-body">
                            <h5 class="card-title">${book.bookname}</h5>
                            <p class="card-text">${book.description}</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <a href="add-to-cart/${book.bookname}" class="btn btn-sm btn-primary">Cart</a>
                                <span class="text-muted">$${book.price}</span>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="Books.js"></script>
</body>
</html>
