import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num; // to hold the numbers
        int fact = 1;  // to holf factorials

        System.out.println("print any positive integer");
        num = sc.nextInt();
         for(int i = 1; i<=num;i++){
            fact *= i;
         }

         System.out.println("factorial : " + fact);
         sc.close();
    }
}
