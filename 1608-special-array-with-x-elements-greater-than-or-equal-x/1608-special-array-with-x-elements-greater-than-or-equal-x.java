class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<=n;i++){
            int count=0;
            int x=0;
            int y=n;
            while(x<y){
                int mid=x+(y-x)/2;
                if(nums[mid]>=i){
                    y=mid;
                }else{
                    x=mid+1;
                }
            }
            count=n-x;
            if(i==count)return i;
        }
        return -1;
    }
}