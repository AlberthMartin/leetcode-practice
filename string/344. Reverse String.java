class Solution {
    public void reverseString(char[] charArray) {
        StringBuilder sb = new StringBuilder("");

        for(char ch : charArray){
            sb.append(ch);
        }

        sb.reverse();

        for(int i = 0; i<charArray.length; i++){
            charArray[i] = sb.charAt(i);
        }
    }
}