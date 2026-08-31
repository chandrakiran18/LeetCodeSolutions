class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dSum=0;
        for(int n:nums){
            sum+=n;
            while(n!=0){
                int rem=n%10;
                dSum+=rem;
                n/=10;
            }
        }
        return Math.abs(sum-dSum);
    }
}