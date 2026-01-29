package leetcode_basics;
public class _1342 {                                                  // Number of Steps to Reduce a Number to Zero
    public static void main(String[] args) {
        
        // int num = 14;             // 6

        // Explanation: 
        // Step 1) 14 is even; divide by 2 and obtain 7. 
        // Step 2) 7 is odd; subtract 1 and obtain 6.
        // Step 3) 6 is even; divide by 2 and obtain 3. 
        // Step 4) 3 is odd; subtract 1 and obtain 2. 
        // Step 5) 2 is even; divide by 2 and obtain 1. 
        // Step 6) 1 is odd; subtract 1 and obtain 0.


        // int num = 8;              // 4
        int num = 123;            // 123


        // if num is even / 2
        // if num is odd - 1

        // while num != 0

        // set counter for how many times we did loops

        int count = 0;

        while ( num != 0 ) {
            if ( num % 2 == 0) {
                num = num / 2;
                count++;
            } else {
                num = num - 1;
                count++;
            }
        }

        System.out.println(count);



    }
}
