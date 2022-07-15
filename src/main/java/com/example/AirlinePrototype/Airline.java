package com.example.AirlinePrototype;

import com.example.exceptionsPkg.SeatNotAvailableException;

import java.util.ArrayList;
public abstract class Airline implements FlightBooking {

    public String flightNo;
    public int totalSeats;
    public int[] bookedSeats;
    public ArrayList<Integer> availableSeats = new ArrayList<Integer>();

    public Airline(String flightNo, int totalSeats, int[] bookedSeats){
        this.flightNo = flightNo;
        this.totalSeats = totalSeats;
        this.bookedSeats = bookedSeats;

        for(int seat:this.bookedSeats){
            if(seat != 0){
                this.availableSeats.add(seat);
            }
        }
    }


    @Override
    public void bookFlight(int num) throws SeatNotAvailableException {
       try{
           if(checkSeat(num)){
               this.availableSeats.remove(this.availableSeats.indexOf(num));
               this.bookedSeats[num-1] = 0;
               System.out.println("The seat number "+num+" has been booked");
           }
           else{
               throw new SeatNotAvailableException("This seat is unavailable!!");
           }
       }catch(SeatNotAvailableException e){
           e.getMessage();
           throw new SeatNotAvailableException("This seat is unavailable!!");
       }
    }

    @Override
    public boolean checkSeat(int num){
        for(int seat:this.availableSeats){
            if(seat == num){
                return true;
            }
        }
        return false;
    }
}
