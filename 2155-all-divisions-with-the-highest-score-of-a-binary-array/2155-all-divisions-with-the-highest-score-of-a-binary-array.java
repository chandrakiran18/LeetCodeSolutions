class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int one=0;
        int zero=0;
        int n=nums.length;
        for(int num:nums){
            if(num==1)one++;
        }
        List<Integer> ans=new ArrayList<>(); 
        int highScore=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            int score=zero+one;
            if(score>highScore){
                highScore=score;
                ans.clear();
                ans.add(i);
            }else if(score==highScore){
                ans.add(i);
            }
            if(i<n){
                if(nums[i]==0){
                    zero++;
                }else{
                    one--;
                }
            }
        }
        return ans;
    }
}