class Solution {
    public String reverseWords(String s) {
        String[] parts=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<parts.length;i++){
            ans.append(new StringBuilder(parts[i]).reverse());
            if(i<parts.length-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}