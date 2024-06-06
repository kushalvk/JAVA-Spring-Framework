<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ram Book Store - Sign Up</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="Signup.css" rel="stylesheet">
</head>
<body>

    <!-- Sign Up Form Section -->
    <div class="signup-section">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="card shadow-lg">
                        <div class="card-header text-center">
                            <h2>Ram Book Store</h2>
                            <p>Create your account</p>
                        </div>
                        <div class="card-body">
                            <form action="login" id="signupForm" method="post">
                                <div class="form-group">
                                    <input type="text" class="form-control" id="name" placeholder="Enter your full name" required>
                                    <div class="invalid-feedback">Please enter your full name.</div>
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control" id="email" placeholder="Enter email" required>
                                    <div class="invalid-feedback">Please enter a valid email address.</div>
                                </div>
                                <div class="form-group">
                                    <input type="username" class="form-control" id="username" placeholder="Generate username" name="username" required>
                                    <div class="invalid-feedback">Please enter your Username.</div>
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" id="password" placeholder="Generate Password" name="password" required>
                                    <div class="invalid-feedback">Please enter your password.</div>
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" id="confirmPassword" placeholder="Confirm Password" required>
                                    <div class="invalid-feedback">Passwords do not match.</div>
                                </div>
                                <button type="submit" class="btn btn-primary btn-block">Sign Up</button>
                            </form>
                            <p class="text-center mt-3">Already have an account? <a href="Login">Login</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="Signup.js"></script>
</body>
</html>
