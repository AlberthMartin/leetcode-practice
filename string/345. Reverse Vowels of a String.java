class Solution {
    public String reverseVowels(String s) {
        //Går igenom stringen och sparar varje vocal i en stack
        //Sedan går jag igenom stringen pånytt ändrar varje vocal till den vocalen i stacken

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' ||
            s.charAt(i) == 'e' ||
            s.charAt(i) == 'i' ||
            s.charAt(i) == 'o' ||
            s.charAt(i) == 'u' ||
            s.charAt(i) == 'A' ||
            s.charAt(i) == 'E' ||
            s.charAt(i) == 'I' ||
            s.charAt(i) == 'O' ||
            s.charAt(i) == 'U'){
                stack.push(s.charAt(i));
            }
        }
        //Build a new string
        String ans = "";

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' ||
            s.charAt(i) == 'e' ||
            s.charAt(i) == 'i' ||
            s.charAt(i) == 'o' ||
            s.charAt(i) == 'u' ||
            s.charAt(i) == 'A' ||
            s.charAt(i) == 'E' ||
            s.charAt(i) == 'I' ||
            s.charAt(i) == 'O' ||
            s.charAt(i) == 'U'){
                ans += stack.pop();
            }
            else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}