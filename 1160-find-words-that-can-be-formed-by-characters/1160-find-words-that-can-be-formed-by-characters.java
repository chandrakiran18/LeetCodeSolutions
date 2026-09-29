class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] fre=new int[26];
        int ans=0;
        for(char c:chars.toCharArray()){
            fre[c-'a']++;
        }
        for(String s:words){
            int[] temp=fre.clone();
            for(char c:s.toCharArray()){
                temp[c-'a']--;
            }
            boolean good=true;
            for(char c:s.toCharArray()){
                if(temp[c-'a']<0){
                    good=false;
                    break;
                }
            }
            if(good)ans+=s.length();
        }
        return ans;
    }
}