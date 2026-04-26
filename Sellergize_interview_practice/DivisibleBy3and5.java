public class DivisibleBy3and5 {
    public static void main(String[] args) {
        

        int n = 40;

        for(int i = 1; i <= n; i++) {
            if(i %  15 == 0) {
                System.out.print("FizzBuzz ");
            } else if(i % 3 == 0) {
                System.out.print("Fizz ");
            } else if(i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
