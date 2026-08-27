class Solution {
    public boolean checkGoodInteger(int n) {
        int digit=0;
        int square=0;
        while(n!=0){
            int rem=n%10;
            digit+=rem;
            square+=rem*rem;
            n/=10;
        }
        return square-digit>=50;
    }
}