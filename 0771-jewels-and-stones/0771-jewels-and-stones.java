class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] freq=new int[26];
        int[] freq1=new int[26];
        int[] freq3=new int[26];
        int[] freq4=new int[26];
        int ans=0;
        for(char c:jewels.toCharArray()){
            if(c>='a' && c<='z'){
                freq[c-'a']+=1;
            }else{
                freq1[c-'A']+=1;
            }
        }
        for(char c:stones.toCharArray()){
            if(c>='a' && c<='z'){
                freq3[c-'a']+=1;
            }else{
                freq4[c-'A']+=1;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0 && freq3[i]!=0){
                ans+=freq3[i];
            }
            if(freq1[i]!=0 && freq4[i]!=0){
                ans+=freq4[i];
            }
        }
        return ans;
    }
}