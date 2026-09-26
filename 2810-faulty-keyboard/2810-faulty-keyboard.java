class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='i'){
                sb=sb.reverse();
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}