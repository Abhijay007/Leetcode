class Solution {
    public String interpret(String command) {
        String st= command.replace("G","G");
        st=st.replace("()","o");
        st=st.replace("(al)","al");
        
        return st;
    }
}