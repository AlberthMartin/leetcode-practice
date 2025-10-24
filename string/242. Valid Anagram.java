class Solution {
    public boolean isAnagram(String string1, String string2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i<string1.length(); i++){

            char c = string1.charAt(i);

            //if the char is in the map
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c)+1);
            }
            //first occurence
            else{
                map1.put(c, 1);
            }
        }

        for(int i = 0; i<string2.length(); i++){
            //if the char is in the map
            char c = string2.charAt(i);

            if(map2.containsKey(c)){
                map2.put(c, map2.get(c)+1);
            }
            //first occurence
            else{
                map2.put(c, 1);
            }
        }

        if(map1.equals(map2)){
            return true;
        }
        else{
            return false;
        }

    }
}