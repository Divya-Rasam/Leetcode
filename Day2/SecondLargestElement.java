public class SecondLargestElement {
    public static void main(String[] args) {
        

        int [] arr = {10, 50, 30, 40};

        SecondLargestElement sle = new SecondLargestElement();
        int result = sle.secondLargest(arr);

        if (result == -1) {
            System.out.println("No second largest");
        } else System.out.println(result);


    }


    int secondLargest(int [] arr) {

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if(arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }

        if (second_largest == Integer.MIN_VALUE) {
            return -1;
        }

        return second_largest;
    }
}
