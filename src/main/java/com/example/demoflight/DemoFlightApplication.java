package com.example.demoflight;

import com.example.Airlines.Airbus;
import com.example.Airlines.Boieng;
import com.example.exceptionsPkg.SeatNotAvailableException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoFlightApplication {

    public static void main(String[] args) throws SeatNotAvailableException {

        Boieng B1 = new Boieng("A123",10, new int[]{1, 2, 0, 0, 0, 0, 0, 0, 0, 0});
        Airbus A1 = new Airbus("R45",15,new int[] {1,2,0,0,0,0,7,0,0,10,11,0,0,0,15});

        try{
            B1.bookFlight(15);
        }
        catch (SeatNotAvailableException e){
            System.out.println(e.getMessage());
        }
        try {
            A1.bookFlight(15);
        }
        catch (SeatNotAvailableException e){
            e.getMessage();
        }


        System.out.println();

        SpringApplication.run(DemoFlightApplication.class, args);
    }

}
