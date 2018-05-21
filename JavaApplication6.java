 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.*;

/**
 *
 * @author amit
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is details about course and fees.");
        System.out.println("Choose Your Course number from the following.");
        System.out.println("1.ME");
        System.out.println("2.CS");
        System.out.println("3.IT");
        System.out.print("Enter you course number: ");
        Scanner course=new Scanner(System.in);
        byte c;
        c=course.nextByte();
        switch(c)
        {
            case 1:
                System.out.println("Choose your location from the following.");
                System.out.println("D. Delhi");
                System.out.println("M. Mumbai");
                System.out.println("P. Punjab");
                System.out.print("Enter your locatin code: ");
                Scanner location=new Scanner(System.in);
                String l;
                l = location.next();
                switch(l)
                {
                    case "D":
                        System.out.println("Your Course Is ME.");
                        System.out.println("Location Delhi.");
                        System.out.println("Fees of this is Rs. 2.00 Lakh");
                        break;
                    case "d":
                        System.out.println("Your Course Is ME.");
                        System.out.println("Location Delhi.");
                        System.out.println("Fees of this is Rs. 2.00 Lakh");
                        break;
                    case "M":
                        System.out.println("Your Course Is ME.");
                        System.out.println("Location is Mumbai.");
                        System.out.println("Fees of this is Rs. 3.00 Lakh");
                        break;
                    case "m":
                        System.out.println("Your Course Is ME.");
                        System.out.println("Location is Mumbai.");
                        System.out.println("Fees of this is Rs. 3.00 Lakh");
                        break;
                    case "P":
                        System.out.println("Your Course Is ME.");
                        System.out.println("Location is Punjab.");
                        System.out.println("Fees of this is Rs. 1.50 Lakh");
                        break;
                    case "p":
                        System.out.println("Your Course Is ME.");
                        System.out.println("Location is Punjab.");
                        System.out.println("Fees of this is Rs. 1.50 Lakh");
                        break;
                    default:
                        System.out.println("          !!!Sorry!!!\nME is not avaliable at the location.");
                        break;
                }
             break;
            case 2:
                System.out.println("Choose your location from the following.");
                System.out.println("D. Delhi");
                System.out.println("M. Mumbai");
                System.out.println("P. Punjab");
                System.out.println("H. Haryana");
                System.out.print("Enter your locatin code: ");
                Scanner locatio=new Scanner(System.in);
                String l2;
                l2 = locatio.next();
                switch(l2)
                {
                    case "D":
                        System.out.println("Your Course Is CS.");
                        System.out.println("Location Delhi.");
                        System.out.println("Fees of this is Rs. 2.10 Lakh");
                        break;
                    case "d":
                        System.out.println("Your Course Is CS.");
                        System.out.println("Location Delhi.");
                        System.out.println("Fees of this is Rs. 2.10 Lakh");
                        break;
                    case "M":
                        System.out.println("Your Course Is CS.");
                        System.out.println("Location is Mumbai.");
                        System.out.println("Fees of this is Rs. 2.90 Lakh");
                        break;
                    case "m":
                        System.out.println("Your Course Is CS.");
                        System.out.println("Location is Mumbai.");
                        System.out.println("Fees of this is Rs. 2.90 Lakh");
                        break;
                    case "P":
                        System.out.println("Your Course Is CS.");
                        System.out.println("Location is Punjab.");
                        System.out.println("Fees of this is Rs. 1.80 Lakh");
                        break;
                    case "p":
                        System.out.println("Your Course Is CS.");
                        System.out.println("Location is Punjab.");
                        System.out.println("Fees of this is Rs. 1.80 Lakh");
                        break;
                    case "H":
                        System.out.println("Your Course Is CS.");
                        System.out.println("Location is Haryana.");
                        System.out.println("Fees of this is Rs. 1.80 Lakh");
                        break;
                    default:
                        System.out.println("          !!!Sorry!!!\nME is not avaliable at the location.");
                        break;
                }
             break;
            case 3:
                System.out.println("Choose your location from the following.");
                System.out.println("D. Delhi");
                System.out.println("M. Mumbai");
                System.out.println("B. Bihar");
                System.out.print("Enter your locatin code: ");
                Scanner locati=new Scanner(System.in);
                String l3;
                l3= locati.next();
                switch(l3)
                {
                    case "D":
                        System.out.println("Your Course Is IT.");
                        System.out.println("Location Delhi.");
                        System.out.println("Fees of this is Rs. 3.00 Lakh");
                        break;
                    case "d":
                        System.out.println("Your Course Is IT.");
                        System.out.println("Location Delhi.");
                        System.out.println("Fees of this is Rs. 3.00 Lakh");
                        break;
                    case "M":
                        System.out.println("Your Course Is IT.");
                        System.out.println("Location is Mumbai.");
                        System.out.println("Fees of this is Rs. 3.50 Lakh");
                        break;
                    case "m":
                        System.out.println("Your Course Is IT.");
                        System.out.println("Location is Mumbai.");
                        System.out.println("Fees of this is Rs. 3.50 Lakh");
                        break;
                    case "B":
                        System.out.println("Your Course Is IT.");
                        System.out.println("Location is Bihar.");
                        System.out.println("Fees of this is Rs. 2.00 Lakh");
                        break;
                    case "b":
                        System.out.println("Your Course Is IT.");
                        System.out.println("Location is Bihar.");
                        System.out.println("Fees of this is Rs. 2.00 Lakh");
                        break;
                    default:
                        System.out.println("          !!!Sorry!!!\nME is not avaliable at the location.");
                        break;
                }
            break;
            default:
                        System.out.println("       Wrong Course Code.");
                        System.out.println("      Try after some time.");
        }    
        System.out.println("        !!!Thank You!!!");
    }
    
}
