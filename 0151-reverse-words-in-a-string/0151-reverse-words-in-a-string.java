class Solution {
    public String reverseWords(String s) {
        String[] parts=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=parts.length-1;i>=0;i--){
            if(!parts[i].isEmpty()){
                if(ans.length()>0){
                    ans.append(" ");
                }
                ans.append(parts[i]);
            }
        }
        return ans.toString();
    }
}