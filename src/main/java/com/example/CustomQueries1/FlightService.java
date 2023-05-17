package com.example.CustomQueries1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	FlightRepository flightRepository;
	public String getRandomString(int n){
		StringBuilder str = new StringBuilder();
		//a=64 z=100
		for (int i = 0; i <=n; i++){
			String c = String.valueOf((char)((Math.random() * (122 - 97)) + 97));
			str.append(c);
		}
		return str.toString().toUpperCase();
	}
	public void initializeRepo(){
		for (int i=0; i<49; i++){
			Flight flight = new Flight();
			flight.setDescription(getRandomString(6));
			flight.setFromAirport(getRandomString(2));
			flight.setToAirport(getRandomString(2));
			flight.setFlightStatus(Status.ONTIME);
			flightRepository.save(flight);
		}
	}
	
}
