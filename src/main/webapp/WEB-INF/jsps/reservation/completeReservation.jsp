<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Complete Reservation</title>
</head>

<body>
<div class="container">
    <h2>Complete Reservation</h2>
    <div class="row">
        Airline : ${flight.operatingAirlines}<br>
        departureCity : ${flight.departureCity}<br>
        arrivalCity : ${flight.arrivalCity}
    </div>
    <form action="completeReservation" method="post">
        <h2>Passenger Details : </h2>
        <div class="form-group">
            <label for="passengerFirstName">passengerFirstName</label>
            <input type="text" name="passengerFirstName" class="form-control" id="passengerFirstName"
                   placeholder="Enter passengerFirstName">
        </div>

        <div class="form-group">
            <label for="passengerLastName">passengerLastName</label>
            <input type="text" name="passengerLastName" class="form-control" id="passengerLastName"
                   placeholder="Enter passengerLastName">
        </div>

        <div class="form-group">
            <label for="passengerEmail">passengerEmail</label>
            <input type="text" name="passengerEmail" class="form-control" id="passengerEmail"
                   placeholder="Enter passengerEmail">
        </div>

        <div class="form-group">
            <label for="passengerPhoneNo">passengerPhoneNo</label>
            <input type="text" name="passengerPhoneNo" class="form-control" id="passengerPhoneNo"
                   placeholder="Enter passengerPhoneNo">
        </div>
        <br>
        <br>
        <h2>Card Details</h2>

        <div class="form-group">
            <label for="nameOnCard">Name on Card</label>
            <input type="text" name="nameOnCard" class="form-control" id="nameOnCard" placeholder="Enter nameOnCard">
        </div>

        <div class="form-group">
            <label for="cardNumber">cardNumber</label>
            <input type="text" name="cardNumber" class="form-control" id="cardNumber" placeholder="Enter cardNumber">
        </div>

        <div class="form-group">
            <label for="expirationDate">expirationDate</label>
            <input type="text" name="expirationDate" class="form-control" id="expirationDate"
                   placeholder="Enter expirationDate">
        </div>

        <div class="form-group">
            <label for="securityCode">CVV</label>
            <input type="text" name="securityCode" class="form-control" id="securityCode"
                   placeholder="Enter securityCode">
        </div>

        <input type="hidden" name="flightId" value="${flight.id}">

        <button type="submit" class="btn btn-primary">Confirm</button>
    </form>
</div>
</body>
</html>