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
public class NonMember extends Passenger {
   
    public NonMember(String name, int age){
        super(name, age);
    }
   
   
        @Override
    protected double applyDiscount (double p){
       
        if (age>=65){
            p = p * 0.9;
        }
        return p;
    }
   
   
}