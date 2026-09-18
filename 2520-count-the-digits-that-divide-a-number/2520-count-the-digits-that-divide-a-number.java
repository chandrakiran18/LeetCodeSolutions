class Solution {
    public int countDigits(int num) {
        int x=num;
        int ans=0;
        while(num>0){
            int rem=num%10;
            if(x%rem==0)ans++;
            num/=10;
        }
        return ans;
    }
}