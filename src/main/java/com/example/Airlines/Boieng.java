package com.example.Airlines;

import com.example.AirlinePrototype.Airline;
import com.example.AirlinePrototype.FlightBooking;
import com.example.exceptionsPkg.SeatNotAvailableException;

public class Boieng extends Airline implements FlightBooking {


    public Boieng(String flightNo, int totalSeats, int[] bookedSeats) {
        super(flightNo, totalSeats, bookedSeats);
    }
    @Override
    public void bookFlight(int num) throws SeatNotAvailableException{
        super.bookFlight(num);
        System.out.println("thank you for travelling with "+getClass().getSimpleName()+"!!");
    }
    @Override
    public boolean checkSeat(int num){
        return super.checkSeat(num);
    }
}
