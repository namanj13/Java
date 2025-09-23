import java.util.*;
public class continues {
    public static void main(String args[]){
        for(int i =1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }

        // Display all the numbers entered by user except numtilples of 10
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            if (n% 10 == 0){
                continue;
            }
            System.out.println(n);
        }while(true);

    }
}
