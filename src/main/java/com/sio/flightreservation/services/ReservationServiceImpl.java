package com.sio.flightreservation.services;

import com.sio.flightreservation.dto.ReservationRequest;
import com.sio.flightreservation.entities.Flight;
import com.sio.flightreservation.entities.Passenger;
import com.sio.flightreservation.entities.Reservation;
import com.sio.flightreservation.repos.FlightRepository;
import com.sio.flightreservation.repos.PassengerRepository;
import com.sio.flightreservation.repos.ReservationRepository;
import com.sio.flightreservation.utils.EmailUtil;
import com.sio.flightreservation.utils.PDFGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    PDFGenerator pdfGenerator;

    @Autowired
    EmailUtil emailUtil;

    @Override
    public Reservation bookFlight(ReservationRequest reservationRequest) {

        // Make Payment

        Long flightId = reservationRequest.getFlightId();
        Flight flight = flightRepository.getOne(flightId);

        Passenger passenger = new Passenger();
        passenger.setFirstName((reservationRequest.getPassengerFirstName()));
        passenger.setLastName((reservationRequest.getPassengerLastName()));
        passenger.setEmail((reservationRequest.getPassengerEmail()));
        passenger.setPhone((reservationRequest.getPassengerPhoneNo()));
        Passenger savedPassenger = passengerRepository.save(passenger);


        Reservation reservation = new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(savedPassenger);
        reservation.setCheckedIn(false);

        Reservation savedReservation = reservationRepository.save(reservation);

        String filePath = "D://reservation" + savedReservation + savedReservation.getId() + ".pdf";
        pdfGenerator.generateItinerary(savedReservation, filePath);

        emailUtil.sendItinerary(passenger.getEmail(), filePath);
        return savedReservation;
    }
}
