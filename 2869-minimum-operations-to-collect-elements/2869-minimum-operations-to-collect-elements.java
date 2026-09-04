class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int count=0;
        int ans=0;
        int n=nums.size();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=n-1;i>=0;i--){
            ans++;
            int x=nums.get(i);
            if(x<=k){
                map.put(x,map.getOrDefault(x,0)+1);
                if(map.get(x)==1)count++;
            }
            if(count==k)break;
        }
        return ans;
    }
}