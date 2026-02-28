import java.util.*;

public class Strings {

    // function to wirte all the characters of the string
    public static void printChar(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // STRINGS ARE IMMUTABLE
        Scanner sc = new Scanner(System.in);
        // to print single word 
        // String name = sc.next(); // this will only print the first word of the string    
        String name = sc.nextLine();  // this will print the whole line of the string
        System.out.println(name);
        sc.close();

        String fullname = "Naman Jain";
        System.out.println(fullname.length());

        // Concatenation of strings
        String firstName = "Naman";
        String lastName = "Jain";
        String completeName = firstName + " " + lastName;
        System.out.println(completeName);
        System.out.println(completeName.charAt(3));

       printChar(completeName);
    }
}
