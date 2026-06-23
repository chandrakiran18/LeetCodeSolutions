class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int diff=Integer.MAX_VALUE;
        int a=0,b=0,c=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==target)return target;
                    int currdiff;
                    if(sum>target){
                        currdiff=sum-target;
                    }else{
                        currdiff=target-sum;
                    }
                    if(currdiff<diff){
                        a=nums[i];
                        b=nums[j];
                        c=nums[k];
                        diff=currdiff;
                    }
                }
            }
        }
        return a+b+c;
    }
}