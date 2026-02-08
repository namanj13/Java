public class MaxSum3 {

    // KADANE'S ALGORITHM TO FIND MAXIMUM SUBARRAY SUM IN O(N) TIME COMPLEXITY
    public static int Kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<numbers.length;i++){
            // YEH JO JUST ABHI MAINE COMMENT KIYA WOH MAM NE KRBAYA H BUT WOH KEWAL TB APPLY H JB HUMNE NEGATIVE KO ZERO KRNA HO OTHERWISE SAHI NI H, OR JO MAINE LEKHA H NEECHE CODE WOH UNIVERSAL H DON PE APPLY HOGA.
            
            // cs = cs+numbers[i];
            // if(cs<0){
            //     cs=0;
            // }

            // agar esa hota h ke saare elements array ke negative ho jate h to kya condition hogi me woh lga rha hu abbb
            cs= Math.max(numbers[i], numbers[i]+cs);
            maxSum = Math.max(cs,maxSum);
        }
        System.out.println("Max Sum is:" + maxSum);
        return maxSum;
    }
    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes(numbers);

    }
}
