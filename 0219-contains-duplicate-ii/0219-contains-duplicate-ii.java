class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length==0||nums.length==1)return false;
        for(int i=0;i<nums.length-1;i++){
            int min=Math.min(nums.length-1,i+k);
            for(int j=i+1;j<=min;j++){
                if(nums[i]==nums[j]){
                    if(k>=Math.abs(i-j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}