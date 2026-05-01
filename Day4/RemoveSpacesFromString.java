public class RemoveSpacesFromString {
    
    public static void main(String[] args) {
        
        String s = "I love Java";

        // Output: "IloveJava";

        String  r = "";

        for ( int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                r = r + ch;
            }
        }

        System.out.println(r);

    }
}
