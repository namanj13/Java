public class invertedstar {
    public static void main(String args[]){
        for(int lines =1;lines<=4;lines++){
            for(int star = 4 ; star>=lines;star--){
                System.out.print("*");
            }
            System.out.println();
        }

        // ANOTHER WAY MAM HAS TAUGHT 
        int n =7;
        for(int lines = 1;lines<=n;lines++){
            for(int star =1 ; star <=(n-lines+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
