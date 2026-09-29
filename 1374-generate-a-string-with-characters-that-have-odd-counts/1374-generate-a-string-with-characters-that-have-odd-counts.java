class Solution {
    public String generateTheString(int n) {
        StringBuilder sb=new StringBuilder();
        if(n%2==0){
            for(int i=1;i<n;i++){
                sb.append('x');
            }
            sb.append('y');
        }else{
            if(n==1)return "x";
            for(int i=1;i<n-1;i++){
                sb.append('x');
            }
            sb.append('y');
            sb.append('z');
        }
        return sb.toString();
    }
}