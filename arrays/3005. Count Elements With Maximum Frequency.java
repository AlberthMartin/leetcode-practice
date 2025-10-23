class Solution {
    public int maxFrequencyElements(int[] nums) {
        //Positive integers
        //Return the total frequencies of elements in nums such that those elements all have the maximum frequency
        HashMap<Integer, Integer> map = new HashMap<>(); //Key = number and value = frequency
        //1. Count the frequencys of the elements in the array:
        for(int i = 0; i<nums.length; i++){
            int key = nums[i];
            if(map.containsKey(key)){
                int value = map.get(nums[i]);
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, 1);
            }
        }
        //hitta max frequencyn
        int maxFreq = 0;

        for(int freq : map.values()){
            if(freq > maxFreq){
                maxFreq=freq;
            }
        }
        int result = 0;
        //Count the frequencyies of max
        for(int freq : map.values()){
            if(freq == maxFreq){
                result += freq;
            }
        }



    return result;
    }
}