public class ternary {
    public static void main(String args[]){
        int number = 4;

        // using ternary oprator
        String type = ((number % 2) == 0) ? "even":"odd";
        System.out.println(type);

        // question

        int marks = 27;

        String student = (marks>=33)? "pass":"fail";
        System.out.println(student);
    }
}
