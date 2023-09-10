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
public abstract class Passenger {
   
    protected String name;
    protected int age;
   
    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
   
   
   
    protected double applyDiscount(double p){
       
        return 0;
    }
   
   
}