class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n=nums.length;
        int a=0;
        int actualSum=0;
        for(int x:nums){
            actualSum+=x;
            if(!set.contains(x)){
                set.add(x);
            }else{
                a=x;
            }
        }
        int exp=n*(n+1)/2;
        int b=exp-actualSum+a;
        return new int[]{a,b};
    }
}