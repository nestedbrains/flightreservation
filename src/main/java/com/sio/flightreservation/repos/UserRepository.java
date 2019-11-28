package com.sio.flightreservation.repos;

import com.sio.flightreservation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
