class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //strs = ["eat","tea","tan","ate","nat","bat"]
        //för varje string
        //1.Gör substringsen till char array .toCharArray
        //2.sort,
        //3. gör tillbak till sting --> keyn till hashmappen Hashmap<String, String[]>
        //4. granska om key stringen finns i hashmapen, annars lägg till
        //5. Borde hamna med en Hashmap ("abt", ["bat"], "ant" ["nat", "tan"])
        //6. Sen är den bara att göra hasmapen till en List<List<String>>


        HashMap<String, List<String>> map = new HashMap<>();      //HashMap<Key, Value>

        for(int i = 0; i<strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }

        }
        System.out.println(map);
        // Borde hamna med en Hashmap ("abt", ["bat"], "ant" ["nat", "tan"])
        List<List<String>> result = new ArrayList<>();


        for (List<String> value : map.values()) {
            result.add(value);
        }

        return result;
        //[["bat"],["nat","tan"],["ate","eat","tea"]]
    }
}