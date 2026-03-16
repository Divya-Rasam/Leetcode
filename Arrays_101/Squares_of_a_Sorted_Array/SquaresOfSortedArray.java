package Squares_of_a_Sorted_Array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        
        int[] nums = {-7,-3,2,3,11};
        SquaresOfSortedArray sosa = new SquaresOfSortedArray();
        System.out.println(Arrays.toString(sosa.sortedSquares(nums)));
    }

    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int pos = nums.length -1;

        int [] result = new int[nums.length];

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos] = nums[left] * nums[left];
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        }

        return result;



    }
}
