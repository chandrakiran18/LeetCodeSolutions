class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        long ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            int num=nums[i];
            sum+=num;
            map.put(num,map.getOrDefault(num,0)+1);
        }
        if(map.size()==k)ans=sum;
        for(int i=k;i<nums.length;i++){
            int num=nums[i];
            int rem=nums[i-k];
            sum+=num;
            sum-=rem;
            map.put(num,map.getOrDefault(num,0)+1);
            map.put(rem,map.getOrDefault(rem,0)-1);
            if(map.getOrDefault(rem,0)==0){
                map.remove(rem);
            }
            if(map.size()==k){
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}