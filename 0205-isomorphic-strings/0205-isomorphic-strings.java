class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] ascii1=new char[128];
        char[] ascii2=new char[128];
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(ascii1[a]==0){
                if(ascii2[b]==0){
                    ascii1[a]=b;
                    ascii2[b]=a;
                }
                else{
                    return false;
                }
            }
            else{
                if(ascii1[a]!=b)return false;
            }
        }
        return true;
    }
}