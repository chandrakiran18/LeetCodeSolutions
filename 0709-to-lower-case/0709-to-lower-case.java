class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        String str="";
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                int ind=c-'A';
                c=(char)(97+ind);
            }
            str+=c;
        }
        return str;
    }
}