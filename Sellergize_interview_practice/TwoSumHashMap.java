import java.util.HashMap;

public class TwoSumHashMap {
    public static void main(String[] args) {
        
        int [] arr = {2, 11, 7, 15};

        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();                 // Creates memory.

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];                                   // Current number.
            int complement = target - current;              // What number do I need?

            if(map.containsKey(complement)) {                       // map.get(complement)                    Have I already seen it?
                System.out.println(complement + " " + current);
                // System.out.println(map.get(complement) + " " + i);              if indices are needed
                return;
            } else {
                map.put(current, i);                      // No? Save current number for later.
            }

        }
    }
}
