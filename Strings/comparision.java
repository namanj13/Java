public class comparision {
    public static void main(String args[]){
        String str1 = "naman";
        String str2 ="naman";
        // this will return true because both the strings are same and they are stored in the same location in the memory
        String str3 = new String("naman");
        // this will return false because str3 is created using new keyword and it is stored in a different location in the memory
        if(str1 == str2){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        if(str1 == str3){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }// so this shows not equal because str1 and str3 are stored in different locations in the memory but they have the same value so to compare the values of the strings we should use the equals method
        if(str1.equals(str3)){
            System.out.println("Strings are equal");  // this will return true because the equals method compares the values of the strings and not the memory location
        } else {
            System.out.println("Strings are not equal");
        }
    }  

}
