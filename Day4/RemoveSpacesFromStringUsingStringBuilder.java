public class RemoveSpacesFromStringUsingStringBuilder {
 
    public static void main(String[] args) {
        
        String s = "I love Java";

        // Output: "IloveJava";

        StringBuilder r = new StringBuilder();

        for ( int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                r.append(ch);
            }
        }

        System.out.println(r);
    }
}
