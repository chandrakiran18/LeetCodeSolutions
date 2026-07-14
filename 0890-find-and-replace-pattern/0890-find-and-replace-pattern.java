class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int n=words.length;
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].length()!=pattern.length())continue;
            char[] ascii1=new char[128];
            char[] ascii2=new char[128];
            int flag=0;
            for(int j=0;j<pattern.length();j++){
                char a=words[i].charAt(j);
                char b=pattern.charAt(j);
                if(ascii1[a]==0){
                    if(ascii2[b]==0){
                        ascii1[a]=b;
                        ascii2[b]=a;
                    }
                    else{
                        flag=1;
                        break;
                    }
                }
                else{
                    if(ascii1[a]!=b){
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0){
                ans.add(words[i]);
            }
        }
        return ans;
    }
}