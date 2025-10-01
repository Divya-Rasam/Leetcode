
import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {
    public static void main(String[] args) {

// class Solution {
//     public List<String> fizzBuzz(int n) {
//         List<String> result = new ArrayList<>();

//         for (int i = 1; i <= n; i++) {
//             String str = "";
            
//             if (i % 3 == 0) str += "Fizz";
//             if (i % 5 == 0) str += "Buzz";
            
//             if (str.isEmpty()) str = String.valueOf(i);
            
//             result.add(str);
//         }

//         return result;
//     }
// }

        int n = 15;

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String str = "";

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBizz ");
            } else 
            if (i % 3 == 0) str += "Fizz ";
            if (i % 5 == 0) str += "Bizz ";
            
        }







        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBizz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Bizz ");
            } else {
                System.out.print(i + " ");
            }
        }









    }
}













