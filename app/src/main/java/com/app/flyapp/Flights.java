package com.app.flyapp;


import java.text.DecimalFormat;

public class Flights {
    public  String departureStation, arrivalStation, flightCarrier, flightNumber, price;

    public Flights(String departureStation, String arrivalStation, String flightCarrier, String flightNumber, String price) {
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.flightCarrier = flightCarrier;
        this.flightNumber = flightNumber;
        this.price = price;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getFlightCarrier() {
        return flightCarrier;
    }

    public void setFlightCarrier(String flightCarrier) {
        this.flightCarrier = flightCarrier;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getprice() {
        return price;
    }

    public void setprice(String price) {
        this.price = price;
    }
}
