class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '}'){
                if(!st.isEmpty() && st.peek() == '{')
                    st.pop();
                else
                    return false;
            }else if(c == ')'){
                if(!st.isEmpty() && st.peek() == '(')
                    st.pop();
                else
                    return false;
            }else if(c == ']'){
                if(!st.isEmpty() && st.peek() == '[')
                    st.pop();
                else
                    return false;
            } else {
                st.push(new Character(c));
            }
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}
