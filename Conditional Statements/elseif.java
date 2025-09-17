import java.util.*;

public class elseif {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = 15;
        if(age>=18){
            System.out.println("Adult: Drive, Vote");
        } 
        else if(age >13 && age < 18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }

        // INCOME TAX CALCULATOR
         int income = sc.nextInt();
         int tax;
         if(income < 500000){
            tax = 0;
         }
         else if(income > 500000 && income < 1000000){
            tax = (int) (income * 0.2)  ;
         }
         else{
           tax = (int)  ( income * 0.3);
         }
         System.out.println("your tax is :" + tax);


         // largest of 3 numbers
         int A = 10;
         int B = 12;
         int C = 25;
         if((A>=B) && (B>=C)){
            System.out.println("A is largest no.");
         }
         else if(B>=C){
            System.out.println("B is the largest");
         }
         else {
            System.out.println("C is the largest");
         }
    }
}
