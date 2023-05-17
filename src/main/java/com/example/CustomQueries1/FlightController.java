package com.example.CustomQueries1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {
    @GetMapping
    public List<Flight> get50Flights(){

    }
}
