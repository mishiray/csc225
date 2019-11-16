/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc_225;

import  java.util.Scanner;

/**
 *
 * @author Chinyere
 */
public class ASSIGNMENT_5  {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
       
       int[][] a = {
            {1,2,1,4,13,0},
            {2,0,4,3,28,0},
            {4,2,3,1,20,0},
            {-3,1,3,2,6,0}
        };
         int[] row1 = a[0];
         int[] row2 = a[1];
         int[] row3 = a[2];
         int[] row4 = a[3];
         //int[] row5 = a[4];
         
        
        if(a[0][0] == 0 && a[1][0] != 0) {
           swap(row1,row2);
        }
        else if (a[0][0] == 0 && a[2][0] != 0) {
           swap(row1,row3);
        }
        else if (a[0][0] == 0 && a[3][0] != 0) {
           swap(row1,row4);
        }
        
        int t = 0;
        int N = a.length;
        for(int r = t+1; r < N; r++){
            int scalar = a[r][t]/a[t][t];
            a[r][t] = 0;
                for(int c = t+1; c < N+1; c++){
                    a[r][c] = ((a[r][c]) - (scalar * a[r-1][c]));
                            
                }
              
            }
        print(a);
    }
             
      public static void print(int[][] arr){
        for(int i=0; i < arr.length; i++){
            for(int j = 0; j<= arr.length; j++){
                System.out.print(" "+ arr[i][j]+"\t");
                }
                System.out.println("");   
        }
      }
      static void swap(int[]row, int[] with_row){
          for(int i=0; i < row.length; i++){
              row[i] = with_row[i];
          }
      } 

}