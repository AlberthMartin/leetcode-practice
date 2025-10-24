class Solution {
    public int lengthOfLastWord(String s) {;
        String trimmedStr = s.trim();
        if(trimmedStr.length() == 1){
            return 1;
        }

        //count the length of the last world
        //We now the last letter is last index

        int ans = 0; //all ord är iaf 1

        int lastI = trimmedStr.length()-1;
        //System.out.println(lastI);
        char ch = trimmedStr.charAt(lastI);

        while( lastI >=0){
            ch = trimmedStr.charAt(lastI);
            if(ch == ' ') break;
            ans++;
            lastI--;
        }

         return ans;
    }
}