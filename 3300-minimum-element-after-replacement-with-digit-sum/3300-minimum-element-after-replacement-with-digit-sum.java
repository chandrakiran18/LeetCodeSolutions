class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            String s=String.valueOf(nums[i]);
            int val=0;
            for(char c:s.toCharArray()){
                val+=c-'0';
            }
            ans=Math.min(ans,val);
        }
        return ans;
    }
}