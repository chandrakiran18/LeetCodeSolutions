class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        while(i<first.length() && first.charAt(i)==last.charAt(i))i++;
        String ans="";
        if(i==0)return ans;
        else if(i!=0){
            for(char ch:first.toCharArray()){
                i--;
                ans+=ch;
                if(i==0)break;
            }
        }
        return ans;
    }
}