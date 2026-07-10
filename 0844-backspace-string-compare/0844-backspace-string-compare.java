class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!='#'){
                sb.append(c);
            }else if(sb.length()>=1){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        for(char c:t.toCharArray()){
            if(c!='#'){
                sb1.append(c);
            }else if(sb1.length()>=1){
                sb1.deleteCharAt(sb1.length()-1);
            }
        }
        return sb.toString().equals(sb1.toString());
    }
}