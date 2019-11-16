package CSC_225;

//Name: MINE
//Matric: 170805523
//Course: CSC_225
import java.text.DecimalFormat;
public class Errors {
    public static void main(String[] args) {
        // TODO code application logic here
        String pattern = "##.######";
        DecimalFormat d1 = new DecimalFormat(pattern);
        double[] R0 = new double[11];
            R0[0] = 0.99996;
        System.out.println("n\t   R0              Rn             |R0-Rn|            Er             Ep          Propagated A Errors      Propagated M Errors");
        System.out.println("________________________________________________________________________________________________________________________________________________________________________________");
      
            for(int n = 1; n <=10; n++){
                R0[n] = R0[n-1]/3;
                double Absolute = Math.abs(R0[n] - R0[0]);
                double nAbsolute = Math.abs(R0[n]- R0[n-1]);
                double Relative = (Absolute/R0[0]);
                double Percentage = Relative * 100;
                //Propagated additive errors
                //A+B = (-A + Ea) + (-B + Eb)
                double PAE = (R0[n] + Absolute) + (R0[n-1] + nAbsolute); 
                //Propagated Multiplicative errora
                //A*B = (-A * Ea) + (-A * Eb) + (-B * Ea) + (Ea * Eb)
                double PME = (R0[n]* Absolute) + (R0[n] * nAbsolute) + (R0[n-1] * Absolute) + (Absolute * nAbsolute);
                String Abs = d1.format(Absolute);
                String Rel = d1.format(Relative);                
                String Per = d1.format(Percentage);
                String RO = d1.format(R0[0]);
                String Rn = d1.format(R0[n]);
                String pae = d1.format(PAE);
                String pme = d1.format(PME);
                System.out.print(n + " | " + "\t");
                System.out.print(" " +  RO + "\t");
                   System.out.print(" " +  Rn + "\t");
                System.out.print(" " + Abs + "\t");
                System.out.print(" " + Rel + "\t");
                System.out.print(" " + Per+"%" + "\t");
                System.out.print("   " + pae + "\t" + "\t");
                System.out.print(" " + pme + "\t");
                System.out.println("    ");
                
             }
        }
 }
    

















