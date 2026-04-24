public class ReverseArray {

    public static void main(String[] args) {
        

        int [] arr = {10, 20, 30, 40};

        ReverseArray ra = new ReverseArray();

        for (int num : arr) {
            System.out.print(num + " ");
        }

        ra.reverse(arr);


    }


    void reverse(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }


    }
}