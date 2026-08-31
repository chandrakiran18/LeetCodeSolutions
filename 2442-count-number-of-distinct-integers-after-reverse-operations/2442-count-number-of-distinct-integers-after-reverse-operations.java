class Solution {
    public int countDistinctIntegers(int[] nums) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
            int rev=0;
            while(num!=0){
                int rem=num%10;
                rev*=10;
                rev+=rem;
                num/=10;
            }
            set.add(rev);
        }
        return set.size();
    }
}