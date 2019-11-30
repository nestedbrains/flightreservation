package com.sio.flightreservation.controller;

import com.sio.flightreservation.dto.ReservationRequest;
import com.sio.flightreservation.entities.Flight;
import com.sio.flightreservation.repos.FlightRepository;
import com.sio.flightreservation.repos.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {

    private final FlightRepository flightRepository;

    public ReservationController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @RequestMapping("/showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
        Flight flight = flightRepository.getOne(flightId);
        modelMap.addAttribute("flight", flight);
        return "reservation/completeReservation";
    }

    @RequestMapping("/completeReservation")
    public String completeReservation(ReservationRequest request){
        return null;
    }
}
