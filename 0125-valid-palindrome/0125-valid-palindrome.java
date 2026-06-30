class Solution {
    public boolean isPalindrome(String s) {
        String s2=s.toLowerCase();
        String s1="";
        for(char c:s2.toCharArray()){
            if(c>='a' && c<='z'){
            s1+=c;
            }
            else if(Character.isDigit(c)){
                s1+=c;
            }
        }
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        if(s1.equals(sb.toString()))return true;
        return false;
    }
}