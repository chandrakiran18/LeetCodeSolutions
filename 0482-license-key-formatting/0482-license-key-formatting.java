class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ans=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='-'){
                sb.append(ch);
            }
        }
        String str=sb.toString().toUpperCase();
        int x=k;
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            ans.append(c);
            k--;
            if(i==0)break;
            if(k==0){
                ans.append("-");
                k=x;
            }
        }
        ans.reverse();
        return ans.toString();
    }
}