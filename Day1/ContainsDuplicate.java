public class ContainsDuplicate {

    public static void main(String[] args) {
        

        int [] nums = {1,2,3,1};

        boolean containsDup = false;

        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    containsDup = true;
                    break;
                }
            }
        }

        if (containsDup) { System.out.println("true");}
        else { System.out.println("false");};

    }
}









        // HashSet<Integer> set = new HashSet<>();

        // for (int num : nums) {
        //     if (set.contains(num)) {
        //         return true;
        //     }
        //     set.add(num);
        // }

        // return false;