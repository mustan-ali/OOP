package com.company;

public class AirLine {
    private Flight[] flights;       //Creating Array of class Flights

    public AirLine() {
        this.flights = new Flight[15];      //Creating Object of class Flight
    }

    private void setFlight(Flight flight, int index) {      //(Flight flight, ) will call Copy Constructor
        this.flights[index] = flight;
    }

    public Flight getFlight(int index) {
        return this.flights[index];
    }

    public void insertFlights(Flight[] flights) {
        for (int i = 0; i < flights.length; i++) {
            setFlight(flights[i], i);
        }
    }

    public void assign(String flightNumber) {
        for (int i = 0; i < flights.length; i++) {
            if (this.flights[i] == null) {
                System.out.println("Flight is not available!");
                break;
            } else if (this.flights[i].getFlightNumber().equals(flightNumber) && this.flights[i].getNumberOfSeats() > 0) {
                this.flights[i].registration(this.flights[i]);
                this.flights[i].setNumberOfSeats(this.flights[i].getNumberOfSeats() - 1);
                System.out.println("Available Seats in Flight are : " + this.flights[i].getNumberOfSeats());
                break;
            }
        }
    }

}
