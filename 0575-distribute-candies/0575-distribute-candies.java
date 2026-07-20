class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        int n=candyType.length;
        for(int x:candyType){
            set.add(x);
        }
        int ans=Math.min(n/2,set.size());
        return ans;
    }
}