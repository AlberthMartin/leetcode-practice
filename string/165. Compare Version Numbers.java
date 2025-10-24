class Solution {
    public int compareVersion(String v1, String v2) {
        //Two pointers, String
        //Compare two strings

        //if version1 < version2 return -1
        //if version1 > version2 return 1

        //Input: version1 = "1.2", version2 = "1.10"

        String[] v1array = v1.split("\\.");
        String[] v2array = v2.split("\\.");
        System.out.print(Arrays.toString(v1array));
        System.out.print(Arrays.toString(v2array));

        //checka om
        //gå igenom alla segment
        //om v1=v2 gå vidare
        //om v2>v1 return -1
        //om v2<v1 return 1
        int n = Math.max(v2array.length, v1array.length);
        int left = 0;
        while(left<n ){

            int v1value = (left < v1array.length) ? Integer.parseInt(v1array[left]) : 0;
            int v2value = (left < v2array.length) ? Integer.parseInt(v2array[left]) : 0;

            if(v1value == v2value){
                left++;
                continue;
            }else if(v1value < v2value){
                return -1;
            }else if(v1value > v2value){
                return 1;
            }
        }
        return 0;
    }
}