class Solution {
    public boolean rotateString(String str, String goal) {
        //I just make the string into an array
        //then i shift the element one full lap
        //if any of the versions match then retrun true
        //else return false

        //String string = new String(charArray);

        char[] arr = str.toCharArray();

        //Check each version
        for(int i = 0; i<str.length(); i++){

            //shift back all chars
            for(int j = 0; j<str.length()-1; j++){
                char temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
            }

            String str2 = new String(arr);

            if(str2.equals(goal)){
                return true;
            }
        }

        return false;
    }
}