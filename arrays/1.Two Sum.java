/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        //Map<numberNeededForTarget, index>

        //ex nums = [3,2,4] target = 6
        for(int i = 0; i<nums.length; i++){
            int numNeeded = target - nums[i];
            //1. numNeeded = 3
            //2. numNeeded = 4
            //3. numNeeded = 2

            if(map.containsKey(numNeeded)){
                return new int[] {map.get(numNeeded), i};
            }
            else{
                map.put(nums[i], i);
                //map<3, 0>
                //map<2, 1>
            }
        }
        return null;
    }
}