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
public class Newton {
    public static void main(String[]args){
        System.out.println(" n  "+"       xn  "+"          f(xn)  "+"                f_(xn)   ");
        double xn[] = new double[6];
        double fxn[] = new double[6];
        double f_xn[] = new double[6];
        xn[0] = 2;
        for(int n = 0; n < 4; n++ ){
            xn[0] = 2;
            fxn[n] = f1(xn[n]);
            f_xn[n] = f2(xn[n]);
            
            xn[n+1] = xn[n] - ((fxn[n])/(f_xn[n]));
            
           System.out.print(n);
           System.out.printf("\t %.5f \t%.5f \t\t%.5f",xn[n],fxn[n],f_xn[n]);
           System.out.println(" "); 
        }
                   System.out.println(fxn[2]);

    }
    /** functions
    y = x^3 -2x -5
    y_ = 3x^2 -2
    */
    //methods
    public static double f1(double x){
        return  (Math.pow(x, 3)-(2*x)-5);
    }
    public static double f2(double x){
        return (3*Math.pow(x,2) - 2);
    }
}
