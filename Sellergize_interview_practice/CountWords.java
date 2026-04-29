public class CountWords {
    public static void main(String[] args) {
        
        String s = "Java ffhjj"; 

        int count = 0;

        if (!s.isEmpty()) count = 1;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}
