/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab4;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class FoodCategory extends FoodComponent{
    
    private String food;
    
    private ArrayList<FoodComponent> component;
    
    public FoodCategory (String food){
        this.food = food;
        component = new ArrayList <FoodComponent>();
    }
    
    @Override
    public double getPrice(){
        
        double sum = 0;
        
        for (FoodComponent c: component){
            sum += c.getPrice();
        }
        return sum;
    }
    
    public String getFood(){
        return food;
    }
    
    public void add(FoodComponent c){
        component.add(c);
    }
   
    public void remove(FoodComponent c){
        component.remove(c);
    }
    
    @Override
    public void print (int space){
        for (int i=0; i<space; i++){
            System.out.print("\t");
        }
        
        System.out.print("FoodCategory: (" + getFood() + ", " + getPrice() + ") contains:\n");
        
        for (int j=0; j<component.size(); j++){
            component.get(j).print(space+1);
        }
    }
    
    
    
    
    
    
}
