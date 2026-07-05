class Solution {
    public int similarPairs(String[] words) {
         int n=words.length;
         int count=0;
         for(int i=0;i<n-1;i++){
            String curr=words[i];
            char[] len1=new char[26];
            for(char c:curr.toCharArray()){
                len1[c-'a']++;
            }
            for(int j=i+1;j<n;j++){
                int flag=0;
                String curr2=words[j];
                char[] len2=new char[26];
                for(char ch:curr2.toCharArray()){
                    len2[ch-'a']++;
                }
                for(int k=0;k<26;k++){
                    if(len1[k]==0 && len2[k]!=0){
                        flag=1;
                        break;
                    }
                    else if(len1[k]!=0 && len2[k]==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    count++;
                }
            }
         }
         return count;
    }
}