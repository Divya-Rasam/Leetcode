public class SelectionSort {
    
    public static void main(String[] args) {
        
        int [] num = { 5, 7, 4, 6, 41, 35, 80 };


        for (int i = 0; i < num.length -1; i++){

            int minIndex = i;

            for (int j = i+1; j < num.length; j++) {
                if (num[j] < num[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;

        }

        for ( int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
