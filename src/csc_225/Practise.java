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
public class Practise {
    public static void main(String[] args){
        //B section
        //(x exp 3)-x-1
        
        double a[] = new double[17];
        double b[] = new double[17];
        double x[] = new double[17];
        double fa[] = new double[17];
        double fb[] = new double[17];
        double fx[] = new double[17];
       
        System.out.println("\tn "+"  \t   a "+"    \t    b "+"   \t   c "+"   \t   f(a) "+"    \t    f(b)  "+"    \t   f(c) ");
                
        for(int i = 0; i < 16; i++){
            
            double root = 0;
            a[0] = 2;
            b[0] = 1; 
            x[i] = (a[i] + b[i]) / 2;
            fa[i] = fun(a[i]);
            fb[i] = fun(b[i]);
            fx[i] = fun(x[i]);
            
            if(fa[i] * fx[i] < 0){
                b[i+1] = x[i];
                a[i+1] = a[i];
            }
            else if(fa[i] * fx[i] > 0){
                a[i+1] = x[i];
                b[i+1] = b[i];
            }
            else if( (x[i+1]-x[i])/x[i+1] <= 0.005 ){
                i = 16;
            }
            
            System.out.print("\t"+ i );
            System.out.printf("\t %.5f \t %.5f \t %.5f \t %.5f \t %.5f \t %.5f",a[i],b[i],x[i],fa[i],fb[i],fx[i]);
            System.out.println(" ");
            
        }
        //System.out.println("The root of the equstion is "+ root );
     }
      
    public static double fun(double x){
        return(Math.pow(x,3) - x - 1);
    }
}
