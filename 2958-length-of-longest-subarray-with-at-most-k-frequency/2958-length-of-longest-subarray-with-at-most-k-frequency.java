class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left=0;
        int maxLen=0;
        for (int right=0;right<nums.length;right++) {
            int n=nums[right];
            map.put(n,map.getOrDefault(n,0)+1);
            while(map.get(n)>k){
                int leftVal=nums[left];
                map.put(leftVal,map.get(leftVal)-1);
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}