public class Roman_to_Integer {                          // in process
    public static void main(String[] args) {
        
        String s = "III";

        // current < next → subtract, else → add

        for ( int i = 0; i < s.length()-2; i++) {
                if (s.charAt(i) < s.charAt(i+1)) {
                    int sub = s.charAt(i+1) - s.charAt(i);
                } else {
                    int add = s.charAt(i) + s.charAt(i+1);
                }
            }
            // int calc = add + sub;
            // return (add + sub);
        }

        // int roman = add + sub;


    }