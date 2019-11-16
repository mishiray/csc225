/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc_225;
import java.util.Scanner;

/**
 *
 * @author Abiola Mishael
 */


//Name: MISHAEL ABIOLA OLAKUNLE
//Matric: 170805523
//Course: CSC_225


public class ASSIGNMENT_2 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
            int choice;
            System.out.println("[1] Question 1 or [2] Question 2");
            choice = input.nextInt();
            double a[] = new double[17];
            double ai,bi,ci;
            double b[] = new double[17];
            double c[] = new double[17];
            double fa[] = new double[17];
            double fb[] = new double[17];
            double fc[] = new double[17];
                //Question 1
                //x^3 - 2x - 5
                if (choice == 1){
                System.out.println("Quesion 1");
                System.out.println("n"+"           a   "+"           b   "+"           c    "+"          f(a)      "+"       f(b) "+"          f(c)     ");
                System.out.println("_____________________________________________________________________________________________________________________________");
                for(int n=1; n < 16; n++){
                    a[1] = 2;
                    b[1] = 4;
                    c[n] = ((b[n]+a[n])/2);
                    fa[n]= y(a[n]);
                    fb[n]= y(b[n]);
                    fc[n]= y(c[n]);
                    if((fa[n]) * (fc[n]) < 0){
                        b[n+1] = c[n];
                        a[n+1] = a[n];
                    }
                    else if(((fa[n]) * (fc[n])) > 0){
                        a[n+1] = c[n];
                        b[n+1] = b[n];
                        
                    }
                    else if((fa[n]) * (fc[n]) == 0){
                        n = 15;
                        System.out.printf("The root of the equation is %f", c[n]);
                    }
                    System.out.print(n);
                    System.out.printf("\t %.4f \t%.4f \t\t%.4f \t\t%.3f \t\t%.3f \t\t%.4f",a[n],b[n],c[n],fa[n],fb[n],fc[n]);
                    System.out.println(" ");
                }
                    System.out.printf("The roots of the equation is %f and %f\n", a[15],b[15]);
           }
                else if(choice == 2){
                    //Question 2
                    //xe^x - 1 = 0
                    double ea[] = new double[17];
                    double eb[] = new double[17];
                    double ec[] = new double[17];
                    double efa[] = new double[17];
                    double efb[] = new double[17];
                    double efc[] = new double[17];
                    System.out.println("Quetion 2");
                    System.out.println("n"+"           a   "+"           b   "+"           c    "+"          f(a)      "+"      f(b)  "+"          f(c)     ");
                    System.out.println("_____________________________________________________________________________________________________________________________");
                    for(int i=1; i < 16; i++){
                        ea[1] = 0;
                        eb[1] = 1;
                        ec[i] = (ea[i] + eb[i]) / 2;
                        efa[i]= w(ea[i]);
                        efb[i]= w(eb[i]);
                        efc[i]= w(ec[i]);
                                         
                    if((efa[i]) * (efc[i]) < 0){
                        eb[i+1] = ec[i];
                        ea[i+1] = ea[i];
                    }
                    else if(efa[i] * (efc[i]) > 0){
                        ea[i+1] = ec[i];
                        eb[i+1] = eb[i];
                        
                    }
                    else if((efa[i]) * (efc[i]) == 0){
                        i = 16;
                        System.out.printf("The root of the equation is %f", ec[i]);
                    }
                    else if((Math.abs((efc[i]-efc[i-1]))/(efc[i]))  <= 0.0005){
                        i = 16;
                        System.out.printf("The root of the equation is %f", ec[i]);
                    }
                   System.out.print(i);
                   System.out.printf("\t %.4f \t%.4f \t\t%.4f \t\t%.3f \t\t%.3f \t\t%.4f",ea[i],eb[i],ec[i],efa[i],efb[i],efc[i]);
                   System.out.println(" ");
                    
               }
            
            System.out.printf("The roots of the equation is %f and %f\n", ea[15],eb[15]);
               
           }
    }
     public static double y(double x){
       return (Math.pow(x,3)- 2*(x) - 5);  
    }
     public static double w(double x){
        return (x*(Math.exp(x))-1);
    }
}