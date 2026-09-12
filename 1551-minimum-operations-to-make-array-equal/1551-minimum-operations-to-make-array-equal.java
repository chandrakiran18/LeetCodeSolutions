class Solution {
    public int minOperations(int n) {
        int[] arr=new int[n];
        int x=1;
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=x;
            sum+=x;
            x+=2;
        }
        int ans=0;
        for(int i=0;i<n/2;i++){
            ans+=n-arr[i];
        }
        return ans;
    }
}