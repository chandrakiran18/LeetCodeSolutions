class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq=new int[26];
        char ans=' ';
        for(char c:s.toCharArray()){
            freq[c-'a']+=1;
        }
        for(char c:t.toCharArray()){
            freq[c-'a']-=1;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==-1){
                ans=(char)(i+'a');
                return ans;
            }
        }
        return ans;
    }
}