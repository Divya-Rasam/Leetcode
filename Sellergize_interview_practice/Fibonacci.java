public class Fibonacci {
    public static void main(String[] args) {
        
        int n = 3;

        int a = 0, b = 1;
        if(n >= 1) System.out.println(a);
        if(n >= 2) System.out.println(b);
        

        for (int i = 0; i < n-2; i++) {
            int next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }
    }
}
