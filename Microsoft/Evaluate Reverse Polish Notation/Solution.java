class Solution {
    public int evalRPN(String[] tokens) {
        int ans;
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            try{
                int a=Integer.parseInt(tokens[i]);
                st.push(a);
            }
            catch(Exception e){
                int n1=st.pop();
                int n2=st.pop();
                switch(tokens[i]){
                    case "+":
                    st.push(n1+n2);
                    break;
                    case "*":
                    st.push(n1*n2);
                    break;
                    case "/":
                    st.push(n2/n1);
                    break;
                    case "-":
                    st.push(n2-n1);
                    break;
                }
            }
        }
        return st.pop();
    }
}
