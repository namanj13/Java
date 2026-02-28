public class compress {

    public static String Compress(String str){
        // Now by using string builder we can compress the string in O(n) time complexity because we are not creating a new string every time we append a character to the string builder
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        } return sb.toString();
    }

        // this is done by string only
//         String newStr = "";
//         for(int i=0;i<str.length();i++){
//             Integer count = 1;
//             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newStr += str.charAt(i);
//             if(count>1){
//                 newStr += count.toString();
//             }
//         } 
//         return newStr;
//     }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(Compress(str));
    }
}
