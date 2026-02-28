import java.util.Arrays;
public class Assignment2 {
    // Q.4 Anagram or not 
    public static void main(String args[]){
        String str1 = "earth";
        String str2 = "hebat";

        // convert the strings into lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // now check whether the strings have same length or not
        if(str1.length() == str2.length()){
            // convert the strings into character array

            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();

            // sort the character arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // now chechking whether the sorted array are equal or not

            boolean result = Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println("the string are anagram");
            } else {
                System.out.println("the string are not anagram");
            }
        } else {
            System.out.println("the string are not anagram");
        }
    }
}
