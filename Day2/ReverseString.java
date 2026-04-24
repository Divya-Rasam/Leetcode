public class ReverseString {
    
    public static void main(String[] args) {
        
        char [] a = {'h', 'e', 'l', 'l', 'o'};

        String reverse =  new StringBuilder(new String(a)).reverse().toString();

        System.out.println(reverse);


    }
}
