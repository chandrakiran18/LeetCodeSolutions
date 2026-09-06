class Solution {
    public String greatestLetter(String s) {
        int[] freq=new int[26];
        int[] freq2=new int[26];
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                freq[c-'a']++;
            }
            else{
                freq2[c-'A']++;
            }
        }
        for(int i=25;i>=0;i--){
            if(freq[i]!=0 && freq2[i]!=0){
                return String.valueOf((char)(i+'A'));
            }
        }
        return "";
    }
}