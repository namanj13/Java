public class MAXSUB{
      // THIS IS A BRUTE FORCE METHOD 
    public static int maxSubarray(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        // int ts = 0;
        for(int i=0; i<numbers.length;i++){
            for(int j = i; j<numbers.length;j++){
                int sum = 0;
                for(int k = i; k<=j;k++){
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                } 
                System.out.println( "  || Sum is : " + sum);
                if (sum > maxSum){
                    maxSum = sum;
                } 
                // ts++;
            } System.out.println();
        } 
        System.out.println("Maximum subarray sum is : "+ maxSum);
        // System.out.println("Total subArray is : " + ts);
        return maxSum;
    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        maxSubarray(numbers);
    }
}