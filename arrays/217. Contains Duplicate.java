class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Array Hash table sorting
        // HashMap to store value -> index
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);  // 8 at 0,
        }

        return false;
    }
}