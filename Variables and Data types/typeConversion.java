import java.util.*;
public class typeConversion {
    public static void main(String args[]){
        // int a = 25;
        // long b = a;
        // System.out.println(b);    This is correct way of conversion

        // long a = 25;
        // int b= a;
        // System.out.println(a);   hence this provide error in coversion because from long to int we can't change type but form int to long we can 

        Scanner sc = new Scanner(System.in);
        // int number = sc.nextFloat();
        // System.out.println(number);     // hence this shows error because we are converting a float into a number which is not possible or compatable

        float number = sc.nextInt();
        System.out.println(number);  // yeh run krega integer input lekr float teturn kregaa
        sc.close();   // THIS IS CALLED IMPLICIT FUNCTION 
    }
}
