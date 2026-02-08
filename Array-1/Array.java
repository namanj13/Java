import java.util.*;

public class Array {
 public static void main(String args[]){
    int marks[] =  new int[100];
    Scanner sc = new Scanner(System.in);

    marks[0] = sc.nextInt();//maths
    marks[1] = sc.nextInt();//chem
    marks[2] = sc.nextInt();//phy

    System.out.println("maths marks:" + marks[0]);
    System.out.println("chem marks:" + marks[1]);
    System.out.println("phy marks:" + marks[2]);

    // marks[1] = 100; // Another way of doing this is 
    // marks[1] = marks[1] + 2; // this is the another way of writing this
    // System.out.println("chem marks:" + marks[1]);

    int percentage = (marks[0] + marks[1] + marks[2])/3;
    System.out.println("percentage:" + percentage + "%");

    System.out.println("length of array:" + marks.length);
    sc.close();
 }   
}
