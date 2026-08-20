class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=k-nums[i];
            if(map.getOrDefault(x,0)>0){
                count++;
                map.put(x,map.getOrDefault(x,0)-1);
            }else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
}