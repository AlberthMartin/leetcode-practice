class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        //Store num of occ and the number
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums1.length; i++){
            if(map.containsKey(nums1[i])){
                int newcount = map.get(nums1[i]) + 1;
                map.put(nums1[i], newcount);
            }else{
                map.put(nums1[i], 1);
            }

        }

        // for nums1 = [1,2,2,1]
        // map = {1, 2}, {2, 2}
        //System.out.println("map: "+ map);

        //all unique elements in nums1

        //now we check which one of these is in nums2

        for(int j = 0; j<nums2.length; j++){
            //Current number in the other list
            int num = nums2[j];

            //Check if this number was in the other list
            if(map.containsKey(num)){
                //yes it was
                //and this many thimes
                int count = map.get(num);
                //need to check that the count is not 0
                if(count > 0){
                    //so add it to the list and update the count
                    list.add(num);
                    count = count - 1;
                    map.put(num, count);
                }
            }
        }

        //System.out.println("list: "+list);
        int[] ans = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}