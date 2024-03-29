package com.sio.flightreservation.controller;

import com.sio.flightreservation.entities.Flight;
import com.sio.flightreservation.repos.FlightRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class FlightController {

    private final  FlightRepository flightRepository;

    public FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @RequestMapping("findFlights")
    public String findFlights
            (
                    @RequestParam("from") String from,
                    @RequestParam("to") String to,
                    @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,
                    ModelMap modelMap
            ) {
        List<Flight> flights = flightRepository.findFlights(from, to);
        modelMap.addAttribute("flights" ,flights);
        return "login/displayFlights";
    }

    @RequestMapping("/admin/showAddFlight")
    public String showAddFlight(){
        return  "login/admin/addFlight";
    }


}
