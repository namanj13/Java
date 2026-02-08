public class MAXSUM2 {
    // TO FIND MAXIMUM SUM OF SUBARRAY BY PREFIX SUM 

    public static int maxSubarray(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // to calculate prefix array    
        for(int i =1;i<numbers.length;i++){
            prefix[i] = prefix[i-1]+ numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                int sum =0;
                sum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];   // ternary operator
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
        }
        System.out.println("max Sum: " + maxSum);
        return maxSum;
    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        maxSubarray(numbers);
    }
}
