public class RemoveElement {
    public static void main(String[] args) {
        
        int [] nums = {0,1,2,2,3,0,4,2};

        int value = 2;

        Solution sol = new Solution();
        int result = sol.removeElement(nums, value);
        System.out.println(result);
    }
}

class Solution {
    public int removeElement(int[] nums, int value) {

        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != value) {
                nums[k] = nums[i];
                k++;
            } 

        }

        return k;
    }
}