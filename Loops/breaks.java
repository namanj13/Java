import java.util.*;
public class breaks {
    public static void main(String args[]){
        for(int i = 1;i<=5;i++){
            if( i == 3){
                break;
            }
            System.out.println(i);
        }


        //KEEP ENTERING THE NUMBER TILL USER ENTERS A MULTIPLE OF 10
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if(n%10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }
}
