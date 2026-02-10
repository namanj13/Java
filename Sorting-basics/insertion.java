public class insertion {
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct position to insert
            while(prev>=0 && arr[prev]> curr){    // for decreasing order change it to arr[prev]<curr
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion 
            arr[prev+1] = curr;

        }
    }

    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        insertionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "");
        }
    }
}
