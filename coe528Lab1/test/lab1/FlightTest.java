/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import lab1.Flight;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class FlightTest {
    @Test
    public void testConstructor() {
       
        int flightNum = 2;
        String origin = "Toronto";
        String destination = "Vancouver";
        String flightTime = "23/02/23 2:30 PM";
        int capacity = 200;
        int numOfSeatsLeft = capacity;
        int originalPrice = 300;
       
        Flight fly = new Flight(flightNum, origin, destination, flightTime, capacity,originalPrice);
        assertEquals(flightNum, fly.getFlightNumber());
        assertEquals(origin, fly.getOrigin());
        assertEquals(destination, fly.getDestination());
        assertEquals(flightTime, fly.getDepartureTime());
        assertEquals(capacity, fly.getCapacity());
        assertEquals(numOfSeatsLeft, fly.getNumberOfSeatsLeft());
        assertEquals(originalPrice, fly.getOriginalPrice(), 0);
    }
   
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
       
       
         int flightNum = 1;
         String origin = "Toronto";
         String destination = "Toronto";
         String flightTime = "23/02/23 2:30 PM";
         int capacity = 200;
         int originalPrice = 300;
           
           
        Flight fly = new Flight(flightNum, origin, destination, flightTime, capacity,originalPrice);      
       
    }
    
     
    
    
    Flight instance = new Flight (1131, "Toronto", "Calgary", "01/02/99 7:00 pm", 30, 901.41);
    
    
        
        
    
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 3;
        instance.setFlightNumber(flightNumber);
        assertEquals(flightNumber, instance.getFlightNumber());
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Athens";
        instance.setOrigin(origin);
        assertEquals(origin, instance.getOrigin());
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Calgary";
        instance.setDestination(destination);
        assertEquals(destination, instance.getDestination());
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "05/01/2000 10:00 am";
        instance.setDepartureTime(departureTime);
        assertEquals(departureTime, instance.getDepartureTime());
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 30;
        instance.setCapacity(capacity);
        assertEquals(capacity, instance.getCapacity());
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 15;
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        assertEquals(numberOfSeatsLeft, instance.getNumberOfSeatsLeft());
    }

    /**
     * Test of setOrigialPrice method, of class Flight.
     */
    @Test
    public void testSetOrigialPrice() {
        System.out.println("setOrigialPrice");
        double originalPrice = 499.99;
        instance.setOriginalPrice(originalPrice);
        assertEquals(originalPrice, instance.getOriginalPrice(), 0.0);
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        int expResult = 1131;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        String expResult = "Calgary";
        String result = instance.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        String expResult = "01/02/99 7:00 pm";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        int expResult = 30;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        int expResult = 30;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);

    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        double expResult = 901.41;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        boolean result = instance.bookASeat();
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Flight 1131, Toronto to Calgary, 01/02/99 7:00 pm, original price: $901.41";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}