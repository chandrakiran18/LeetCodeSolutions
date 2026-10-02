class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0;
        int j=0;
        int ans=0;
        int x=0;
        int n=s.length();
        int sum=0;
        if(s.equals(t))return n;
        while(j<=i && i<n ){
            sum+=Math.abs(s.charAt(i)-t.charAt(i));
            if(sum<=maxCost){
                ans=Math.max(ans,i-j+1);
            }else{
                while(sum>maxCost){
                    sum-=Math.abs(s.charAt(j)-t.charAt(j));
                    j++;
                }
                ans=Math.max(ans,i-j+1);
            }
            i++;
        }
        return ans;
    }
}