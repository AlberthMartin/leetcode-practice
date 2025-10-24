class Solution {
    public boolean isValid(String s) {
        //I can make 2 stacks, one with opening paranteses and one with closing
        Stack<Character> opening = new Stack<>();
        if (s.length() == 1){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                opening.push(ch);
            }  else{
                    if (opening.empty()) {
                        return false; // no opening to match
                    }

                    char top = opening.peek();
                    if (ch == ')' && top == '(') {
                        opening.pop();
                    } else if (ch == '}' && top == '{') {
                        opening.pop();
                    } else if (ch == ']' && top == '[') {
                        opening.pop();
                    } else {
                        return false; // mismatch
                    }
                }
            }

        return opening.empty(); //must be fully matched
    }
}