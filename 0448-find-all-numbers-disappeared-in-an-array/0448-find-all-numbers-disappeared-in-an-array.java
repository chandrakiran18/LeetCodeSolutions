class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int val=1;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            while(val<nums[i]){
                ans.add(val);
                val++;
            }
            if(val==nums[i])val++;
        }
        while(val<=n){
            ans.add(val);
            val++;
        }
        return ans;
    }
}