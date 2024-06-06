<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ram Book Store - Login</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="Login.css" rel="stylesheet">
</head>
<body>

    <!-- Login Form Section -->
    <div class="login-section">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="card shadow-lg">
                        <div class="card-header text-center">
                            <h2>Ram Book Store</h2>
                            <p>Login to your account</p>
                        </div>
                        <div class="card-body">
                            <c:if test="${not empty param.error}">
                                <div class="alert alert-danger" role="alert">
                                    Invalid username or password.
                                </div>
                            </c:if>
                            <form action="${pageContext.request.contextPath}/login" id="loginForm" method="post">
                                <div class="form-group">
                                    <input type="username" class="form-control" id="username" placeholder="Enter username" name="username" required>
                                    <div class="invalid-feedback">Please enter a valid username.</div>
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" id="password" placeholder="Password" name="password" required>
                                    <div class="invalid-feedback">Please enter your password.</div>
                                </div>
                                <button type="submit" class="btn btn-primary btn-block">Login</button>
                            </form>
                            <p class="text-center mt-3">Don't have an account? <a href="Signup">Sign up</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="Login.js"></script>
</body>
</html>
