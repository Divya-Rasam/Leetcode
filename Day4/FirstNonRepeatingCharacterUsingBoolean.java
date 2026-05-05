public class FirstNonRepeatingCharacterUsingBoolean {
    
    public static void main(String[] args) {
        
        String s = "aabbccddee";

        int [] freq = new int[256];

        boolean found = false;

        for ( int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch] == 1) {
                found = true;
                System.out.println("The first non-repeating character in the string " + s + " is : " + ch);
                return;
            }
        }

        if(!found) System.out.println("No non-repeating character");

    }
}
