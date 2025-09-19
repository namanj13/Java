import java.util.*;
public class assignment {
    public static void main(String args[]){

        // QUESTION 1 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("its is a positive no.");
        }
        else{
            System.out.println("it is a negative no.");
        }

        // QUESTION 2
        double temp = 103.5;
        if(temp>100){
            System.out.println("you have a fever");
        }
        else{
            System.out.println("you don't have a fever");
        }

        //QUESTION 3

        System.out.println("Enter week number(1-7)");
        int day = sc.nextInt();

        switch (day){
            case 1 : System.out.println("Monday");
                     break;
            case 2 : System.out.println("Tuesday");
                     break;
            case 3 : System.out.println("Wednesday");
                     break;
            case 4 : System.out.println("Thursday");
                     break;
            case 5 : System.out.println("Friday");
                     break;
            case 6 : System.out.println("Saturday");
                     break;
            case 7 : System.out.println("Sunday");
                     break;
            default : System.out.println("invalid input");
            sc.close();
        }
    }
}
