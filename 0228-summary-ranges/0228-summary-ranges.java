class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int n=nums.length;
        if(n==0){
            return ans;
        }
        int st=nums[0];
        for(int i=1;i<=n;i++){
            if(i<n && nums[i]==nums[i-1]+1)continue;
            int end=nums[i-1];
            if(st==end){
                ans.add(String.valueOf(st));
            }else{
                ans.add(st+"->"+end);
            }
            if(i<n){
                st=nums[i];
            }
        }
        return ans;
    }
}