package com.sio.flightreservation.repos;

import com.sio.flightreservation.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
