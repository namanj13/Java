import java.util.Arrays;
import java.util.Collections;
public class inbuilt {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        // Arrays.sort(arr); // this is inbuilt function to sort the array
        Arrays.sort(arr,0,5); // this will sort the array from index 0 to index 2
        Integer arr1[] = {5,4,1,3,2}; // for sorting in decreasing order we have to use Integer array instead of int array because Collections.reverseOrder() works only with objects
        // Arrays.sort(arr1,Collections.reverseOrder()); // this will sort the array in decreasing order
        Arrays.sort(arr1,0,4,Collections.reverseOrder()); // this will sort the array from index 0 to index 2 in decreasing order
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
    }
}
