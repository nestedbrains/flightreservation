package com.sio.flightreservation.services;

import com.sio.flightreservation.dto.ReservationRequest;
import com.sio.flightreservation.entities.Reservation;

public interface ReservationService {

    public Reservation bookFlight(ReservationRequest reservationRequest);
}
