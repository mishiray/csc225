/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc_225;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Chinyere
 */
public class Bsection {
    public static void main (String[]args){
        Scanner inpur = new Scanner(System.in);
        String pattern = "##.####";
        DecimalFormat df = new DecimalFormat(pattern);
        //x^3 - 2x - 5
        //System.out.println(y(i) + " and " + y(j));
        double a[] = new double[17];
        double b[] = new double[17];
        double c[] = new double[17];
        double fa[] = new double[17];
        double fb[] = new double[17];
        double fc[] = new double[17];
        double r1,r2; 
        double suba;
        double subb;
        double root;
        int choice;
        System.out.println("[1]Question-1  {2}Question-2");
        choice = inpur.nextInt();
        if(choice == 1){
            
        System.out.println("     a    "+"      b      "+"    c     "+"       f(a)    "+"    f(b)   "+"     f(c)   ");
        for(int n = 1; n <= 15; n++){
            a[1] = 2;
            b[1] = 4;
            c[n] = (a[n] + b[n])/2;
            fa[n]= y(a[n]);
            fb[n]= y(b[n]);
            fc[n]= y(c[n]);
                if((fa[n]) * (fb[n]) < 0){
                    suba = a[n];
                    subb = b[n];
                }
                else{
                    suba = b[n];
                    subb = a[n];
                }
                        
                if((fc[n]) < 0){
                    suba = c[n];
                }
                else if((fc[n]) > 0){
                    subb = c[n];
                }
                else{
                    root = y(c[n]);
                    n = 16;
                }
            
            
         a[n+1]=suba;
         b[n+1]=subb;
         
         String A = df.format(a[n]);
         String B = df.format(b[n]);                
         String C = df.format(c[n]);
         String FA = df.format(fa[n]);
         String FB = df.format(fb[n]);                
         String FC = df.format(fc[n]);
         System.out.print("   "+n+"   ");
         System.out.print("   "+A+"   ");
         System.out.print("   "+B+"   ");
         System.out.print("   "+C+"   ");
         System.out.print("   "+FA+"  ");
         System.out.print("   "+FB+"  ");
         System.out.print("   "+FC+"  ");
         System.out.println(" ");
         
         
        }
        }
        else if(choice ==2){
        
        //Question 2
        
        double ea[] = new double[17];
        double eb[] = new double[17];
        double ec[] = new double[17];
        double efa[] = new double[17];
        double efb[] = new double[17];
        double efc[] = new double[17];
        double rot;
        System.out.println("   n  "+"     a  "+"        b  "+"          c   "+"       f(a)  "+"        f(b) "+"         f(c)  ");
        
        for(int i = 1; i < 15; i++){
            ea[1] = 0;
            eb[1] = 1;
            ec[i] = (ea[i] + eb[i])/2;
            efa[i]= w(ea[i]);
            efb[i]= w(eb[i]);
            efc[i]= w(ec[i]);
            double AC = w(efa[i]) * w(efc[i]);
            double BC = w(efb[i]) * w(efc[i]);
                if( AC > 0 && BC < 0){
                    ea[i+1] = ec[i];
                    eb[i+1] = eb[i];
                }
                else if(AC < 0 && BC > 0){
                    ea[i+1] = ea[i];
                    eb[i+1] = ec[i];
                }
                else if(AC ==  0 && BC == 0){
                    ec[15] = ec[i];
                    rot = i + 1;
                    i = 15;
                }
                else{
                    System.out.println("Error");
                }
         
         String EA = df.format(ea[i]);
         String EB = df.format(eb[i]);                
         String EC = df.format(ec[i]);
         String EFA = df.format(efa[i]);
         String EFB = df.format(efb[i]);                
         String EFC = df.format(efc[i]);
         
         System.out.print("   "+(i)+"   ");
         System.out.print("    "+EA);
         System.out.print("   "+EB);
         System.out.print("     "+EC);
         System.out.print("        "+EFA);
         System.out.print("          "+EFB);
         System.out.print("           "+EFC);
         System.out.println(" ");
         
         if( ((efc[i]-efc[i-1])/(efc[i]))* 100 == 0.05){
             i = 15;
        }
         
    }
    }
    }    
    public static double y(double x){
       return (Math.pow(x,3)- 2*(x) - 5);  
    }
    
    public static double w(double x){
        return x*(Math.exp(x))-1;
    }
}
