public class functions2 {
    public static void main(String args[]){  // WE ARE LEARNING CALL BYE VALUE AND CALL BY REFERENCE 
        // swap - values exchange
        int a = 5;
        int b = 10;

        // swap 
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a value : " + a);
        System.out.println("b value : "+ b);
    }
}
