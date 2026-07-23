class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i>0 && i<10){
                ans.add(i);
                continue;
            }
            int temp=i;
            boolean flag=true;
            while(temp!=0){
                int rem=temp%10;
                if(rem==0 || i%rem!=0){
                    flag=false;
                    break;
                }
                temp/=10;
            }
            if(flag){
                ans.add(i);
            }
        }
        return ans;
    }
}