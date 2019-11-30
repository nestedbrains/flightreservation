<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Flight User</title>
</head>

<body>
<div class="container">
    <h2>Flight found</h2>
    <form action="findFlights" method="post">

        <div class="form-group">
            <label for="from">From</label>
            <input type="text" name="from" class="form-control" id="from" placeholder="Enter from Date">
        </div>

        <div class="form-group">
            <label for="to">TO</label>
            <input type="text" name="to" class="form-control" id="to" placeholder="Enter To Date">
        </div>

        <div class="form-group">
            <label for="departureDate">Departure Date</label>
            <input type="text" name="departureDate" class="form-control" id="departureDate" placeholder="Enter Departure Date">
        </div>

        <button type="submit" class="btn btn-primary">Search</button>

    </form>
</div>
</body>
</html>