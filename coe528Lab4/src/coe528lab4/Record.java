/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab4;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author chris
 */
public class Record {
    // Name of the associated file
    private String filename;
    
    //One Instance Variable of Singleton Pattern
    private static Record instance = null;
  
    //Private Constructor for Singleton Pattern
    private Record(String n){
        
        filename = n;
        
    }
    
    //getInstance used as apart of the Singleton Pattern
    public static Record getInstance(){
        
        if(instance == null){
            instance = new Record("record.txt");
        }
        return instance;
    }
    
   
    // Effects: Reads and prints the contents of the associated
    // file to the standard output.
    public void read(){
        
        try {
            FileReader read = new FileReader(filename);
            Scanner input = new Scanner(read);

            while (input.hasNextLine()){
                System.out.println(input.nextLine());
            }
            read.close();
            
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    
    // Effects: Appends the specified message, msg, to the
    // associated file.
    public void write(String msg){
        
    try {
        FileWriter write = new FileWriter(filename, true);
        
        write.write(msg);
        write.close();
   
    } catch (IOException e){
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}
   public static void main(String[] args) {
    // Fill the blank below that obtains the sole instance
    // of the Record class.
    // (You should not invoke the Record constructor here.)
    Record r = getInstance();
    
    // Do not modify the code below
    r.write("Hello-1\n");
    r.write("Hello-2\n");
    System.out.println("Currently the file record.txt " +
    "contains the following lines:");
    r.read();
}
}

    

