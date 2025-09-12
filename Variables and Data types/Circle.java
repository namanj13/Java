import java.util.*;

public class Circle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        // double area = 3.14 * radius * radius;   3.14 ko java double mein hi count krta hai 
        float area = 3.14f * radius * radius;
        System.out.println(area);
        sc.close();
    }
}