class Solution {
    public void rotate(int[] nums, int k) {

        int[] newArray = new int[nums.length];

        int rotatedIndex;

        k = k % nums.length;

        if(nums.length<=1){
            return;
        }

        for(int index = 0; index < nums.length; index++){
            rotatedIndex = index + k;
            if(rotatedIndex >= nums.length){
                rotatedIndex = rotatedIndex - nums.length;
                newArray[rotatedIndex]=nums[index];
            }
            else{
                newArray[rotatedIndex]=nums[index];
            }
        }
        System.out.print(Arrays.toString(newArray));

        for (int i = 0; i < newArray.length; i++) {
            nums[i] = newArray[i];
        }
    }
}