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