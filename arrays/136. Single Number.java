class Solution {
    public int singleNumber(int[] nums) {

        //go from start of array to end.
        // hold a curr elem
        //if an elem is the same as curr elem then change it,
        //else continue
        //the curr elem in the end is the one that only occured once


        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i<nums.length; i++){

            if(map.containsKey(nums[i])){
                int v = map.get(nums[i])+1;
                map.put(nums[i], v);
            }else{
                map.put(nums[i], 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if(value == 1){
                return key;
            }
}
        return -1;
    }
}