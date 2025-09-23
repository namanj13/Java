public class reversenum {
    public static void main(String main[]){
        int n = 13603;
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10;  // n/=10
        }
        System.out.println();

        // Now in for loop 
        for(int m = 91204; m>0; m/=10){
            int digit = m%10;
            System.out.print(digit);
        }

        System.out.println();

        // Reverse the given Number

        int s = 10899;
        int rev = 0;
        while(s>0){
            int lastdigit = s%10;
            rev = (rev * 10) + lastdigit;
            s = s/10;
        }
        System.out.println(rev);
        }
    }

