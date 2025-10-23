class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Top K most frequent elements
        //Hash table <Elements, howMany>
        //Sort from most to least
        //pick the k first into an array

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            int key = nums[i];

            if(map.containsKey(key)){
                map.put(nums[i], map.get(key)+1);
            }else{
                map.put(key, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        System.out.println(list);


        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }



    return ans;
    }
}