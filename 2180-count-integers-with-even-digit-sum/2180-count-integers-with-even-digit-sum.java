class Solution {
    public int countEven(int num) {
        int count=0;
        int x=num;
        int sum=0;
        while(x>0){
            int rem=x%10;
            sum+=rem;
            x/=10;
        }
        if(sum%2==0){
            count=num/2;
        }else{
            count=(num-1)/2;
        }
        return count;
    }
}