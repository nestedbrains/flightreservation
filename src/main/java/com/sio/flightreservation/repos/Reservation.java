package com.sio.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Reservation extends JpaRepository<Reservation, Long> {
}
