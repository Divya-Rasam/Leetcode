public class FindNumWithEvenNumOfDigi {
    public static void main(String[] args) {
        
        int [] nums = {12, 345, 2, 6, 7896}; 

        // output = 2

        // counter for even num .. check by looping if number length is even counter ++/// return counter at end
        FindNumWithEvenNumOfDigi f = new FindNumWithEvenNumOfDigi();
        System.out.println(f.findNumbers(nums));


 }

        public int findNumbers(int[] nums) {
        
                    int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int count2 = 0;
            int num = nums[i];
             while (num > 0) {
                count2++;
                num = num / 10;
             }
             if (count2 % 2 == 0) {
                count++;
             }
        }

        return count;
   
    }
}
