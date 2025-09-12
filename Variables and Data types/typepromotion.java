public class typepromotion {
    public static void main(String args[]){
        char a ='a';
        char b = 'b';
        // char c = a-b;  this is not prssible because hum character ko expression mein convet kr rhe h 
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(a);
        System.out.println(b-a);


        int m = 10;
        float n = 255.25f;
        long s = 19;
        double v = 88.25;
        double ans = m+n+s+v;
        System.out.println(ans);    

    }
}
