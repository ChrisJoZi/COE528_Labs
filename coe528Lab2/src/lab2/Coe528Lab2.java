/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author chris
 */
public class Coe528Lab2 {
    

public static int reverseFactorial(int x) {
    int a=1;
    int b =1;
    boolean fac = false;

     if (x > 0){
        while (!fac){
        for (int i=1; i <= a; i++){
            b = b*i;
        }
        
        if (b>= x){
            return a;
        }
           a = a+1;
           b = 1;
           fac =false;
        }
     }
    return 1;
}

public static boolean isMatrixNice(int[][] arr){
    
    int [] row = new int[arr.length];
    int [] column = new int[arr[0].length];
    int diag1=0;
    int diag2=0;

    
    if (arr.length == arr[0].length){
        for(int i=0; i < arr.length;i++){
            for(int j=0; j < arr[i].length;j++){
                row[i] += arr[i][j];
                column[i] += arr[j][i];
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i) {
                        diag1 += arr[i][j];
                    }
                if ((i+j) == (arr.length-1)) {
                        diag2 += arr[i][j];
                    }
                }
        }
        
        
        
        int rowTotal=0;
        int columnTotal=0;
        boolean check;
        int k = 0;
        
        //temp used to compare current rows and column sums to previous row sum
        int temp = row[0];
            do{
            rowTotal = 0;
            columnTotal = 0;
            rowTotal = rowTotal + row[k];
            columnTotal = columnTotal + column[k];
            k++;
            if(rowTotal == columnTotal && temp == columnTotal && temp == rowTotal){
                check = true;
                temp = row[k-1];
            }
            else{
                check = false;
            }
                
                    
            }
            while(k < row.length && check == true);
            
        if (check == true && diag1 ==rowTotal && diag2 ==columnTotal){
            System.out.println("Sum: " +  diag1);
            return true;
        }
    }

    return false;
}

public static void main(String args[]){ 
    int y=reverseFactorial(720);
        System.out.println(y);
        int mat[][] = {{2, 7, 6},{9, 5, 1},{4, 3, 8}};
        System.out.println(isMatrixNice(mat));
}
}