class Solution {
    public long sumAndMultiply(int n) {
        String num=String.valueOf(n);
        String str="";
        long ans=0;
        for(char c:num.toCharArray()){
            if(c!='0'){
                str+=c;
            }
        }
        if(str.length()==0)return 0;
        long temp=Integer.parseInt(str);
        long sum=0;
        long temp2=temp;
        while(temp2!=0){
            long rem=temp2%10;
            sum+=rem;
            temp2/=10;
        }
        ans=temp*sum;
        return ans;
    }
}