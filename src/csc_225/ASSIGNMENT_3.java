/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc_225;

/**
 *
@author MISHAEL
 */
//Name: MISHAEL ABIOLA OLAKUNLE
//Matric: 170805523
//Course: CSC_225

public class ASSIGNMENT_3 {
     public static void main(String[]args){
        System.out.println("n   "+"       xn  "+"          f(xn)  "+"         f_(xn)   "+"      Abs Error  "+"     Rel Error   "+"    % error    ");
        double xn[] = new double[6];
        double fxn[] = new double[6];
        double f_xn[] = new double[6];
        double Ea[] = new double[6];
        double Er[] = new double[6];
        double Ep[] = new double[6];
        double Rv = 2.1;
        xn[0] = 2.1;
        for(int n = 0; n < 4; n++ ){
            xn[0] = 2.1;
            fxn[n] = f1(xn[n]);
            f_xn[n] = f2(xn[n]);
            
            xn[n+1] = xn[n] - ((fxn[n])/(f_xn[n]));
            
            //errors
            //abs error
            Ea[n] = Math.abs(Rv - xn[n]);
            //rel error
            Er[n] = (Ea[n]/Rv);
            //% error
            Ep[n] = (Er[n] * 100);
            System.out.print(n);
            System.out.printf("\t %.6f \t%.6f \t%.6f \t%.6f \t%.6f \t%.6f",xn[n],fxn[n],f_xn[n],Ea[n],Er[n],Ep[n]);
            System.out.println(" "); 
        }
    }
     
    /** functions
    y = x^3 -2x -5
    y_ = 3x^2 -2
    */
     
    //methods
    
    public static double f1(double x){
        return  Math.pow(x-2,4);
    }
    public static double f2(double x){
        return (4*Math.pow(x-2,3));
    }
}
