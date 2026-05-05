public class BubbleSort {
    
    public static void main(String[] args) {
        
        int [] num = {5, 3, 8, 2};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0 ; j < num.length - i; j++) {
                if (num[i] > num[j]) {
                    num[j] = num[i];
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }


    }
}
