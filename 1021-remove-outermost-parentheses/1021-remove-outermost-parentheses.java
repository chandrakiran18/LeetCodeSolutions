class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int par=0;
        for(char c:s.toCharArray()){
            if(par==1 && c==')'){
                par--;
                continue;
            }
            if(par>0){
                sb.append(c);
            }
            if(c=='(')par++;
            else par--;
        }
        return sb.toString();
    }
}