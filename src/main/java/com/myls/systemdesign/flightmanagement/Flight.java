package com.myls.systemdesign.flightmanagement;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Flight {
	private final String flightNumber;
	private final String source;
	private final String destination;
	private final LocalDateTime departureTime;
	private final LocalDateTime arrivalTime;
	private final FlightStatus status;
	private final Aircraft aircraft;
	private final Map<String, Seat> seats;
	private final List<Seat> availableSeats;

	public Flight(String source, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime,
			Aircraft aircraft) {
		this.flightNumber = UUID.randomUUID().toString();
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.status = FlightStatus.ON_TIME;
		this.arrivalTime = arrivalTime;
		this.aircraft = aircraft;
		this.seats = new HashMap<>();
		this.availableSeats = new ArrayList<>();
	}

}
