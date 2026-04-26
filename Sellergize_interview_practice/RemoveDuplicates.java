public class RemoveDuplicates {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 2, 3, 4, 4};

        int [] arrRD = new int[arr.length];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean isFound = false;

            for (int k = 0; k < j; k++) {
                if(arr[i] == arrRD[k]) {
                    isFound = true;
                    break;
                }
            }

            if(!isFound) {
                arrRD[j] = arr[i];
                j++;
            }

        }

        for (int i = 0; i < j; i++) {
            System.out.println(arrRD[i] + " ");
        }

    }
}
