class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=nums[0];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]!=l){
                ans.add(l);
                l++;
                i--;
            }else{
                l++;
            }
        }
        return ans;
    }
}