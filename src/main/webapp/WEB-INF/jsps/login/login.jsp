<!doctype html>
<html lang="en">
<head>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>User Login</title>
</head>
<body>
<div class="container">
    <h2>User Login</h2>
    <form action="login" method="post">
        <div class="form-group">
            <label for="email">email</label>
            <input type="text" name="email" class="form-control" id="email" placeholder="Enter User Email">
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="Password">
        </div>

        <button type="submit" class="btn btn-primary">Login</button>
    </form>
    <h2>${msg}</h2>
</div>
</body>
</html>