class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
        int curr = nums[0];
        uniqueElements.add(curr);

        int i = 1;
        while(i<nums.length){
            //skip duplicates
            while(i<nums.length && curr == nums[i] ){
                i++;
            }
            if(i<nums.length){
                curr= nums[i];
                uniqueElements.add(curr);
                i++;
            }
        }

        System.out.print(uniqueElements);

        for(int j=0; j<uniqueElements.size(); j++){
            nums[j] = uniqueElements.get(j);
        }

        return uniqueElements.size();
    }
}