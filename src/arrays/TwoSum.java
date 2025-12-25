package arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        //the idea is to take the compliment
        for(int i = 0; i < nums.length; i++){
            int compliment =target - nums[i];
//            compliment= 7
            // index= 1
            // value =2
            if(map.containsKey(compliment)){
                return   new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return nums;
    }
}
