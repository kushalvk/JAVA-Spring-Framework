<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Job Managment Syatem - Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="Login.css">
</head>

<body>
    <div class="login-section">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-header">
                            <img class="login-img" src="https://it.cornell.edu/sites/default/files/styles/article_banner/public/itc-drupal10-images/secureconnect.png?h=76c528b5&itok=cQtPhBZV" alt="Login" height="70%" width="70%">
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="card-body">
                        <c:if test="${not empty param.error}">
                            <div class="alert alert-danger" role="alert">
                                Invalid username or password.
                            </div>
                        </c:if>
                        <h1>Job Management System</h1>
                        <p>Login to your account</p>
                        <hr>
                        <form action="${pageContext.request.contextPath}/login" method="post" id="loginFrom">
                            <input type="email" class="btn-block" placeholder="Enter Email" name="username" required><br>
                            <input type="password" class="btn-block" placeholder="Enter password" name="password" required><br>
                            <button type="submit" class="btn btn-primary btn-block">Login</button>
                        </form><br>
                        <p class="text-center mt-3">Don't have an account? <a href="ragister">Sign up</a></p>
                        <h6>Or login with:</h6>
                        <a href="/oauth2/authorization/google" class="btn btn-warning ">Google</a>
                        <a href="/oauth2/authorization/github" class="btn btn-warning ">Github</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="Login.js"></script>
</body>
</html>