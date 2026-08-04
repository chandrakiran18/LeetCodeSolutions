class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int f=nums[0];
        int l=nums[n-1];
        List<Integer> ans=new ArrayList<>();
        for(int i=f;i<=l;i++){
            ans.add(i);
        }
        for(int x:nums){
            if(ans.contains(x)){
                ans.remove(Integer.valueOf(x));
            }
        }
        return ans;
    }
}