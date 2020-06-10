package TwoSum;

import java.util.HashMap;

class Solution {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> sumMap = new HashMap<>();

        for (int x = 0; x < nums.length; x++) {

            Integer diff = (Integer) (target - nums[x]);

            if (sumMap.containsKey(diff)) {
                return new int[] { sumMap.get(diff), x };
            }

            sumMap.put(nums[x], x);
        }

        return null;
    }

    public static void main(String[] args) {

        // int[] input = { 2, 5, 5, 11 };
        int[] input = { 2, 7, 11, 15 };
        int target = 9;

        twoSum(input, target);

    }

}
