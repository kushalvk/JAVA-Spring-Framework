<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ram Book Store</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="Home.css" rel="stylesheet">
    <link rel="website icon" type="text/css" href="https://images.unsplash.com/photo-1589998059171-988d887df646?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8N3x8fGVufDB8fHx8fA%3D%3D">
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
                <li class="nav-item active">
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

    <!-- Hero Section -->
    <div class="hero-section text-center">
        <div class="container">
            <h1>Welcome to Ram Book Store</h1>
            <p>Your one-stop shop for all kinds of books</p>
            <a href="#shop" class="btn btn-primary">Shop Now</a><br>
        </div>
    </div>

    <!-- Book Listing Section -->
    <div class="container my-5">
        <h2 class="text-center" id="shop">Featured Books</h2><br>
        <div class="row">
            <div class="col-md-4">
                <div class="card mb-4 shadow-sm">
                    <img src="https://thumbs.dreamstime.com/b/open-book-hardback-books-wooden-table-education-background-back-to-school-copy-space-text-76106466.jpg" class="card-img-top" alt="Book 1">
                    <div class="card-body">
                        <h5 class="card-title">Pysical Book</h5>
                        <p class="card-text">Books are important for the mind, heart, and soul.These quotes about reading speak for themselves.</p>
                        <div class="d-flex justify-content-between align-items-center">
                            <!-- <button type="button" >View</button> -->
                            <a href="Books" class="btn btn-sm btn-outline-secondary">View</a>
                            <small class="text-muted">Starta at $20</small>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card mb-4 shadow-sm">
                    <img src="https://images.pexels.com/photos/1329571/pexels-photo-1329571.jpeg" class="card-img-top" alt="Book 2">
                    <div class="card-body">
                        <h5 class="card-title">Electronic Book</h5>
                        <p class="card-text">electrical books provide up-to-date information and advancements use in their knowledge.</p>
                        <div class="d-flex justify-content-between align-items-center">
                            <a href="Ebooks" class="btn btn-sm btn-outline-secondary">View</a>
                            <small class="text-muted">Starta at $15</small>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card mb-4 shadow-sm">
                    <img src="https://t3.ftcdn.net/jpg/05/12/53/56/360_F_512535645_Kkxz852oNK0uHxHpJoNMc9PZ7AmQorKm.jpg" class="card-img-top" alt="Book 3">
                    <div class="card-body">
                        <h5 class="card-title">Audio Book</h5>
                        <p class="card-text">Audiobooks Help You With Time Management.Audiobooks Build Fluency.Audiobooks Improve Your Focus.</p>
                        <div class="d-flex justify-content-between align-items-center">
                            <a href="Abooks" class="btn btn-sm btn-outline-secondary">View</a>
                            <small class="text-muted">Starta at $10</small>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="Home.js"></script>
</body>
</html>
