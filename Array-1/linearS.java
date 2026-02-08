public class linearS {

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            } 
         } return -1;
        }
                // Alternative method for String search
        // public static int linearSearchS(String menu[], String keys){
        // for(int i=0; i<menu.length;i++){
        //     if(menu[i] == keys){
        //         return i;
        //     } 
        //  } return -1;
        // }
    
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10,12,14,16,18};
        // String menu[] = {"coffee", "tea", "chole bhature", "Samosa"};
        int key = 18;
        // String keys = "tea";

        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("key not found");
        // } else {
        //     System.out.println("key found at index:" + index);
        // }


        System.out.println("key at index : " + linearSearch(numbers, key));  // YEH MAINE KHUD SE KIYA HAI WARNA MAM NE UPER WALA HI LIKBAYA THA PRINT STATEMNT WALA IF-ELSE WALA 



             // For String search
        // int indexs = linearSearchS(menu, keys);
        // if(indexs ==-1){
        //     System.out.println("Key not found");
        // } else {
        //     System.out.println("Key found at index : " + indexs);
        // }
    }
}
