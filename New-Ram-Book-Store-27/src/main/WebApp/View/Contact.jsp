<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ram Book Store - Contact Us</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="Contact.css" rel="stylesheet">
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
                <li class="nav-item">
                    <a class="nav-link" href="Cart">My Cart</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="About">About</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="Contact">Contact</a>
                </li>
            </ul>
        </div>
    </nav>

    <!-- Contact Section -->
    <div class="contact-section">
        <div class="container">
            <h1 class="text-center">Contact Us</h1>
            <p class="text-center">We'd love to hear from you! Please fill out the form below to get in touch.</p>
            <div class="row justify-content-center">
                <div class="col-md-8">
                    <div class="card shadow-lg">
                        <div class="card-body">
                            <form id="contactForm">
                                <div class="form-group">
                                    <label for="name">Full Name</label>
                                    <input type="text" class="form-control" id="name" name="fullname" placeholder="Enter your full name" required>
                                    <div class="invalid-feedback">Please enter your full name.</div>
                                </div>
                                <div class="form-group">
                                    <label for="email">Email address</label>
                                    <input type="email" class="form-control" id="email" name="email" placeholder="Enter email" required>
                                    <div class="invalid-feedback">Please enter a valid email address.</div>
                                </div>
                                <div class="form-group">
                                    <label for="message">Message</label>
                                    <textarea class="form-control" id="message" rows="5" name="msg" placeholder="Enter your message" required></textarea>
                                    <div class="invalid-feedback">Please enter your message.</div>
                                </div>
                                <a href="send-message" id="send" class="btn btn-primary btn-block">Send Message</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row mt-5">
                <div class="col-md-4 text-center">
                    <h4>Our Address</h4>
                    <p>123 Book St, Reading City, 45678</p>
                </div>
                <div class="col-md-4 text-center">
                    <h4>Email Us</h4>
                    <p>info@rambookstore.com</p>
                </div>
                <div class="col-md-4 text-center">
                    <h4>Call Us</h4>
                    <p>+91 234 567 8901</p>
                </div>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="Contact.js"></script>
</body>
</html>
