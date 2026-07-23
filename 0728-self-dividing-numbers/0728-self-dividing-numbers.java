class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp=i;
            int flag=0;
            while(temp!=0){
                int rem=temp%10;
                if(rem==0){
                    flag=1;
                    break;
                }
                if(i%rem!=0){
                    flag=1;
                    break;
                }
                temp/=10;
            }
            if(flag==0){
                ans.add(i);
            }
        }
        return ans;
    }
}