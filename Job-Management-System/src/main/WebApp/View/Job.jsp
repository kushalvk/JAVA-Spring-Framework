<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Job Managment Sysatem - Job</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="<c:url value='/Job.css'/>">
</head>
<body>
    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Job Managment Sysatem</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="home">Home</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="job">Jobs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="about">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contact">Contact</a>
                </li>
                <li class="nav-item">
                    <form action="/job/search" method="get">
                        <input type="text" name="search" placeholder="search by fiald">
                        <button type="submit" class="btn btn-primary">Search</button>
                    </form>
                </li>
            </ul>
        </div>
    </nav>

    <!-- Jobs -->
    <div class="row">
    <c:forEach var="job" items="${Job}">
        <div class="col-md-4">
            <div class="card mb-4 shadow-sm">
                <img src="https://upload.wikimedia.org/wikipedia/commons/1/12/User_icon_2.svg" class="card-img-top" alt="Book 1">
                <div class="card-body">
                    <h4 class="card-title">${job.name}</h4>
                    <p class="card-text">${job.fiald}</p>
                    <h5>Skill :-</h5>
                    <ul>Front-end<li> ${job.fend} </li></ul>
                    <ul>Back-end<li> ${job.bend} </li></ul>
                    <div class="d-flex justify-content-between align-items-center">
                        <a class="btn btn-sm btn-outline-secondary">Call</a>
                        <p>${job.num}</p>
                        <a class="btn btn-danger btn-sm">Delete</a>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
    </div>
</body>
</html>