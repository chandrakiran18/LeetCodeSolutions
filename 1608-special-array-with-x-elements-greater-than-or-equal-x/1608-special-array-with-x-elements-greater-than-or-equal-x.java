class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i<=nums[j]){
                    count=n-j;
                    break;
                }
            }
            if(i==count)return i;
        }
        return -1;
    }
}