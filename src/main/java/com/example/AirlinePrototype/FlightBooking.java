package com.example.AirlinePrototype;

import com.example.exceptionsPkg.SeatNotAvailableException;

public interface FlightBooking {
    void bookFlight(int num) throws SeatNotAvailableException;
    boolean checkSeat(int num);
}
