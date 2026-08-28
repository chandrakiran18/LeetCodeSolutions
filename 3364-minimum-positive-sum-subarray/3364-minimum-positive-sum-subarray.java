class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int[] pref=new int[n+1];
        for(int i=0;i<n;i++){
            pref[i+1]=pref[i]+nums.get(i);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int win=j-i+1;
                if(win<l || win>r)continue;
                int sum=pref[j+1]-pref[i];
                if(sum>0){
                    ans=Math.min(ans,sum);
                }
            }
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}