class Solution {
    public int longestConsecutive(int[] nums) {
        //jag går igenom och gör en hashset av alla elem

        //Hålla koll på längsta seqvensen element efter varan

        //Skulle jag kunna sort? och sedan gå ingenom från vänster och se all följande eleme är +1, annars starta om och spara seqvens om den är större än longestSeq
        if(nums.length == 0 ){
            return 0;
        }

        int longestSeq = 1;
        int currSeq = 1;

        Arrays.sort(nums); //O(n log(n))

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]+1 == nums[i+1]){
                currSeq++;
            }
            if(nums[i] == nums[i+1]){
                continue;
            }

            if(currSeq>longestSeq){
                longestSeq = currSeq;
            }

            if(nums[i]+1 != nums[i+1]){
                currSeq=1;
            }
        }

        return longestSeq;
    }
}