class Solution {
    public int maximumLengthSubstring(String s) {
        int ans=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        int n=s.length();
        int[] freq=new int[26];
        int len=0;
        while(j<n){
            char c=s.charAt(j);
            int ind=c-'a';
            freq[ind]++;
            if(freq[ind]<=2){
                len=j-i+1;
                ans=Math.max(ans,len);
            }else if(freq[ind]>2){
                while(s.charAt(i)!=c){
                    freq[s.charAt(i)-'a']--;
                    i++;
                }
                freq[s.charAt(i)-'a']--;
                i++;
                len=j-i+1;
                ans=Math.max(ans,len);
            }
            j++;
        }
        return ans;
    }
}