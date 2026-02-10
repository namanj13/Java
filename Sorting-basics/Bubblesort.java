public class Bubblesort {
    // Now it is optmizied versaion of bubble sort
    // after adding swap =0 and if swap is 0 then break the loop because it means array is already sorted
    public static void bubblesort(int arr[]){
        for(int turn = 0;turn<arr.length-1;turn++){
            int swap = 0;
            for(int j =0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        bubblesort(arr);
        printarr(arr);
    }
}
