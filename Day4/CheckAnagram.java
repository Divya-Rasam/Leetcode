public class CheckAnagram {
    
    public static void main(String[] args) {
        
        String s1 = "listen";
        String s2 = "silent";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // boolean isTrue = true;

        if (s1.length() != s2.length()) {
            // isTrue = false;
            System.out.println("The strings : " + s1 + " and " + s2 + " are not anagrams");
            return;
        }


        int [] freq = new int[256];

        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq[ch]++;
        }

        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            freq[ch]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                // isTrue = false;
                System.out.println("Not anagram");
                return;
            }
        }

        System.out.println("Is an anagram");


        // if(isTrue) System.out.println("The strings : " + s1 + " and " + s2 + " are anagrams");
        // else System.out.println("The strings : " + s1 + " and " + s2 + " are not anagrams");



    }
}
