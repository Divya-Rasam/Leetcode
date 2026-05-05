public class FirstNonRepeatingCharacter {
    
    public static void main(String[] args) {
        
        String s = "aabbcde";

        int [] freq = new int[256];

        for ( int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch] == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
