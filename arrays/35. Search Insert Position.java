class Solution {
    public int searchInsert(int[] nums, int target) {

        //Input: sorted array, unique integers, target value
        //Return: if index is found return that
        // if not found where it should be, return the index of where it should be.

        //case 1: index found: [1,3,5,6] target = 5, return: 2
        //case 2: [1,3,5,6] target = 2, output: 1, index of where it should be.

        //so loop and compare values, find the place where the target should be return the index.

        if(nums.length == 1){
            if(nums[0]<target){
                return 1;
            }else{
                return 0;
            }
        }

        int leftIndex = 0; //first index.

        while(nums[leftIndex]<target){
            if(leftIndex == nums.length-1){
                return leftIndex+1;
            }
            leftIndex++;
        }
        //now the nums[leftIndex] if bigger than target so it should be inserted before this:
        return leftIndex;
    }
}