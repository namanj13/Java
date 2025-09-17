import java.util.*;

public class ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = 15;
        if(age>=18){
            System.out.println("Adult: Drive, Vote");
        } 
        if(age >13 && age < 18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }

        // finding the largest no. between two numbers
        int A = 10;
        int B = 12;
        if(A>=B){
            System.out.println("A is largerest no. ");
        } 
        else {
            System.out.println("B is largest no.");
        }

        // odd even numbers
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
