class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ans=new ArrayList<>();
        long res=2;
        long sum=0;
        while(finalSum%2==0){
            sum+=res;
            ans.add(res);
            if(sum>finalSum){
                long diff=sum-finalSum;
                ans.remove(diff);
                break;
            }
            res+=2;
        }
        return ans;
    }
}