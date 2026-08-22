class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        HashSet<Integer> set=new HashSet<>();
        while(i<j){
            int sum=nums[i]+nums[j];
            set.add(sum);
            i++;
            j--;
        }
        return set.size();
    }
}