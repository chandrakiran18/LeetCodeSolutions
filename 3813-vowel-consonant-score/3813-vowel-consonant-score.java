class Solution {
    boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int vowelConsonantScore(String s) {
        int vowel=0;
        int conso=0;
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                vowel++;
            }else{
                if(c>=97 && c<=122){
                    conso++;
                }
            }
        }
        int ans=0;
        if(conso>0){
            ans=(int)Math.floor(vowel/conso);
        }
        return ans;
    }
}