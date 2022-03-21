package com.company;

public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private int numberOfSeats;

    public Flight(String flightNumber, String origin, String destination, int numberOfSeats) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.numberOfSeats = numberOfSeats;
    }

    public Flight(Flight source) {       // Copy Constructor
        this.flightNumber = source.flightNumber;
        this.origin = source.origin;
        this.destination = source.destination;
        this.numberOfSeats = source.numberOfSeats;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getDestination() {
        return this.destination;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(int seats) {
        this.numberOfSeats = seats;
    }

    public void registration(Flight flight) {
        System.out.println("You have successfully registered for flight! " + flight.getFlightNumber());
    }

    public String toString() {
        return "Flight Information: " + "\nFlight Number: " + getFlightNumber() + "\nOrigin: " + getOrigin() + "\nDestination: "
                + getDestination() + "\nNo. of Seats" + getNumberOfSeats();
    }

}
