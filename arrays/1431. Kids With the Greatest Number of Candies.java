class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int mostCandies = 0;

        //Find the highest amouth of candies
        for(int i = 0; i<candies.length; i++){
            if(candies[i]>mostCandies){
                mostCandies = candies[i];
            }
        }

        for(int i = 0; i<candies.length;i++){
            if(candies[i]+extraCandies >= mostCandies){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;
    }
}