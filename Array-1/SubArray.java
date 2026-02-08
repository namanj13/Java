public class SubArray {

    public static int subarray(int numbers[]){
        int ts = 0;
        for( int i = 0; i< numbers.length; i++){
            for(int j = i; j< numbers.length; j++){
                for ( int k = i; k<=j; k++){         // print krwana h iska kam bs
                    System.out.print(numbers[k]+ " ");     // subarray
                } ts++;
                System.out.println();
            } System.out.println();
        } System.out.println("total no. of subarrays are : " + ts); 
        return 0;
    }


    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        subarray(numbers);
    }
    
}
