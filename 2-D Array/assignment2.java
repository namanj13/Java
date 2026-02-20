public class assignment2 {
    public static void main(String args[]){
        int rows = 2;
        int cols = 3;
        int matrix [][] = { {2,3,7}, {5,6,7} };
        // print the given matrix 
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+ " ");
            } System.out.println();
        } 

        // now transpose the given matrix
        int transpose [][] =  new int[cols][rows];
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        // print the tranpose matrix 
        for(int i=0;i<transpose.length;i++){
            for(int j =0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+ " ");
            } System.out.println();
        }
    }
}
 