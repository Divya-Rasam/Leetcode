package Max_Consecutive_Ones;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        
        int[] nums = {1,1,0,1,1,1};

        // iterate from first index... count 1s and do ++; break at zero and store it in largest, loop again starts, stops at zero, 
        // compares this count with before largest if large put this in largest... at the end print largest

        int largest = 0;       // 2  3
        int count = 0;        // 0 1 2 3

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                if (count > largest) {
                    largest = count;
                }
            } else if(nums[i] == 0) {
                count = 0;
            }
            
        }
        
        System.out.println(largest);

    }
}
