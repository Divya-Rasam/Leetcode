package Super_Easy;

public class Min_num_prac {
    
    public static void main(String[] args) {
        
        int [] nums = { 5, 4, 2, 3};

        // Output: [3,2,5,4]

        for ( int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        // for ( int arr : nums) {
        //     System.out.print(arr + " ");
        // }

        int [] array = new int[nums.length];

        for (int i = 0; i < nums.length; i+=2) {
            array[i] = nums[i+1];
            array[i+1] = nums[i];
        }

        for (int arr : array) {
            System.out.print(arr + " ");
        }

        











    }
}
