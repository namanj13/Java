public class Floyd {
    public static void floyd_triangle(int n, int num){
        // outer loop
         for(int i=1;i<=n;i++){
            // how many times nums is printed   
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            } System.out.println();
         }
    }

    // 0-1 Triagle 
     public static void zero_one_triangle(int n){
        // outer loop 
        for(int i =1;i<=n;i++){
            // inner loop - columns
            for(int j =1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            } System.out.println();
        }
     }
    public static void main(String args[]){
        floyd_triangle(5,1);
        zero_one_triangle(5);
    }
}
