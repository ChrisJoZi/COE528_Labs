/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 *
 * @author chris
 */
public class Manager {
   
   private ArrayList<Flight> flights = new ArrayList<Flight>();
   private static Manager instance = null;
   
    private static Manager getInstance(){
        if(instance == null){
            instance = new Manager();
        }
        return instance;
    }
    
    private void createFlights(){
       
        int flightNum, cap, original;
        String origin, destination, departureTime;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Please enter the place of origin: ");
        origin = input.nextLine();
       
        System.out.println("Please enter the flight destination: ");
        destination = input.nextLine();
       
        System.out.println("Please enter the departure time: ");
        departureTime = input.nextLine();
       
        System.out.println("Please enter the flight number: ");
        flightNum = input.nextInt();
       
        System.out.println("Please enter flight capacity: ");
        cap = input.nextInt();
       
        System.out.println("Please enter the original price: ");
        original = input.nextInt();
       
        Flight f = new Flight(flightNum, origin, destination, departureTime, cap, original);
       
        this.flights.add(f);
       
    }
   
   
    public void displayAvailableFlights(String origin, String destination){
       
        for(Flight i : flights){
            if(origin.equals(i.getOrigin()) && destination.equals(i.getDestination()) && i.getNumberOfSeatsLeft()>0){
                System.out.println(i);
            }
        }
       
    }
   
   
    public Flight getFlight(int flightNumber){
           
        for(Flight j : flights){
            if(flightNumber == j.getFlightNumber() && j.getNumberOfSeatsLeft()>0){
                return j;
            }   
            }
               
        System.out.println("The flight is either full or does not exsist: ");
        return null;
    }
   
   
    public void bookSeat(int flightNumber, Passenger p){
       Flight f;
       double discountedPrice;
       f = this.getFlight(flightNumber);
       
       discountedPrice = p.applyDiscount(f.getOriginalPrice());
       f.bookASeat();
       Ticket ticket = new Ticket (p, f, discountedPrice);
       System.out.println(ticket);
       
    }
   
   
    
    
    
    
    
    public static void main(String[] args){
       
        Scanner in = new Scanner(System.in);
        Scanner ins = new Scanner(System.in);
        Manager manage = Manager.getInstance();
        String inp;
        Flight f1 = new Flight(1111, "Toronto", "Vancouver", "28/01/23 12:30 pm", 100, 300 );
        manage.flights.add(f1);
        Flight f2 = new Flight(1112, "Toronto", "Calgary", "29/01/23 2:30 pm", 10, 250 );
        manage.flights.add(f2);
        Flight f3 = new Flight(1113, "Toronto", "Chicago", "01/02/23 8:00 pm", 150, 400 );
        manage.flights.add(f3);
        Flight f4 = new Flight(1114, "Toronto", "Los Angeles", "01/02/23 8:00 pm", 1, 900 );
        manage.flights.add(f4);
   
        System.out.println("Welcome back Manager!\n");
        
        do{
            System.out.println("\nType the number corresponding to your intentions");
            System.out.println("0   Display available flights");
            System.out.println("1   Add a flight");
            System.out.println("2   Book a flight\n");
            inp = in.next();
            
            
            
            if(inp.equals("0")){
                String origin, destination;
                System.out.println("Enter the place of origin:");
                origin = ins.nextLine();
                System.out.print("Enter the destination:\n");
                destination = ins.nextLine();
                manage.displayAvailableFlights(origin, destination);
                System.out.println("\n");
            }
            
            
            
            
            if(inp.equals("1")){
                manage.createFlights();
                System.out.println("Flight Created!\n");
            }
            
            
            
            
            if(inp.equals("2")){
                
                int chosenFlight;
                String name;
                int age;
                Flight k;
                do{
                System.out.println("Enter your flight number");
                chosenFlight  = in.nextInt();
                k = manage.getFlight(chosenFlight);
                
                }while(k == null);
                
                System.out.println("Enter your age");
                age = in.nextInt();
                        
                System.out.print("Enter your name:");
                name = ins.nextLine();
                
                
                do{
                    
                    
                    System.out.println("Are you a member? Type yes or no.");
                    inp = ins.nextLine();
                    
                    
                    if(inp.equals("yes")){
                        
                        System.out.println("How many years have you been a member?");
                        int yearsOfMembership = in.nextInt();
                        Member person = new Member(name, age, yearsOfMembership);
                        manage.bookSeat(chosenFlight, person);
                        inp = "exit";
                    } 
                    else if(inp.equals("no")){
                        NonMember person = new NonMember(name, age);
                        manage.bookSeat(chosenFlight, person);
                        inp = "exit";
                    }
                
                }
                while(!inp.equals("exit"));
                    
                
             
            }
            
            
            
            
        }
        while(!inp.equals("end"));
        System.out.println("System shutdown");
        
    }
   
}