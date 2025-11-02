package Super_Easy;

public class Panagram_sentence {
    public static void main(String[] args) {
        
    // Input: 
    String sentence = "thequickbrownfoxjumpsoverthelazydog";
    // Output: true

    // Input: sentence = "leetcode"
    // Output: false

        int [] array = new int[26];

        for ( char ch : sentence.toCharArray()) {
            int index = ch - 'a';
            array[index] = 1;
        }

        for (int index : array) {
            if (index == 0) {
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");


    
    // int [] array = new int[26];
    // for (char ch : sentence.toCharArray()) {
    //     int index = ch - 'a';
    //     array[index] = 1;
    // }
    // for (int index : array) {
    //     if (index == 0) {
    //         System.out.println("false");
    //         return;
    //     } 
        
    // }
    //         System.out.println("true");

            
    }
}