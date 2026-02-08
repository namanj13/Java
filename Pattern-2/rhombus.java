public class rhombus {
    public static void solid_rhombus(int n){
        // outer loop 
        for(int i=1;i<=n;i++){
            // spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars 
            for(int j=1;j<=n;j++){
                System.out.print("*");
            } System.out.println();
        }
    }


    public static void hollow_rhombus(int n ){
        for(int i=1;i<=n;i++){
            // spaces 
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            // hollow -rectangel stars here j is column 
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
    public static void main(String args[]){
        solid_rhombus(5);
        hollow_rhombus(5);
    }
}
