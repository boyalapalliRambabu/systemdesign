package com.myls.systemdesign.flightmanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlightSearch {
	private final List<Flight> flights;

	public FlightSearch() {
		this.flights = new ArrayList<>();
	}

	public void addFlight(Flight flight) {
		flights.add(flight);
	}

	public List<Flight> searcFlights(String souce, String destination, LocalDate date) {

return flights.stream().filter(flight -> flight.get)		
	}

}
