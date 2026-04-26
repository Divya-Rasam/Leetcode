public class RemoveDuplicatesString {
    public static void main(String[] args) {
        
        String s = "programming";

        boolean [] visited = new boolean[256];

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!visited[ch]) {
                result += ch;
                visited[ch] = true;
            }
        }

        System.out.println(result);
    }
}
