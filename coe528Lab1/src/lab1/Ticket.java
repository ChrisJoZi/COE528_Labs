/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author chris
 */
public class Ticket {
   
    public Passenger passenger;
    public Flight flight;
    public double price;
    public static int ticketNum;
   
    public Ticket(Passenger p, Flight flight, double price){
        this.passenger = p;
        this.flight = flight;
        this.price = price;
       
    }
   

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTicketNum() {
        return ticketNum;
    }

    public static void setTicketNum(int ticketNum) {
        Ticket.ticketNum = ticketNum;
    }
   
    @Override
    public String toString(){
        return this.passenger.getName() + " " + this.flight + ", ticket price: $" + this.price;
    }
       

   
}