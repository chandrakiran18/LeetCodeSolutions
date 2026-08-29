class Solution {
    public int countEven(int num) {
        int x=num;
        int sum=0;
        while(x>0){
            int rem=x%10;
            sum+=rem;
            x/=10;
        }
        return sum%2==0?num/2:(num-1)/2;
    }
}