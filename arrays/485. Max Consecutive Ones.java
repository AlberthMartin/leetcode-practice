class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxC = 0;
        int curr = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                curr++;

                if(curr>maxC){
                    maxC=curr;
                }
            }
            else{
                curr = 0;
            }
        }
        return maxC;
    }
}