class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long ans=0;
        int n=nums.size();
        long sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            sum+=nums.get(i);
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        if(map.size()>=m){
            ans=sum;
        }
        for(int i=k;i<n;i++){
            int x=nums.get(i);
            int y=nums.get(i-k);
            sum+=x;
            sum-=y;
            map.put(x,map.getOrDefault(x,0)+1);
            map.put(y,map.getOrDefault(y,0)-1);
            if(map.get(y)==0){
                map.remove(y);
            }
            if(map.size()>=m){
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}