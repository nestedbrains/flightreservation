package com.sio.flightreservation.controller;

import com.sio.flightreservation.dto.ReservationRequest;
import com.sio.flightreservation.entities.Flight;
import com.sio.flightreservation.entities.Reservation;
import com.sio.flightreservation.repos.FlightRepository;
import com.sio.flightreservation.repos.ReservationRepository;
import com.sio.flightreservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class ReservationController {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    ReservationService reservationService;

    @RequestMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
        Flight flight = flightRepository.getOne(flightId);
        modelMap.addAttribute("flight", flight);
        return "reservation/completeReservation";
    }

    @RequestMapping("/completeReservation")
    public String completeReservation(ReservationRequest request, ModelMap modelMap) {
        Reservation reservation = reservationService.bookFlight(request);
        modelMap.addAttribute("msg", "Reservation created Successfully and id is " + reservation.getId());

        return "reservation/reservationConfirmation";
    }
}
