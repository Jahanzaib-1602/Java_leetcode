import java.util.HashMap;
import java.util.Arrays;

 class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int req_no = target - nums[i];
            if (hm.containsKey(req_no)) {
                // here the meaning of key word in java is the actual number and the meaning of the value word is the index
                int[] arr = {hm.get(req_no), i};
                return arr;
            }
            hm.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(new Solution().twoSum(nums, 9)));
    }
}
