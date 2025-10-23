class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //numbers = [2,7,11,15], target = 9
        int left = 0;
        int right = numbers.length-1;//indexes

        while(left<right){

            int sum = numbers[left]+numbers[right];

            if(sum == target){
                return new int[]{left+1, right+1};
            }

            if(sum<target){
                left++;
            }
            if(sum>target){
                right--;
            }
        }
        return null;
    }
}