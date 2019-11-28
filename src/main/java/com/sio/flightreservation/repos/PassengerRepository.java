package com.sio.flightreservation.repos;

import com.sio.flightreservation.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
