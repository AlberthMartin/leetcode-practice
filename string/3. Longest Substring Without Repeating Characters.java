class Solution {
    public int lengthOfLongestSubstring(String str) {
        if (str.length() == 0) return 0;

        int left = 0;
        int right = 0;
        int maxLen = 0;

        HashSet<Character> chars = new HashSet<>();

        while (right < str.length()) {
            char current = str.charAt(right);

            // If duplicate found → move left until it's gone
            if (chars.contains(current)) {
                chars.remove(str.charAt(left));
                left++;
            } else {
                // Add new char and update max
                chars.add(current);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }

        return maxLen;
    }
}