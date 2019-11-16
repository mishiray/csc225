/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc_225;
import java.util.Scanner;
/**
 *
 * @author Mishael
 */

public class Matrix{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            int a,b,cola,rowa,colb,rowb,x,y;
        do{
        //Matrix A
         System.out.println("_______________________________________");
        System.out.println("Matrix A");
         System.out.println("_______________________________________");
        System.out.println("Enter number of rows");
            a = input.nextInt();
            rowa = a;
        System.out.println("Enter number of columns");
            b = input.nextInt();
            cola = b;
        int MatA[][] = new int[a][b];
        int MatC[][] = new int[10][10];
        System.out.println("This is your Matrix form");
            int d = 1;
            for(int i = 0; i < MatA.length; i++){
                for(int j = 0; j < MatA[0].length; j++){
                    System.out.print("\ta"+d);
                    d++;
                }
                System.out.println("");
            }
        System.out.println("Enter your matrix elements");
            for(int i = 0; i < MatA.length; i++){
                for(int j = 0; j < MatA[0].length; j++){
                    MatA[i][j] = input.nextInt();
              }
           }
        System.out.println("This is your Matrix A");
             d = 1;
            for( int i = 0; i < MatA.length; i++){
                for(int j = 0; j < MatA[0].length; j++){
                    System.out.print(" "+MatA[i][j]+"\t");
                    d++;
                }
                System.out.println("");   
              }
        
        System.out.println("What do you want to perform");
        System.out.println(" [1]Determinant    [2]Scalar-Multiplication     [3]More..");
        int choice2 = input.nextInt(); 
        if( choice2 == 1 && cola == 2 && rowa == 2){
               int Det = (MatA[0][0] * MatA[1][1]) - (MatA[1][0] * MatA[0][1]);
               System.out.println("The determinant is " + Det);
        }
        else if( choice2 == 1 && cola == rowa){
             int Det = ((MatA[0][0] * ((MatA[1][1] * MatA[2][2]) - (MatA[2][1] * MatA[1][2])))+((-1 * MatA[0][1]) * (MatA[1][0] * (MatA[2][2])-(MatA[2][0] * MatA[1][2]))) + (MatA[0][2] * ((MatA[1][0] * MatA[2][1])-(MatA[2][0] * MatA[1][1]))));
                 System.out.println("The determinant is " + Det );
        }
        else if( choice2 == 2){
            System.out.println(" MatA X what");
            int m;
             m = input.nextInt();
            for(int i = 0; i < MatA.length; i++){
                for(int j = 0; j < MatA[0].length; j++){
                    MatC[i][j] = m * MatA[i][j];
                     System.out.print(" "+MatC[i][j]+"\t");
                }
                System.out.println("");   
            }
            
        }
        //Matrix B  
    else if( choice2 == 3){
          System.out.println("_______________________________________");
        System.out.println("Your second matrix B");
          System.out.println("_______________________________________"); 
       
        System.out.println("Enter number of rows");
            x = input.nextInt();
            rowb = x;
        System.out.println("Enter number of columns");
            y = input.nextInt();
            colb = y;
        int MatB[][] = new int[x][y];
        System.out.println("This is your Matrix form");
            int e = 1;
            for(int i = 0; i < MatB.length; i++){
                for(int j = 0; j < MatB[0].length; j++){
                    System.out.print("\tb"+e);
                    e++;
                }
                System.out.println("");
            }
        System.out.println("Enter your matrix elements");
            for(int i = 0; i < MatB.length; i++){
                for(int j = 0; j < MatB[0].length; j++){
                    MatB[i][j] = input.nextInt();
              }
           }
        System.out.println("This is your Matrix B");
             e = 1;
            for( int i = 0; i < MatB.length; i++){
                for(int j = 0; j < MatB[0].length; j++){
                  System.out.print(" "+MatB[i][j]+"\t");
                    e++;
                }
                System.out.println("");   
              }
            int choice;
            System.out.println("What do you want to perform");
            System.out.println(" [1]Addition    [2]Subtraction    [3]Multiplication ");
            choice = input.nextInt();
            
            
           if(choice == 1){
               System.out.println("_______________________________________");
               if(Matrix.check(cola, colb) == true && Matrix.check(rowa, rowb)){
                 for(int i = 0; i < MatA.length; i++){
                    for(int j = 0; j < MatB[0].length; j++){
                     MatC[i][j] = MatA[i][j] + MatB[i][j];   
                     System.out.print("\t"+MatC[i][j]);
                    }
                   System.out.println();
                 }
            }
               else{
                   System.out.println("It is not possible");
               }
           }
           if(choice == 2){
               System.out.println("_______________________________________");
               if(Matrix.check(cola, colb) == true && Matrix.check(rowa, rowb)){
                    for(int i = 0; i < MatA.length; i++){
                    for(int j = 0; j < MatB[0].length; j++){
                     MatC[i][j] = MatA[i][j] - MatB[i][j];   
                     System.out.print("\t"+MatC[i][j]);
                    }
                   System.out.println();
                 }
               }
               else{
                   System.out.println("It is not possible");
               }
           }
           //multiplication
           if( choice == 3 && (Matrix.check(cola, rowb) == true)){
                System.out.println("_______________________________________");
                    for(int i = 0; i < MatA.length; i++){
                    for(int j = 0; j < MatB[0].length; j++){
                        for(int k = 0; k < MatB.length; k++){
                     MatC[i][j] =  MatC[i][j] + MatA[i][k] * MatB[k][j];   
                     
                    }
                 }
               }
                for(int i = 0; i < MatA.length; i++){
                    for(int j = 0; j < MatB[0].length; j++){
                        System.out.print(" "+MatC[i][j]+"\t");
                     }
                        System.out.println("");
                 }
           
            }
            else{
                   System.out.println("It is not possible");
               }
           
    }
        else if(choice2 == 1 && cola != rowa){
            System.out.println("You cannot find determinant of a non square Matrix");
        }
        else{
            System.out.println("Wrong input");
        }
           
         
        }
        
        while( 3 > 1);
        
        }
    
    public static boolean check(int a,int b){
        if( a == b ){
            return true;
        }
        else{
            return false;
        }
    }
    
}

           
    
    
        

   

