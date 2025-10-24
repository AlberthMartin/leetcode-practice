class Solution {
    public boolean isPalindrome(String string) {
        String cleanedString = string.replaceAll("[^a-zA-Z0-9]", "");
        cleanedString = cleanedString.toLowerCase();

        StringBuilder reversedString = new StringBuilder(cleanedString);
        reversedString.reverse();

        String ReversedString = reversedString.toString();

        if(cleanedString.equals(ReversedString)){
            return true;
        }
        else return false;
    }
}