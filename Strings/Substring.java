public class Substring {

    public static String subString(String str, int si, int ei){
        String subStr = "";
        for(int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]){
        String str = "Hello World";
        System.out.println(str.substring(0,5)); // this is the inbuilt function to get the substring of a string
        System.out.println(subString(str, 2, 5)); // this is our own function to get the substring of a string
    }
}
