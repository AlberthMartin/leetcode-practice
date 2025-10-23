class Solution {
    public int largestAltitude(int[] gain) {
        int largestAltitude = 0;
        int currentAltitude = 0;

        for(int i = 0; i<gain.length; i++) {
            currentAltitude += gain[i];

            if(currentAltitude > largestAltitude){
                largestAltitude = currentAltitude;
            }
        }

        return largestAltitude;
    }
}