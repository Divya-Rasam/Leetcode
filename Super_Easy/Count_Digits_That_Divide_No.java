package Super_Easy;

public class Count_Digits_That_Divide_No {
    
    public static void main(String[] args) {
        
// Example 1:
// Input: num = 7
// Output: 1
// Explanation: 7 divides itself, hence the answer is 1.

// Example 2:
// Input: num = 121
// Output: 2
// Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.

// Example 3:
// Input: num = 1248
// Output: 4
// Explanation: 1248 is divisible by all of its digits, hence the answer is 4.


        int num = 7;

        // let count 0
        // loop through all digits need to do it manually
            // see each digit divisible by num
                // if divisible count++ return count

        
        int count = 0;
        int og_num = num;

        while ( num > 0 ) {
            int last_digit = num % 10;
            if ( last_digit != 0 && og_num % last_digit == 0) {
                count++;
            }
            num = num / 10;
        }

        System.out.println(count);
















        // int count = 0;
        // int og_num = num;

        // while ( num > 0 ) {
        //     int last_digit = num % 10;
        //     if ( last_digit != 0 && og_num % last_digit == 0 ) {
        //         count++;
        //     }
        //     num = num / 10;
        // }

        // System.out.println(count);

    }
}
