public class Reversea {

    public static int reverse(int numbers[]){
        int first = 0;
        int end = numbers.length-1;
        while(first < end){
            //swap 
            int temp = numbers[end];
            numbers[end] = numbers[first];
            numbers[first] = temp;
            first++;
            end--;
        } return 0;
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};

        reverse(numbers);
        // print
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
