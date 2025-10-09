package Super_Easy;

public class Minimum_Number_Game {
    public static void main(String[] args) {
        
    int [] nums = { 5, 4, 2, 3 };

    // Output: [3,2,5,4]

    // bubble sort 

    for ( int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length; j++ ) {
            if (nums[i] > nums[j]) {
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

    // for (int arr : nums) {
    //     System.out.print(arr + " ");
    // }


    // System.out.println();

    int [] arr = new int[nums.length]; 

    for ( int i = 0; i < nums.length; i+=2) {
        arr[i] = nums[i+1];
        arr[i+1] = nums[i];
    }

    for ( int array : arr) {
        System.out.print(array + " ");
    }

    }

}



// class Solution {
//     public int[] numberGame(int[] nums) {
//         Arrays.sort(nums);
//         // Step 2: Create result array
//         int[] arr = new int[nums.length];
//         // Step 3: Swap pairs
//         for (int i = 0; i < nums.length; i += 2) {
//             arr[i] = nums[i + 1];   // Bob’s turn (he appends first)
//             arr[i + 1] = nums[i];   // Alice’s turn (she appends next)
//         }
//         return arr;
//     }
// }