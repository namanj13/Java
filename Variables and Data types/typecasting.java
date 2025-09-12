public class typecasting {
    public static void main(String args[]){
        // float a = 25.12f;
        // int b = a;          // this shows error because we are changing it from float to int in which data loss occur.
        float marks=99.9999f;
        int marks2 = (int) marks; 
        System.out.println(marks2);

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);       // charcater have some numbers that is already assign 
        System.out.println(number2); 
    }
}
