package com.example.CustomQueries1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightService flightService;
    @PostMapping
    public void initializeRepo(){
        flightService.initializeRepo();
    }
    @GetMapping
    public List<Flight> getFlights(){
        return flightService.flightRepository.findAll();
    }
}
