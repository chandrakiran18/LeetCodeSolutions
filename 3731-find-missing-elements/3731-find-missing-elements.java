class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int curr=nums[i];
            int nxt=nums[i+1];
            while(curr+1<nxt){
                curr++;
                ans.add(curr);
            }
        }
        return ans;
    }
}