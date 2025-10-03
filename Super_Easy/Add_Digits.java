package Super_Easy;

public class Add_Digits {
    public static void main(String[] args) {
        
// Input: num = 38        3 + 8 = 11            1 + 1 = 2
// Output: 2

// Input: num = 0
// Output: 0

// 38
//  8  sum + 8     3 + sum 8 = 11
//  11 sum + 1      1 + sum 1 = 2

        int num = 38;

        while ( num >= 10){
            int sum = 0;           

            while (num >0) { 
                int last_digit = num % 10;
                sum += last_digit;
                num /= 10;
            }

            num = sum;
        }


        System.err.println(num);

    }
}
