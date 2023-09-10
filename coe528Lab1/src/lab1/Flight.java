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
public class Flight {
   
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice){
        if (origin.equals(destination) == true) {
            throw new IllegalArgumentException("The flight origin and desitination can't be the same");
        }
        else{
            this.flightNumber = flightNumber;
            this.origin = origin;
            this.destination = destination;
            this.departureTime = departureTime;
            this.capacity = capacity;
            this.originalPrice = originalPrice;
            this.numberOfSeatsLeft = capacity;
        }
           
    }
   
    public boolean bookASeat(){
        if (this.numberOfSeatsLeft > 0){
            this.numberOfSeatsLeft--;
            return true;            
        }
        else{
            System.out.println("Flight is full");
            return false;
        }
    }
   
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
   
   
    @Override
    public String toString(){
        return "Flight" + " " + this.getFlightNumber() + "," + " " + this.getOrigin() + " to " + this.getDestination() + "," + " " + this.getDepartureTime() + ", original price: $" + this.getOriginalPrice();
    }
   
   
}