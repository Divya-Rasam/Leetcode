package Super_Easy;

public class First_Palindromic_String_in_Arr {

    public static void main(String[] args) {

        String[] words = {"abc", "car", "ada", "racecar", "cool"};

        for (int i = 0; i < words.length; i++) {
            // make a reversed version of the word
            String reverse = new StringBuilder(words[i]).reverse().toString();

            // check if original and reversed are same
            if (words[i].equals(reverse)) {
                System.out.println(words[i]);
                return; // stop after finding the first palindrome  
            }
        }
    }
}
































// package Super_Easy;

// public class First_Palindromic_String_in_Arr {
    
//     public static void main(String[] args) {
        

//         String [] words = {"abc","car","ada","racecar","cool"};

//         for ( int i = 0; i < words.length; i++) {
//             String reverse = new StringBuilder(words[i].reverse().toString());

//             if (wo)
//         }

//         // String[] words = {"abc", "car", "ada", "racecar", "cool"};

//         // Output: "ada"

//         // for ( int i = 0; i < words.length; i++ ) {
//         //     System.out.println(words[i]);
//         //     // String reverse = words[i].split('').reverse().join('');
//         //     // abc
//         //     for ( int j = 0; j < words[i].length(); j++ ) {
//         //         // System.out.println(words);
//         //          new StringBuilder(words[i].reverse().toString());
//         //         if ( StringBuilder.equals(words[i]));
//         //         System.out.println(words[i]);
//         //         break;;
//         //     }

//             // if ( words[i] == reverse ) {
//             //     System.out.println(words[i]);
//             //     return;
//             // }

//         }

//     }
