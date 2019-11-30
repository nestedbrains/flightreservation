<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register User</title>
</head>

<body>
<div class="container">
    <h2>User Registration</h2>
    <form action="registerUser" method="post">
        <div class="form-group">
            <label for="firstName">First Name</label>
            <input type="text" name="firstName" class="form-control" id="firstName" placeholder="Enter First Name">
        </div>

        <div class="form-group">
            <label for="lastName">Last Name</label>
            <input type="text" name="lastName" class="form-control" id="lastName" placeholder="Enter Last Name">
        </div>

        <div class="form-group">
            <label for="email">email</label>
            <input type="email" name="email" class="form-control" id="email" placeholder="Enter User Email">
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="Password">
        </div>

        <div class="form-group">
            <label for="confirmPassword">Confirm Password</label>
            <input type="password" class="form-control" id="confirmPassword" placeholder="Confirm Password">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>