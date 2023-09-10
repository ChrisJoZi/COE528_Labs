/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab4;

/**
 *
 * @author chris
 */
public class FoodItem extends FoodComponent{
    
    private String food;
    private double price;
    
    public FoodItem(String food, double price){
        this.food = food;
        this.price = price;
        
    }
    
    @Override
    public double getPrice(){
        return price;
    }
    
    public String getFood(){
        return food;
    }
    
    @Override
    public void print(int sapce){
        
        for (int i=0; i<sapce; i++){
            System.out.print("\t");
        }
        
        
        System.out.print("FoodItem: " + getFood() + ", " + getPrice() + "\n");
    }
    
    
    
}
