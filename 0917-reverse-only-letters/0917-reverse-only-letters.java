class Solution {
    public String reverseOnlyLetters(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        StringBuilder sb=new StringBuilder();
        while(i<n){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                while(!Character.isLetter(s.charAt(j)))j--;
                sb.append(s.charAt(j--));
            }else{
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }
}