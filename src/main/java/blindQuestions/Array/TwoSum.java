package blindQuestions.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) { //2. 7. 11 . 15  - 26
        int[] res = new int[2];
//        for (int i = 0; i < nums.length; i++) {     // 85 ms
//            for (int j = i+1; j < nums.length; j++) {
//                if ((nums[i]+nums[j])==target){
//                    res[0]=i;
//                    res[1]=j;
//                    return res;
//                }
//            }
//        }
        Map<Integer,Integer> map = new HashMap();   // 3ms
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target-nums[i])){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
                return res;
            }
            map.put(nums[i], i);
        }

        return res;
    }
}
