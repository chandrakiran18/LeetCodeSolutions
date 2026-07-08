class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int n=word1.length();
        int n1=word2.length();
        int n2=Math.max(n,n1);
        int flag1=0;
        int flag2=0;
        for(int i=0;i<n2;i++){
            if(flag1!=1){
                ans+=word1.charAt(i);
                if(i==n-1)flag1=1;
            }
            if(flag2!=1){
                ans+=word2.charAt(i);
                if(i==n1-1)flag2=1;
            }
        }
        return ans;
    }
}