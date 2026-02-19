public class sorted {
    public static boolean stairCaseSeaarch(int matrix[][], int key){
        // int row = 0, col = matrix[0].length-1;
        // while(row<matrix.length && col>=0){
        //     if(matrix[row][col] == key){
        //         System.out.println("found key at: (" + row + "," + col + ")");
        //         return true;
        //     } else if(key < matrix[row][col]){
        //         col--;
        //     } else {
        //         row++;
        //     } 
        // }


        //  THIS IS THE ANOTHER APPROACH TO DO THE SAME THING it is based on the same logic but we are starting from the bottom left corner instead of top right corner
        int row =  matrix.length-1, col =0;
        while(row >=0 && col<matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("forun key at: (" + row + ", " + col + ")");
                return true;
            } else if(key < matrix[row][col]){
                row--;
            } else {
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String agrs[]){
        int matrix [][] = {{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}};
        int key = 33;
        System.out.println(stairCaseSeaarch(matrix, key));
    }
}
