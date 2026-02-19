import java.util.*;
public class TwoDArray {

    public static boolean search(int matrix[][], int key){    // to find the key in the matrix and return true if found else false
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at index(" +i+ "," +j+ ")");
                    return true;
                }
            }
        } return false;
    }

    public static void maxmin(int matrix[][]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        } 
        System.out.println("maximum element is:" + max);
        System.out.println("minmum element is:"+ min);
    }
    public static void main(String args[]){
        int matrix [] [] = new int [3] [3];
        int n = matrix.length, m = matrix[0].length;


        Scanner sc = new Scanner(System.in);
        // input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // output 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            } System.out.println();
        }
        sc.close();
        search(matrix,6);
        maxmin(matrix);
    }
}
