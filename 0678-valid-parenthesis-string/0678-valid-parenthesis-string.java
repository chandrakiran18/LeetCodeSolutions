class Solution {
    public boolean checkValidString(String s) {
        int op=0;
        int cl=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                op++;
                cl++;
            }else if(c==')'){
                op--;
                cl--;
            }else{
                op--;
                cl++;
            }
            if(cl<0)return false;
            if(op<0)op=0;
        }
        return op==0;
    }
}