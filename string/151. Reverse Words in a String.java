class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();

        String temp = "";

        for(int i = 0; i<s.length() ; i++){
            //Sista ordet
            if(i == s.length()-1 && s.charAt(i) != ' '){
                temp += s.charAt(i);
                stack.push(temp);

            }
            // om ett mellanslag kommer och temp stringen inte är tom
            else if(s.charAt(i) == ' ' && temp != ""){
                //Spara ordet på stacken
                stack.push(temp);
                //reset ordet
                temp = "";
            }
            else if(s.charAt(i) != ' '){
                temp += s.charAt(i);
            }
        }

        String ans = "";

        while(!stack.isEmpty()){
            ans += stack.pop();
            if(!stack.isEmpty()){
                ans += ' ';
            }

        }

        return ans;
    }
}