public class Palindrome_Number {
    public static void main(String[] args) {
        
        int x = 121;
        int og = x;

        int reverse = 0;

        while ( x > 0 ) {
            int last_digit = x % 10;
            reverse = reverse * 10 + last_digit;
            x = x / 10;
        }

        if (reverse == og) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
}


