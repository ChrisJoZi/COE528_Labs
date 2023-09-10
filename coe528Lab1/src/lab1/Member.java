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
public class Member extends Passenger{
   
    private int yearsOfMembership;
   
    public Member(String name, int age, int yearsOfMembership){
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
        
    }
   
    @Override
    protected double applyDiscount (double p){
        if (this.yearsOfMembership >= 5){
            p = p * 0.5;
        }
        else if (this.yearsOfMembership <5 && this.yearsOfMembership >1){
            p = p * 0.9;
        }
        else{}
   
        return p;
    }
   
}