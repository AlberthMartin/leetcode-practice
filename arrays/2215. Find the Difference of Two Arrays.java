class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        boolean exists = false;

        for(int i = 0; i<nums1.length; i++){
            //Kollar elementen
            for(int j = 0; j<nums2.length; j ++){
                //elementet finns i den andra listan
                if(nums1[i] == nums2[j]){
                    exists = true;
                }
            }
            if(exists == false && !(list1.contains(nums1[i]))){
                list1.add(nums1[i]);
            }
            exists = false;
        }

        for(int i = 0; i<nums2.length; i++){
            //Kollar elementen
            for(int j = 0; j<nums1.length; j ++){
                //elementet finns i den andra listan
                if(nums2[i] == nums1[j]){
                    exists = true;
                }
            }
            if(exists == false && !(list2.contains(nums2[i]))){
                list2.add(nums2[i]);
            }
            exists = false;
        }

        ArrayList<List<Integer>> listOflists = new ArrayList<List<Integer>>();

        listOflists.add(list1);
        listOflists.add(list2);

        return listOflists;
    }
}