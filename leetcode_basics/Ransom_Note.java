package leetcode_basics;                             // hard

import java.util.Arrays;

public class Ransom_Note {
    public static void main(String[] args) {
        
        String ransomNote = "a", magazine = "b";

        // Output: false

        // Array to store frequency count of each letter (26 lowercase English letters)
        int [] letterFrequency = new int[26];

        // Count the frequency of each letter in the magazine
        for (int i = 0; i < magazine.length(); i++) {
            char currentChar = magazine.charAt(i);
            // Convert character to index (0-25) by subtracting 'a'
            int charIndex = currentChar - 'a';
            letterFrequency[charIndex]++;
        }

        // printing intermediate output
        System.out.println(Arrays.toString(letterFrequency));

        // Check if ransom note can be constructed by consuming letters from magazine
        for (int i = 0; i < ransomNote.length(); i++) {
            char currentChar = ransomNote.charAt(i);
            // Convert character to index (0-25) by subtracting 'a'
            int charIndex = currentChar - 'a';

            // Decrement the count for this letter and check if it goes negative
            letterFrequency[charIndex]--;
            if (letterFrequency[charIndex] < 0) {
                // Not enough of this letter in magazine to construct ransom note
                System.out.println("false");
                return;
            }
        }

        // All letters in ransom note can be constructed from magazine
        System.out.println("true");


    }
}








        // int [] arr = new int[26];

        // for (char r : ransomNote.toCharArray()) {
        //     arr[r - 'a']++;
        // }

        // for (char r : magazine.toCharArray()) {
        //     arr[r - 'a']--;
        // }

        // for (int i : arr) {
        //     if (i > 0) {
        //         return false;
        //     }
        // }

        // return true;