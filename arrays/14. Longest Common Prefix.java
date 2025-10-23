class Solution {
    public String longestCommonPrefix(String[] strs) {
    // "leetcode".contains("leet") → true
    //Prefixes of flower:
    /*
    "f"
    "fl"
    "flo"
    "flow"
    "flowe"
    "flower"
    */
    //Så jag tänker börja med det fulla order
    //och jämföra med de andra, sedan ta bort
    //sista bokstaven och upprepa
    String prefix = strs[0]; //the first word
    int lengthOfPrefix = strs[0].length();
    int j = 0;

    if(strs == null || strs.length == 0) return "";
    if(strs.length == 1) return strs[0];

    //Medan prefix inte är ""
    while(prefix.length()!=0){
        //ta det största prefixet (minskar hela tiden med ett index)
        prefix = prefix.substring(0, lengthOfPrefix -j);

        Boolean longestPrefix = true;

        //check if all strings contains that prefix
        for(int i = 1; i<strs.length; i++){
            //om inte stringen innehäller prefix then false
            if(!strs[i].startsWith(prefix)){
                longestPrefix = false;
                break;
            }
        }
        //Längsta prefixet hittat
        if(longestPrefix == true) break;
        //Gör samma igen med ett mindre prefix
        j++;
    }

    return prefix;
    }
}