class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        char[] c=s.substring(0,n/2).toCharArray();
        Arrays.sort(c);
        for(char ch:c){
            sb.append(ch);
        }
        if(n%2!=0){
            sb.append(s.charAt(n/2));
        }
        for(int i=n/2-1;i>=0;i--){
            sb.append(c[i]);
        }
        return sb.toString();
    }
}