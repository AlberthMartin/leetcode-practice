class Solution {
    public boolean isSubsequence(String sub, String string) {
        //Hittar där sub.charAt(i) == string.charAt(i);
        //Kollar längden på s
        //Håller koll på vilken bokstav vi är på i sub
        //Ser om vi kommer igenom hela sub

        int lengthOfSub = sub.length();
        //Indexet vi är på i substringen
        int index = 0;

        if(lengthOfSub == 0){
            return true;
        }

        for(int i = 0; i<string.length(); i++){
            if(sub.charAt(index) == string.charAt(i)){
                index++;
                if(index == lengthOfSub){
                    return true;
                }
        }

    }
    return false;
    }
}