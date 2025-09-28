import java.util.*;
public class functions {

    // to print hello world
    public static void printhelloworld(){
        System.out.println("hello naman");
        return;
    }

    // to calculate sum of 2 numbers 
    public static int calculatesum(int num1, int num2){  // parameters or formal parameters
        int sum =  num1 + num2;
        return sum;
    }

    // MAIN FUNCTION 
    public static void main(String args[]){
        // printhelloworld();
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a,b);  // arguments  or actual parameters
        System.out.println("sum is : " +sum);   // har ek function mein har ek variable alag hota hai bhale hi name same kyu nah ho 
        sc.close();
    }
}
