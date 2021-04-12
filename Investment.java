/*-----------------------------------------------------------
Program Name:Investment.java
Name:David Bierbrauer
Name: Professor Christine Forde
Course:CSC 100-105 Introduction to Computer Science
Due Date:Febuary 26th 2016

Program Description:
This program Takes the ammount of money you invested and multiplys it by the interest rate. 
It then multiplies the interest you get by the number of years it has been in the account.
-----------------------------------------------------------*/

import javax.swing.*;
import java.text.DecimalFormat;

public class Investment
{//The principal ammount invested the interest rate and the number of years invested

   public static void main (String []args)
   {
      double       Principal;
      double       Rate;
      int          Numberofyears;
      double       maturityAmount;
      DecimalFormat fmt = new          DecimalFormat ("0.00");
      
      Principal=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter principal amount invested: "));
      Rate=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter interest rate invested at: "));
      Numberofyears=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of years invested: "));

      maturityAmount=Principal*Math.pow(1+Rate/100,Numberofyears) ;
   
      System.out.println("Input - \n"+"Principal:"+Principal)
      System.out.println(" Rate. \n\n" +"output -)
      System.out.println("Principal:" + Principal + " Dollars.)
      System.out.println("Rate:" + Rate + " %.)
      System.out.println("Number of years:" + Numberofyears + " Years.)
      System.out.println("Maturity amount:" + fmt.format(maturityAmount) + " Dollars.);
     
     System.exit(0);


   }
}
