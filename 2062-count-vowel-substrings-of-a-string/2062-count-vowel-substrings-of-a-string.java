class Solution {
    private boolean hasAll(String s){
        return s.indexOf('a')!=-1 && s.indexOf('e')!=-1 && s.indexOf('i')!=-1 && s.indexOf('o')!=-1 && s.indexOf('u')!=-1;
    }
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public int countVowelSubstrings(String word) {
        int n=word.length();
        int ans=0;
        for(int i=0;i<=n-5;i++){
            for(int j=i;j<n;j++){
                char c=word.charAt(j);
                if(!isVowel(c)){
                    break;
                }else{
                    int len=j-i+1;
                    if(len>=5){
                        if(hasAll(word.substring(i,j+1))){
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}