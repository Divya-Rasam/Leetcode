public class PrimeNumber {
    public static void main(String[] args) {
        
        int n = 1;

        boolean isPrime = true;

        if (n == 1) { System.out.println("Not a prime nor composite"); return; }

        for(int i = 2; i <= Math.sqrt(n); i++ ) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }



                if(isPrime) System.out.println("number " + n + " is prime");
        else System.out.println("number " + n + " is not a prime");
    }




    
}
