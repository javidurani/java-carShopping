/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.shopping;

import java.util.Scanner;

public class CarShopping
{
    
    private static Scanner kb = new Scanner(System.in);

   public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      totalCost += automaticWindows();
      totalCost += keyless();
      totalCost += onstar();
      totalCost += antilock();
      totalCost += telepedal();
      totalCost += sunroof();
      totalCost += weapackage();
      totalCost += gps();
      totalCost += subwoofer();
      totalCost += seatwarmers();
      totalCost += lights();
       System.out.println("***** CAR TOTAL " + totalCost + " *****");
   }
   
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
       System.out.println("Which base model did the customer choose?"
               + "(enter full model name ex. Model 1): ");
      String model = kb.nextLine();
      if(model.equalsIgnoreCase("Model 1")){
         return 15000;
      }  
      else if(model.equalsIgnoreCase("Model 2")){
          return 24000;
      }
      else if(model.equalsIgnoreCase("Model 3")){
          return 40000;
      }
      else{
          return 0;
      }
   }
   
   
   public static int automaticWindows()
   {
      System.out.print("Automatic Windows for $500? (Yes/No) > ");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 500;
       }
       else{
           return 0;
       }
   }
   public static int keyless(){
       System.out.println("Remote keyless entry for $1000? (Yes/No)");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 1000;
       }
       else{
           return 0;
       }
   }
   public static int onstar(){
        System.out.println("OnStar System for $1000? (Yes/No)");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 1000;
       }
       else{
           return 0;
       } 
   }
   public static int antilock(){
         System.out.println("Anti-lock Brakes for $500? (Yes/No)");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 500;
       }
       else{
           return 0;
       }
   }
   public static int telepedal(){
         System.out.println("Telescoping steering wheel/adjustable pedals for $1000? (Yes/No)");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 1000;
       }
       else{
           return 0;
       }
   }
   public static int sunroof(){
         System.out.println("Sunroof for $500? (Yes/No)");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 500;
       }
       else{
           return 0;
       }
   }
   
   public static int weapackage(){
         System.out.println("Cold Weather Package for $1500? (Yes/No)");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 1500;
       }
       else{
           return 0;
       }
   }
   public static int gps(){
         System.out.println("GPS Navigation System for $750? (Yes/No)");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 750;
       }
       else{
           return 0;
       }
   }
   public static int subwoofer(){
         System.out.println("Subwoofers for $300? (Yes/No)");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 300;
       }
       else{
           return 0;
       }
   }
   public static int seatwarmers(){
         System.out.println("Seatwarmers for $200? (Yes/No)");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 200;
       }
       else{
           return 0;
       }
   }
   public static int lights(){
         System.out.println("LED Under Car lights for $100? (Yes/No)");
       String choice = kb.nextLine();
       if(choice.equalsIgnoreCase("Yes")){
           return 100;
       }
       else{
           return 0;
       }
   }
  
}

