class Solution {
    public int firstUniqChar(String s) {
        //Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
        //Try without using brute force

        //return the index of the first unique char

        //i could store all values in a hashmap
        //then go through the string again from the beginning and the first elem that only has one
        //occurence return that index

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch) + 1;
                map.put(ch, count);
            } else {
                map.put(ch, 1);
            }
        }


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;

    }
}