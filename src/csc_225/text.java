/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc_225;

/**
 *
 * @author Chinyere
 */
public class text {
    
     public static void main(String[] args){
         int[][] a = {
            {4,2,6,5},
            {2,6,8,9},
            {7,7,2,2}
        };
         int[] row1 = a[0];
         int[] row2 = a[1];
         int[] row3 = a[2];
         
         swap(row1,row2);
         System.out.println(row1[0]);
    }
     
      static void swap(int[]row, int[] with_row){
          for(int i=0; i < row.length; i++){
              row[i] = with_row[i];
          }
      }
}
