public class homework {
    // BASICALLY MUJHE ismein jo subarray h unka sum krna h and then mujhe uska minium and maximum sum bhi nikalna h

    public static int subarray(int numbers[]){
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i< numbers.length;i++){
            for(int j = i; j<numbers.length;j++){
                int sum = 0;
                for(int k =i;k<=j;k++){
                    System.out.print(numbers[k]+ " ");
                    sum += numbers[k];
                } ts++;
                System.out.println(" || sum is : " + sum);
                if (sum > maxSum){
                    maxSum = sum;
                } if(sum < minSum){
                    minSum =sum;
                }
            } System.out.println();

        }System.out.println("total no. of subarrays are : " + ts);
        System.out.println("maximum sum is : " + maxSum);
         System.out.println("minimum sum is : " + minSum);
        return 0;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        subarray(numbers);
    }
}
