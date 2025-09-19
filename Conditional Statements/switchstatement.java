import java.util.*;
public class switchstatement {
    public static void main(String args[]){

        int number = 2;
        switch(number) {
            case 1 : System.out.println("samosa");
                     break;
            case 2 : System.out.println("burger");
                     break;
            case 3 : System.out.println("pizza");
                     break;
            default : System.out.println("you wake up");
        }


        // calculator 
         Scanner sc = new Scanner(System.in);
         System.out.print("enter a : ");
         int a = sc.nextInt();
         System.out.print("enter b : ");
         int b = sc.nextInt();
         System.out.print("enter operator : ");
         char operator = sc.next().charAt(0);

         switch(operator){
            case '+' : System.out.println(a+b);
                       break;
            case '-' : System.out.println(a-b);
                       break;
            case '*' : System.out.println(a*b);
                       break;
            case '/' : System.out.println(a/b);
                       break;
            case '%' : System.out.println(a%b);
                       break;
            default : System.out.println("wrong operator");
            sc.close();
         }
    }
}