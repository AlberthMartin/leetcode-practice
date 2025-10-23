class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i = 0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }

        for(int i = 0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }
        //set1 = [1,2] and set2 = [2]

        //all unique elements in nums1 and nums2

        for(int num : set1){
            if(set2.contains(num)){
                list.add(num);
            }
        }


        int[] ans = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}