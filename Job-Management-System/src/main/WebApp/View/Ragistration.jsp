<!DOCTYPE html>
<html lang="en">
<head>
    <title>Job Managment Syatem - Ragistration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="Ragistration.css">
</head>
<body>
    <div class="login-section">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-header">
                            <img class="login-img" src="https://img.freepik.com/premium-vector/isometric-flat-3d-illustration-concept-man-filling-personal-data-form_18660-4868.jpg" alt="Login" height="70%" width="70%">
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="card-body">
                        <h1>Job Management System</h1>
                        <p>Ragistration</p>
                        <hr>
                        <form action="Login" method="post" id="Ragistrationfm">
                            <input type="text" class="btn-block" placeholder="Enter a Name" required><br>
                            <label for="date">DOB</label>
                            <input type="date" class="btn-block" required><br>
                            <input type="email" class="btn-block" placeholder="Enter Email" name="username" required><br>
                            <input type="password" class="btn-block password" placeholder="Enter password" name="password" required><br>
                            <input type="password" class="btn-block confarmpassword" placeholder="Enter confarm password" name="confarm password" required><br>
                            <button type="submit" class="btn btn-primary btn-block">Ragister</button>
                        </form><br>
                        <p class="text-center mt-3"> have an account? <a href="login"> Login </a></p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="Ragistration.js"></script>
</body>
</html>