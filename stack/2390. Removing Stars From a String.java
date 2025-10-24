class Solution {
    public String removeStars(String s) {
        Stack <Character> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }

        }
        String st = "";
        int letters = stack.size();
        for(int i = 0; i<letters; i++){
            st = stack.pop() + st;
        }
        return st;
    }
}