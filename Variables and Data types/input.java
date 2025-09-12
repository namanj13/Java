import java.util.*;

public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();     // .next kewal single word ke liye use hota h mtlb single input ke liye jese hi gape ayega uske baad wale words input ni lega 
        // System.out.println(input);
        // sc.close();  // Close the scanner

        // String name = sc.nextLine();  // .nextLine mutiple words ko input le skta hai mtlb gap ke baad bhi word lekh skte h..
        // System.out.println(name);

        int number = sc.nextInt();    // .nextInt mein ienterger values ko input de skte ho  
        System.out.println(number);

        float price = sc.nextFloat();   // .nextFloat mein decimal values ko input de skte hai 
        System.out.println(price);

         boolean var = sc.nextBoolean();
         System.out.println(var);
         sc.close();

    }
}
