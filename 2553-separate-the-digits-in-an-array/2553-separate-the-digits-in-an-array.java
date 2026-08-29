class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
            for(char c:s.toCharArray()){
                ans.add(c-'0');
            }
        }
        int n=ans.size();
        int []answer=new int[n];
        for(int i=0;i<n;i++){
            answer[i]=ans.get(i);
        }
        return answer;
    }
}