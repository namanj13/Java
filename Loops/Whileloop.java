import java.util.*;
public class Whileloop {
    public static void main(String args[]){
        int counter = 0;
        while(counter<5){
            System.out.println("hello naman");
            counter++;
        }

        // Print no. 1 to 10

        int number = 1;
        while(number <=10){
            System.out.print(number + " ");
            number++;
            System.out.println();
        }

        // print no. 1 to n 
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int range = sc.nextInt();
        while(num<=range){
            System.out.print(num + " ");
            num++;
            System.out.println();
        }
            


        // SUM OF 1ST N NATURAL NUMBERS
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("sum is :"+ sum);
        sc.close();
    }
}
