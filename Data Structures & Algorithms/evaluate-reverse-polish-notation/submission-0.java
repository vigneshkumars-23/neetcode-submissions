class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equalsIgnoreCase("+")){
                int n2 = st.pop();
                int n1 = st.pop();
                st.push(n1+n2);
            }
            else if(tokens[i].equalsIgnoreCase("-")){
                int n2 = st.pop();
                int n1 = st.pop();
                st.push(n1-n2);
            }
            else if(tokens[i].equalsIgnoreCase("*")){
                int n2 = st.pop();
                int n1 = st.pop();
                st.push(n1*n2);
            }
            else if(tokens[i].equalsIgnoreCase("/")){
                int n2 = st.pop();
                int n1 = st.pop();
                st.push(n1/n2);
            } else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.pop();
    }
}
