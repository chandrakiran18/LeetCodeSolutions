class Solution {
    public int countSegments(String s) {
        int n=s.length();
        if(n==0)return 0;
        int count=0;
        int flag=0;
        if(s.charAt(0)==' ')flag=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==' '){
                if(s.charAt(i-1)!=' '){
                    count++;
                }
                flag=1;
            }else{
                flag=0;
            }
        }
        if(flag==0)count++;
        return count;
    }
}