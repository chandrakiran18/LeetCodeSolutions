class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i=k;
        while(i<=k*(nums.length+1)){
            int flag=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
            i+=k;
        }
        return 0;
    }
}