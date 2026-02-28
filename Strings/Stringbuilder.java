public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z';ch++){  // this is the way to create a string using string builder
            sb.append(ch);
        }
        // time complexity is O(26) because we are appending 26 characters to the string builder
        // but if we have a string builder then the time complexity will be O(1) because we are not creating a new string every time we append a character to the string builder
        // and if we have a string then the time complexity will be 0(n2) because we have to create a new string every time we append a character to the string
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
