class Solution {
    public int numberOfSpecialChars(String word) {
        int ans=0;
        HashMap<Character,Integer> lower=new HashMap<>();
        HashMap<Character,Integer> upper=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c>='a'&&c<='z'){
                lower.put(c,i);
            }else{
                char x=(char)(c-'A'+'a');
                if(!upper.containsKey(x)){
                    upper.put(x,i);
                }
            }
        }
        for(char c:lower.keySet()){
            if(upper.containsKey(c) && lower.get(c)<upper.get(c)){
                ans++;
            }
        }
        return ans;
    }
}