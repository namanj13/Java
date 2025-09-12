import java.util.*;
public class practise {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        // question 1 
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();

        double avg = (a+b+c)/3;
        System.out.println("Average is :"+ avg);

       // question 2 
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(" area of square is : " + area);


        // question 3 
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pen + pencil + eraser;
        System.out.println("total bill will be :" + total);

        // adding gst 

        float newTotal = total + (0.18f * total);
        System.out.println("net bill:" + newTotal);

        sc.close();
    }
}
