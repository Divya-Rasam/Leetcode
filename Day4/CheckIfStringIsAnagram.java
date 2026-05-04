public class CheckIfStringIsAnagram {
    public static void main(String[] args) {
        
        String a = "Earth";
        String b = "Heart";

        if (a.length() != b.length()) {
            System.out.println("The strings / words : " + a + " and " + b + " are not anagrams");
            return;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int [] freq = new int[256];

        for (int i = 0 ; i < a.length(); i++) {
            char ch = a.charAt(i);
            freq[ch]++;
        }

        for (int i = 0 ; i < b.length(); i++) {
            char ch = b.charAt(i);
            freq[ch]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println("The strings / words : " + a + " and " + b + " are not anagrams");
                return;
            }
        }

        System.out.println("The strings / words : " + a + " and " + b + " are anagrams");

    }
}
